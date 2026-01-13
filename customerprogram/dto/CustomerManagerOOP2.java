/*
연습2
customerprogram.dto에 있는 customer라는 클래스

정보 저장 목적으로 하는 클래스.

Customer 클래스의 하위 클래스로 다음 클래스를 생성하고,
1. 고급
2. 일반
3. 주의(관심)

CustomerManager에서 해당 클래스에 속한 정보를 찾아서 볼 수 있게 만들어 보세요.
** 배열에서 검색하는 방법은 순차적으로 값을 비교해 나가는 방법. (반복문)

메뉴 추가 및 수정
입력값 처리를 수정. (하위 정보 형태로 받아서 처리할 수 있게 수정)
하위 클래스별 정보 출력.
*/

package customerprogram.dto;

import java.util.Scanner;
import customerprogram.dto.Customer;

public class CustomerManagerOOP2 {
    // 배열의 최대 크기를 지정하는 상수형 변수 선언.
    static final int MAX = 100;

    // 변수 선언
    // 저장 공간을 선언
    // 개별적 데이터를 배열로 사용했던 것을 정보 저장하는 객체 생성 작업 진행.
    public static Customer[] customers = new Customer[MAX];

    // 배열의 인덱스 선언이 필요함.
    static int index = -1;
    // 왜? 배열은 0부터 시작하기 때문에.. 최소 인덱스 -1이어야 함.

    // 배열에 저장된 데이터의 갯수 확인할 수 있는 변수 선언.
    // 이 값을 활용할 수 있음.
    static int count = 0;
    static String sInfo = "";
    static int iInfo = 0;

    // 사용자 입력 받는 툴인 Scanner를 생성.
    static Scanner scanner = new Scanner(System.in, "cp949");

