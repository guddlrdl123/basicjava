package Day1;

public class Variables {
    public static void main(String[] args) {
        System.out.println("변수 이름과 키워드");
        /*
         * 키워드는 프로그램에서 이미 사용해서 예약된 단어들을 의미함.
         * ex) public, class, static, void, if, else, for, while ...
         * 자바 프로그램에서 실행하는 명령문 구문들이 대부분...
         * (중요) 키워드는 변수의 이름에 사용할 수 없음.
         */

        // 식별자(변수, 클래스, 메서드 이름) 규칙

        /*
         * 1. 대문자와 소문자를 구분하고, 길이 제한 없음.
         * 2. 식별자는 문자, 숫자 , 밑줄(_), $를 포함할 수 있음.
         * 단, _와 &는 로컬 시스템 규칙이 있거나 부득이 한 경우 아니면
         * 사용하지 않음. 한글로 식별자 사용 가능하지만, 영문으로..
         * 3. 식별자 시작은 문자, _, &로 시작이 가능함.(시작은 숫자x)
         * 4. 공백을 포함할 수 없음.
         * 5. 키워드 (명령문 등 예약어)는 사용할 수 없음.
         * 
         * ex) 3test(x), _test123(o), @123test(x), public(x)
         * Public(o), puBlic(o), num Data(x), num_data(o)
         */

        /*
         * 식별자를 이용한 이름 규칙(권장 사항)
         * - 클래스 이름/인터페이스 이름
         * 1) 명사 또는 형용사를 서술적으로 연결해서 사용.
         * 2) 첫 글자는 대문자로 표기
         * 3) 연결된 단어의 첫 글자도 대문자로 표기
         * 4) 이외는 소문자로 표기
         * 주의) "$" 는 내부 클래스에서 특별한 의미를 가져서 사용 권장X
         * ex) CustomerManger, CustomerData, PatientManager
         * 
         * 
         * - 메서드 이름
         * 1) 동사적 의미를 갖게 이름 작성
         * 2) 첫 글자는 소문자, 연결되는 단어의 첫글자는 대문자로 표기
         * 3) 나머지는 소문자로
         * 4) ** 메서드 이름 뒤에는 "()"가 뒤에 있어요. **
         * 5) "_"는 일반적으로 메서드 이름에서 사용X
         * ex) insertCustomerData(), deleteCustomerData()..
         * 
         * 
         * - 변수 이름
         * 1) 명사적 의미를 가지게 작성
         * 2) 첫글자 소문자, 연결 단어의 첫글자는 대문자로 표기
         * 3) 나머지는 대문자.
         * 4) "_"는 일반적으로 변수 이름에 사용X
         * ex) customerName, patientId, phoneNumber, ...
         */

        // 변수 - 데이터를 담는 주머니, 어떤 것을 담을지에 따라서 타입 결정
        // 선언 방식
        // 1. 기본 : <데이터 타입> <변수 이름>;
        // 2. 초기값 선언 : <변수 이름> = <데이터>;
        // 3. 기본 및 초기값 선언 같이 : <데이터 타입> <변수 이름> = <데이터>;

        // 변수 선언 예시
        int num; // 기본 선언
        num = 10; // 변수 초기값 설정 (초기화)
        // literal : 10, 20 과 같은 상수를 의미함.
        int num2 = 20; // 변수 선언과 초기화를 동시에...

        System.out.println("변수 num :" + num);
        System.out.println("변수 num2 :" + num2);

        // 상수형 변수의 선언.
        // 변수 선언 방식은 같으나, 변수명을 대문자로 사용.
        // int STATE = 0;

        // char 자료
        char a = 'A'; // 문자는 ''를 사용해서 표현.(한 글자)
        System.out.println("a : " + a); // 'A'
        int b = a; // char a의 값을 int b에 대입.
        System.out.println("b : " + b); // 65

        char c = 66; // 숫자를 char 타입에 대입.
        System.out.println("c : " + c); // 'B'
        int d = a + b; // a='A', b=65 => 'A' =65, // 65 + 65
        System.out.println("d : " + d);

    }
}
