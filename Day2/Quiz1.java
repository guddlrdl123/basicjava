package Day2;

public class Quiz1 {
    public static void main(String[] args) {
        String name1 = "김동완";
        String name2 = "서지수";
        String name3 = "이지은";

        String tell1 = "010-1111-1111";
        String tell2 = "010-1234-5678";
        String tell3 = "010-2525-2345";

        int age1 = 38;
        int age2 = 24;
        int age3 = 25;

        int money1 = 20000;
        int money2 = 30000;
        int money3 = 50000;

        int total = money1 + money2 + money3;

        System.out.println("               #### 회비 정보 ####                 ");
        System.out.println("==================================================");
        System.out.println("이름\t나이\t전화번호\t  회비");
        System.out.println("==================================================");
        System.out.printf("%s\t %d\t %s\t  \\%,d\n", name1, age1, tell1, money1);
        System.out.printf("%s\t %d\t %s\t  \\%,d\n", name2, age2, tell2, money2);
        System.out.printf("%s\t %d\t %s\t  \\%,d\n", name3, age3, tell3, money3);
        System.out.println("--------------------------------------------------");
        System.out.printf("총합계                           \\%,d\n", total);
        System.out.println("==================================================");

    }
}
