package Day2;

public class TextualTypeExample {
    public static void main(String[] args) {
        /*
         * "\n" - 줄바꿈
         * "\t" - 탭간격(8- 영문)
         * "\b" - 백 스페이스(뒤로 이동)
         * "\\" - 백 슬래시 (그냥 백 슬래시만 쓰고 싶을 때)
         * "\'" - 싱글 쿼터 "'"는 단어를 표현할 때 사용하는 기호.
         * "\"" - 더블 쿼터 """는 문자열을 표현할 때 사용하는 기호.
         */
        char one = 'A';
        char tab = '\t';
        char ga = '\uAC00'; // '가'
        String text = "\uD604\uC218"; // 현수

        System.out.printf("%c, %c, %c, %s\ntest word\bld!!", one, tab, ga, text);
        System.out.println("\n오늘 날씨는 좋아요, \"덕우씨\"");

    }
}
