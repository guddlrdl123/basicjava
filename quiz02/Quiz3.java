package quiz02;

public class Quiz3 {
    public static void main(String[] args) {
        /*
         * 문자열을 입력 받아서 해당 문자를 거꾸로 출력하세요.
         * 
         * ex) Hello -> olleH
         * 
         * hint. 문자열.charAt(index) 를 사용하면 문자열의 문자를 추출
         */
        // hint
        String text = "Hello";
        // 문자열의 길이를 알아오는 메서드(함수). String.length()
        System.out.println("text에 저장된 문자열 길이 : " + text.length());
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
