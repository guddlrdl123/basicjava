package day6.method;

import java.util.Scanner;

// 연습 2
// 만들어진 CustomerManager 프로그램은 main()에 모든 코드가 작성되어 있습니다.
// 해당코드를 메서드를 이용하여 간략하게 표현할 수 있게 수정해 보세요.
// hint. 1)메서드는 기능별로 구현
//       2) 중복되는 부분(반복 코드)은 메서드 하나로 구현하면 좋아요.
// 추가 메서드 : insertCustomerData()
// 삭제 메서드 : deleteCustomerData()
// 수정 메서드 : updateCustomerData()
// 출력 메서드 : printCustomerData()

public class PracEx2 {
    static Scanner sc = new Scanner(System.in, "cp949");

    static int index = -1;
    static int count = 0;

    static final int MAX = 100;
    static String[] nameList = new String[MAX];
    static char[] genderList = new char[MAX];
    static String[] emailList = new String[MAX];
    static int[] birthYearList = new int[MAX];

    public static void main(String[] args) {
        while (true) {
            // for (int i = 0; i < count; i++)
            // System.out.println(nameList[i]);
            System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
            System.out.println("메뉴를 입력하세요.");
            System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, (D)elete, (Q)uit");
            System.out.print("메뉴 입력 : ");
            String menu = sc.next();
            menu = menu.toLowerCase();

            switch (menu.charAt(0)) {

                case 'i':
                    insertCustomerData();
                    break;

                case 'p':
                    System.out.println("이전 데이터를 출력합니다.");
                    if (index <= 0) {
                        System.out.println("이전 데이터가 존재하지 않습니다.");
                    } else {
                        index--;
                        printCustomerData();
                    }
                    break;

                case 'n':
                    System.out.println("다음 데이터를 출력합니다.");
                    if (index >= count - 1) {
                        System.out.println("다음 데이터가 존재하지 않습니다.");
                    } else {
                        index++;
                        printCustomerData();
                    }
                    break;

                case 'c':
                    System.out.println("현재 데이터를 출력합니다.");
                    if ((index >= 0) && (index < count)) {
                        printCustomerData();
                    } else {
                        System.out.println("출력할 데이터가 선택되지 않았습니다.");
                    }
                    break;

                case 'u':
                    updateCustomerData();
                    break;

                case 'd':
                    deleteCustomerData();
                    break;

                case 'q':
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    // 프로세스(프로그램) 종료
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }

    // ==========================================================================================================================

    // 정보 입력
    public static void insertCustomerData() {
        if (count >= MAX) {
            System.out.println("더 이상 저장할 수 없습니다.");
        } else {
            System.out.println("고객 정보 입력을 시작합니다.");
            System.out.print("이름 : ");
            String name = sc.next(); // 문자열 입력. 구분자 " "(whitespace)를 기준
            System.out.print("성별 : ");
            char gender = sc.next().charAt(0);
            System.out.print("이메일 : ");
            String email = sc.next();
            System.out.print("출생년도 : ");
            int birthYear = sc.nextInt();

            // 고객 정보 저장
            nameList[count] = name;
            genderList[count] = gender;
            emailList[count] = email;
            birthYearList[count] = birthYear;

            count++;
        }
    }

    public static void printCustomerData() {
        System.out.println("================== Info ==================");
        System.out.println("이름 : " + nameList[index]);
        System.out.println("성별 : " + genderList[index]);
        System.out.println("이메일 : " + emailList[index]);
        System.out.println("출생년도 : " + birthYearList[index]);
        System.out.println("==========================================");

    }

    // 이전 데이터 출력
    /*
     * public static void previousPrintCustomerData() {
     * System.out.println("이전 데이터를 출력합니다.");
     * if (index <= 0) {
     * System.out.println("이전 데이터가 존재하지 않습니다.");
     * } else {
     * index++;
     * System.out.println("=============== Previous Info ===============");
     * System.out.println("이름 : " + nameList[index]);
     * System.out.println("성별 : " + genderList[index]);
     * System.out.println("이메일 : " + emailList[index]);
     * System.out.println("출생년도 : " + birthYearList[index]);
     * System.out.println("=========================================");
     * }
     * }
     */

    // 다음 데이터 출력
    /*
     * public static void nextPrintCustomerData() {
     * System.out.println("다음 데이터를 출력합니다.");
     * if (index >= count - 1) {
     * System.out.println("다음 데이터가 존재하지 않습니다.");
     * } else {
     * index--;
     * System.out.println("=============== Next Info ===============");
     * System.out.println("이름 : " + nameList[index]);
     * System.out.println("성별 : " + genderList[index]);
     * System.out.println("이메일 : " + emailList[index]);
     * System.out.println("출생년도 : " + birthYearList[index]);
     * System.out.println("=========================================");
     * }
     * }
     */

    // 현재 데이터 출력
    /*
     * public static void currentPrintCustomerData() {
     * System.out.println("현재 데이터를 출력합니다.");
     * if ((index >= 0) && (index < count)) {
     * System.out.println("=============== Current Info ===============");
     * System.out.println("이름 : " + nameList[index]);
     * System.out.println("성별 : " + genderList[index]);
     * System.out.println("이메일 : " + emailList[index]);
     * System.out.println("출생년도 : " + birthYearList[index]);
     * System.out.println("=========================================");
     * } else {
     * System.out.println("출력할 데이터가 선택되지 않았습니다.");
     * }
     * }
     */

    // 데이터 수정
    public static void updateCustomerData() {
        System.out.println("데이터를 수정합니다.");
        if ((index > 0) && (index < count)) {
            System.out.println("=============== Update Customer Info ===============");
            System.out.printf("이름(%s) : ", nameList[index]);
            nameList[index] = sc.next();
            System.out.printf("성별(%c) : ", genderList[index]);
            genderList[index] = sc.next().charAt(0);
            System.out.printf("이메일(%s) : ", emailList[index]);
            emailList[index] = sc.next();
            System.out.printf("출생년도(%d) : ", birthYearList[index]);
            birthYearList[index] = sc.nextInt();

        } else {
            System.out.println("수정할 데이터를 선택하지 않았습니다.");
        }
    }

    // 데이터 삭제
    public static void deleteCustomerData() {
        if ((index >= 0) && (index < count)) {
            System.out.println(index + "번째 데이터를 삭제합니다.");
            // 삭제 로직(배열)
            for (int i = index; i < count - 1; i++) {
                nameList[index] = nameList[i + 1];
                genderList[index] = genderList[i + 1];
                emailList[index] = emailList[i + 1];
                birthYearList[index] = birthYearList[i + 1];
            }
            count--;
        }
        System.out.println("데이터를 삭제합니다.");
    }
}
