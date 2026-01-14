package customerprogram.dto;

import java.util.Scanner;

import customerprogram.dto.Customer;
import customerprogram.dto.DifficultCustomer;
import customerprogram.dto.NormalCustomer;
import customerprogram.dto.PrimeCustomer;

public class CustomerManagerOOP2 {

    // 배열의 최대 크기를 지정하는 상수형 변수 선언.
    static final int MAX = 100;

    // 변수 선언
    // 저장 공간을 선언
    // 개별적 데이터를 배열로 사용했던 것을 정보 저장하는 객체 생성 작업 진행.
    static Customer[] customers = new Customer[MAX];

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
        System.out.print("고객 등급 (1.Prime, 2.Normal, 3.Difficult): ");
        int select = scanner.nextInt();
        System.out.print("이름 : ");
        String name = scanner.next(); // 문자열 입력. 구분자 " "(whitespace)를 기준.
        System.out.print("성별(M/F) : ");
        char gender = scanner.next().charAt(0);
        System.out.print("이메일 : ");
        String email = scanner.next();
        System.out.print("출생 년도 : ");
        int birthYear = scanner.nextInt();

        if (select == 1) {
            PrimeCustomer inputData = new PrimeCustomer(name, gender, email, birthYear);
            System.out.print("comment 입력 : ");
            inputData.setComment(scanner.nextLine());
            System.out.print("혜택 : ");
            inputData.setBenefit(scanner.nextLine());
            // 고객 정보 저장
            customers[count] = inputData;
        } else if (select == 2) {
            NormalCustomer inputData = new NormalCustomer(name, gender, email, birthYear);
            System.out.print("comment 입력 : ");
            inputData.setComment(scanner.nextLine());
            System.out.print("혜택 : ");
            inputData.setBenefit(scanner.nextLine());
            // 고객 정보 저장
            customers[count] = inputData;
        } else if (select == 3) {
            DifficultCustomer inputData = new DifficultCustomer(name, gender, email, birthYear);
            System.out.print("comment 입력 : ");
            inputData.setComment(scanner.nextLine());
            System.out.print("혜택 : ");
            inputData.setBenefit(scanner.nextLine());
            System.out.print("불만 사항 : ");
            inputData.setComplainContext(scanner.nextLine(), "admin");
            // 고객 정보 저장
            customers[count] = inputData;
        } else {
            System.out.println("고객 정보 입력에 실패했습니다.");
        }
    }

    public static void printCustomerData(int index) {
        if (customers[index] instanceof PrimeCustomer) {
            PrimeCustomer customer = (PrimeCustomer) customers[index];
            System.out.println("============= PrimeCustomer Info ===============");
            System.out.println("이름 : " + customer.getName());
            System.out.println("성별 : " + customer.getGender());
            System.out.println("이메일 : " + customer.getEmail());
            System.out.println("출생년도 : " + customer.getBirthYear());
            System.out.println("comment : " + customer.getComment());
            System.out.println("혜택 : " + customer.getBenefit());
            System.out.println("===========================================");
        } else if (customers[index] instanceof NormalCustomer) {
            NormalCustomer customer = (NormalCustomer) customers[index];
            System.out.println("============= NormalCustomer Info ===============");
            System.out.println("이름 : " + customer.getName());
            System.out.println("성별 : " + customer.getGender());
            System.out.println("이메일 : " + customer.getEmail());
            System.out.println("출생년도 : " + customer.getBirthYear());
            System.out.println("comment : " + customer.getComment());
            System.out.println("혜택 : " + customer.getBenefit());
            System.out.println("===========================================");
        } else if (customers[index] instanceof DifficultCustomer) {
            DifficultCustomer customer = (DifficultCustomer) customers[index];
            System.out.println("============= DifficultCustomer Info ===============");
            System.out.println("이름 : " + customer.getName());
            System.out.println("성별 : " + customer.getGender());
            System.out.println("이메일 : " + customer.getEmail());
            System.out.println("출생년도 : " + customer.getBirthYear());
            System.out.println("comment : " + customer.getComment());
            System.out.println("혜택 : " + customer.getBenefit());
            System.out.println("불만 사항 : " + customer.getComplainContext("admin"));
            System.out.println("===========================================");
        }
    }

    public static void updateCustomerData(int index) {
        if (customers[index] instanceof PrimeCustomer) {
            PrimeCustomer customer = (PrimeCustomer) customers[index];
            System.out.println("========== Update Customer Info ===========");
            System.out.printf("이름(%s) : ", customer.getName());
            customer.setName(scanner.next());
            System.out.printf("성별(%c) : ", customer.getGender());
            customer.setGender(scanner.next().charAt(0));
            System.out.printf("이메일(%s) : ", customer.getEmail());
            customer.setEmail(scanner.next());
            System.out.printf("출생년도(%d) : ", customer.getBirthYear());
            customer.setBirthYear(scanner.nextInt());
            System.out.printf("comment(%s) : \n", customer.getComment());
            System.out.print("수정할 내용 : ");
            customer.setComment("scanner.nextLine()");
            System.out.printf("혜택(%s) : \n", customer.getBenefit());
            System.out.print("수정할 내용 : ");
            customer.setBenefit("scanner.nextLine()");

        } else if (customers[index] instanceof NormalCustomer) {
            NormalCustomer customer = (NormalCustomer) customers[index];
            System.out.printf("이름(%s) : ", customer.getName());
            customer.setName(scanner.next());
            System.out.printf("성별(%c) : ", customer.getGender());
            customer.setGender(scanner.next().charAt(0));
            System.out.printf("이메일(%s) : ", customer.getEmail());
            customer.setEmail(scanner.next());
            System.out.printf("출생년도(%d) : ", customer.getBirthYear());
            customer.setBirthYear(scanner.nextInt());
            System.out.printf("comment(%s) : \n", customer.getComment());
            System.out.print("수정할 내용 : ");
            customer.setComment("scanner.nextLine()");
            System.out.printf("혜택(%s) : \n", customer.getBenefit());
            System.out.print("수정할 내용 : ");
            customer.setBenefit("scanner.nextLine()");
        } else if (customers[index] instanceof DifficultCustomer) {
            DifficultCustomer customer = (DifficultCustomer) customers[index];
            System.out.printf("이름(%s) : ", customer.getName());
            customer.setName(scanner.next());
            System.out.printf("성별(%c) : ", customer.getGender());
            customer.setGender(scanner.next().charAt(0));
            System.out.printf("이메일(%s) : ", customer.getEmail());
            customer.setEmail(scanner.next());
            System.out.printf("출생년도(%d) : ", customer.getBirthYear());
            customer.setBirthYear(scanner.nextInt());
            System.out.printf("comment(%s) : \n", customer.getComment());
            System.out.print("수정할 내용 : ");
            customer.setComment("scanner.nextLine()");
            System.out.printf("혜택(%s) : \n", customer.getBenefit());
            System.out.print("수정할 내용 : ");
            customer.setBenefit("scanner.nextLine()");
            System.out.printf("불만 사항(%s) : \n", customer.getComplainContext("admin"));
            System.out.print("수정할 내용 : ");
            customer.setComplainContext(scanner.nextLine(), "admin");
        }

        System.out.println("===========================================");
    }

    public static void deleteCustomerData(int index) {
        for (int i = index; i < count - 1; i++) {
            customers[index] = customers[i + 1];
        }
        count--;
    }

}
