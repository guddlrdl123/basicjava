package interfaces;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/*
public @interface 어노테이션명 {
    자료형 요소명() [default 기본값];
}
*/

// 사용자 어노테이션 지정.
// @Retention : 어노테이션의 범위 설정. 어디까지 영향을 줄지 결정
// RetentionPolicy -> CLASS(클래스에), RUNTIME(실행 중에), RESOURCE(리소스에)
@Retention(RetentionPolicy.RUNTIME)
@interface UserAnnot {
    String value();

    int number() default 5;
}

// 클래스 -> UserClass
class UserClass {
    // 1. 멤버 변수 (X)

    // 2. 생성자 (X)

    // 3. 메서드
    // UserAnnot에 있는 String vlaue()의 값을 초기화... 아래처럼 사용
    @UserAnnot(value = "A") // value = "A", number = 5 (default 값)
    public void methodA(int num, int num2) {
        System.out.println("methodA() 실행");
    }

    @UserAnnot(value = "B", number = 10) // value = "A", number = 10
    public void methodB(int num, int num2) {
        System.out.println("methodB() 실행");
    }
}

public class AnnotationEx {
    public static void main(String[] args) throws Exception {
        Method method[] = UserClass.class.getDeclaredMethods(); // *메서드 개수만큼 배열 만들어서 넣음*

        for (int i = 0; i < method.length; i++) {
            String methodName = method[i].getName(); // 메서드이름
            UserAnnot annot = method[i].getAnnotation(UserAnnot.class);
            System.out.println(methodName + "의 어노테이션");
            System.out.println("value : " + annot.value()); // 어노테이션에 지정된 값을 이용한 동작 구현.
            System.out.println("number : " + annot.number());
            System.out.println();

            method[i].invoke(new UserClass(), 10, 20); // 메서드를 실행.
        }

    }
}