    public static void main(String[] args) {

        while (true) {
            System.out.printf("\n[INFO] 고객 수 : %d, 인덱스 : %d\n", count, index);
            System.out.println("메뉴를 입력하세요.");
            System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate, "
                    + "(D)elete, (S)erch, (Q)uit");
            System.out.print("메뉴 입력 : ");
            String menu = scanner.next();
            menu = menu.toLowerCase(); // 영문자... 대문자를 소문자로 변환

            switch (menu.charAt(0)) {
                case 'i':
                    System.out.println("고객 정보 입력을 시작합니다.");
                    if (count >= MAX) {
                        System.out.println("더 이상 저장할 수 없어요.");
                    } else {
                        insertCustomerData();
                        count++;
                    }
                    break;
                case 'p':
                    System.out.println("이전 데이터를 출력합니다.");
                    if (index <= 0) {
                        System.out.println("이전 데이터가 존재하지 않습니다.");
                    } else {
                        index--;
                        printCustomerData(index);
                    }
                    break;
                case 'n':
                    System.out.println("다음 데이터를 출력합니다.");
                    if (index >= count - 1) {
                        System.out.println("다음 데이터가 존재하지 않습니다.");
                    } else {
                        index++;
                        printCustomerData(index);
                    }

                    break;
                case 'c':
                    System.out.println("현재 데이터를 출력합니다.");
                    if ((index >= 0) && (index < count)) {
                        printCustomerData(index);
                    } else {
                        System.out.println("출력할 데이터가 선택되지 않았습니다.");
                    }
                    break;
                case 'u':
                    System.out.println("데이터를 수정합니다.");
                    if ((index >= 0) && (index < count)) {
                        updateCustomerData(index);
                    } else {
                        System.out.println("수정할 데이터를 선택하지 않았습니다.");
                    }
                    break;
                case 'd':
                    System.out.println("데이터를 삭제합니다.");
                    if ((index >= 0) && (index < count)) {
                        System.out.println(index + "번째 데이터를 삭제합니다.");
                        // 삭제 로직(배열)
                        deleteCustomerData(index);
                    } else {
                        System.out.println("삭제할 데이터를 선택하지 않았습니다.");
                    }
                    break;
                case 's':
                    System.out.println("검색하실 정보를 입력해 주세요");
                    System.out.println("(이름, 성별, 이메일, 출생년도, 등급)");
                    String serch = scanner.next();
                    if (serch == "이름") {
                        sInfo = scanner.nextLine();
                        for (int i = 0; i <= count; i++) {
                            if (sInfo == customers[i].getName()) {
                                printCustomerData(i);
                            }
                        }
                    } else
                        System.out.println("입력하신 정보가 없습니다.");

                    if (serch == "성별") {
                        sInfo = scanner.nextLine();
                        for (int i = 0; i <= count; i++) {
                            if (sInfo.equals(String.valueOf(customers[i].getGender()))) {
                                printCustomerData(i);
                            }
                        }

                    } else
                        System.out.println("입력하신 정보가 없습니다.");

                    if (serch == "이메일") {
                        sInfo = scanner.nextLine();
                        for (int i = 0; i <= count; i++) {
                            if (sInfo == customers[i].getEmail()) {
                                printCustomerData(i);
                            }
                        }

                    } else
                        System.out.println("입력하신 정보가 없습니다.");
                    if (serch == "출생년도") {
                        iInfo = scanner.nextInt();
                        for (int i = 0; i <= count; i++) {
                            if (iInfo == customers[i].getBirthYear()) {
                                printCustomerData(i);
                            } else
                                System.out.println("입력하신 정보가 없습니다.");
                        }

                    } else if (serch == "회원등급") {
                        sInfo = scanner.nextLine();
                        for (int i = 0; i <= count; i++) {
                            if (sInfo == customers[i].getRank()) {
                                printCustomerData(i);
                            } else
                                System.out.println("입력하신 정보가 없습니다.");
                        }

                    } else {
                        System.out.println("메뉴를 잘못 입력했습니다.");
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

    public static void insertCustomerData() {
        System.out.print("이름 : ");
        String name = scanner.next(); // 문자열 입력. 구분자 " "(whitespace)를 기준.
        System.out.print("성별(M/F) : ");
        char gender = scanner.next().charAt(0);
        System.out.print("이메일 : ");
        String email = scanner.next();
        System.out.print("출생 년도 : ");
        int birthYear = scanner.nextInt();
        System.out.println("회원 등급 : ");
        String rank = scanner.next();

        // 고객 정보 저장
        customers[count].setName(name);
        customers[count].setGender(gender);
        customers[count].setEmail(email);
        customers[count].setBirthYear(birthYear);
        customers[count].setRank(rank);
    }

    public static void printCustomerData(int index) {
        System.out.println("============= Customer Info ===============");
        System.out.println("이름 : " + customers[index].getName());
        System.out.println("성별 : " + customers[index].getGender());
        System.out.println("이메일 : " + customers[index].getEmail());
        System.out.println("출생년도 : " + customers[index].getBirthYear());
        System.out.println("회원 등급 : " + customers[index].getRank());
        System.out.println("===========================================");
    }

    public static void updateCustomerData(int index) {
        System.out.println("========== Update Customer Info ===========");
        System.out.printf("이름(%s) : ", customers[index].getName());
        customers[index].setName(scanner.next());
        System.out.printf("성별(%c) : ", customers[index].getGender());
        customers[index].setGender(scanner.next().charAt(0));
        System.out.printf("이메일(%s) : ", customers[index].getEmail());
        customers[index].setEmail(scanner.next());
        System.out.printf("출생년도(%d) : ", customers[index].getBirthYear());
        customers[index].setBirthYear(scanner.nextInt());
        System.out.printf("회원 등급(%d) : ", customers[index].getRank());
        customers[index].setRank(scanner.next());
        System.out.println("===========================================");
    }

    public static void deleteCustomerData(int index) {
        for (int i = index; i < count - 1; i++) {
            customers[index] = customers[i + 1];
        }
        count--;
    }

}