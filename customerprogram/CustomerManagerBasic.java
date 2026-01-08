package customerprogram;

import java.util.Scanner;

public class CustomerManagerBasic {

    // 배열의 최대 크기를 지정하는 상수형 변수 선언.
    static final int MAX = 100;

    // 변수 선언
    // 저장 공간을 선언
    static String[] nameList = new String[MAX];
    static char[] genderList = new char[MAX];
    static String[] emailList = new String[MAX];
    static int[] birthYearList = new int[MAX];

    // 배열의 인덱스 선언이 필요함.
    static int index = -1;
    // 왜? 배열은 0부터 시작하기 때문에.. 최소 인덱스 -1이어야 함.

    // 배열에 저장된 데이터의 갯수 확인할 수 있는 변수 선언.
    // 이 값을 활용할 수 있음.
    static int count = 0;

    // 사용자 입력 받는 툴인 Scanner를 생성.
    static Scanner scanner = new Scanner(System.in, "cp949");

    public static void main(String[] args) {

        while (true) {
            System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
            System.out.println("메뉴를 입력하세요.");
            System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, "
                    + "(D)elete, (Q)uit");
            System.out.print("메뉴 입력 : ");
            String menu = scanner.next();
            menu = menu.toLowerCase(); // 영문자... 대문자를 소문자로 변환

            switch (menu.charAt(0)) {
                case 'i':
                    if (count >= MAX) {
                        System.out.println("더 이상 저장할 수 없어요.");
                    } else {
                        System.out.println("고객 정보 입력을 시작합니다.");
                        System.out.print("이름 : ");
                        String name = scanner.next(); // 문자열 입력. 구분자 " "(whitespace)를 기준.
                        System.out.print("성별(M/F) : ");
                        char gender = scanner.next().charAt(0);
                        System.out.print("이메일 : ");
                        String email = scanner.next();
                        System.out.print("출생 년도 : ");
                        int birthYear = scanner.nextInt();

                        // 고객 정보 저장
                        nameList[count] = name;
                        genderList[count] = gender;
                        emailList[count] = email;
                        birthYearList[count] = birthYear;
                        count++;
                    }

                    break;
                case 'p':
                    System.out.println("이전 데이터를 출력합니다.");
                    if (index <= 0) {
                        System.out.println("이전 데이터가 존재하지 않습니다.");
                    } {
                    index--;
                    System.out.println("============= Previous Info ===============");
                    System.out.println("이름 : " + nameList[index]);
                    System.out.println("성별 : " + genderList[index]);
                    System.out.println("이메일 : " + emailList[index]);
                    System.out.println("출생년도 : " + birthYearList[index]);
                    System.out.println("===========================================");
                }

                    break;
                case 'n':
                    System.out.println("다음 데이터를 출력합니다.");
                    if (index >= count - 1) {
                        System.out.println("다음 데이터가 존재하지 않습니다.");
                    } else {
                        index++;
                        System.out.println("============= Next Info ===============");
                        System.out.println("이름 : " + nameList[index]);
                        System.out.println("성별 : " + genderList[index]);
                        System.out.println("이메일 : " + emailList[index]);
                        System.out.println("출생년도 : " + birthYearList[index]);
                        System.out.println("===========================================");
                    }

                    break;
                case 'c':
                    System.out.println("현재 데이터를 출력합니다.");
                    if ((index >= 0) && (index < count)) {
                        System.out.println("============= Current Info ===============");
                        System.out.println("이름 : " + nameList[index]);
                        System.out.println("성별 : " + genderList[index]);
                        System.out.println("이메일 : " + emailList[index]);
                        System.out.println("출생년도 : " + birthYearList[index]);
                        System.out.println("===========================================");
                    } else {
                        System.out.println("출력할 데이터가 선택되지 않았습니다.");
                    }
                    break;
                case 'u':
                    System.out.println("데이터를 수정합니다.");
                    if ((index >= 0) && (index < count)) {
                        System.out.println("========== Update Customer Info ===========");
                        System.out.printf("이름(%s) : ", nameList[index]);
                        nameList[index] = scanner.next();
                        System.out.printf("성별(%c) : ", genderList[index]);
                        genderList[index] = scanner.next().charAt(0);
                        System.out.printf("이메일(%s) : ", emailList[index]);
                        emailList[index] = scanner.next();
                        System.out.printf("출생년도(%d) : ", birthYearList[index]);
                        birthYearList[index] = scanner.nextInt();
                    } else {
                        System.out.println("수정할 데이터를 선택하지 않았습니다.");
                    }
                    break;
                case 'd':
                    System.out.println("데이터를 삭제합니다.");
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
                    break;
                case 'q':
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    // 프로세스(프로그램) 종료
                    System.exit(0);
                    break;
                default:
                    System.out.println("메뉴를 잘 못 입력했습니다.");
                    break;
            }
        }

    }

}