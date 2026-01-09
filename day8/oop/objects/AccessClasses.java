package day8.oop.objects;

public class AccessClasses { // public 접근 제한자로 설정.

    // 변수
    public String publicAccess = "public 접근";
    protected String protectedAccess = "protected 접근";
    String defaultAccess = "default 접근";
    private String privateAccess = "private 접근";

    // 메서드
    public void test1() {
        System.out.println("public 사용 메서드 입니다.");
    }

    protected void test2() {
        System.out.println("protected 사용 메서드 입니다.");
    }

    void test3() {
        System.out.println("defalut 사용 메서드 입니다.");
    }

    private void test4() {
        System.out.println("private 사용 메서드 입니다.");
    }

    public String getPrivateString() {
        return this.privateAccess;
    }

    public String getDefaultString() {
        return this.defaultAccess;
    }
}

class Access1 {
    // default로 접근 제한자 설정됨.
}
