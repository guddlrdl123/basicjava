package day8.oop;

public class ClassEx9 {

    // 은닉(캡슐화)
    // 캡슐화 클래스에 접근 제한자를 이용한 데이터 처리를 의미함.
    // 접근을 통해서 특정 입려값에 대한 검증 및 보안 처리를 위해서 사용함.

    public static void main(String[] args) {

        // public과 같이 접근이 가능한 경우...
        MyData myBirth = new MyData();
        // 직접 접근(은닉 사용X)
        myBirth.year = 2025;
        myBirth.month = 2;
        myBirth.day = 30;

        System.out.printf("My birthday is %d월 %d일\n", myBirth.month, myBirth.day);

        MyData2 myBirth2 = new MyData2(2025, 1, 12);
        // myBirth2.day = 30; // private로 캡슐화한 경우 직접 접근 불가(**)
        myBirth2.setDay(1000);
        System.out.printf("My birthday is %d월 %d일\n", myBirth2.getMonth(), myBirth2.getDay());
        System.out.println("=====".repeat(10));

        // 은닉을 통해서 직접 값에 접근 x
        Account2 myAcc = new Account2("홍길동", "101-111011", "1234");

        // 현재 잔액
        System.out.println("현재 잔액 : " + myAcc.getBalance());
        myAcc.saveMoney(50000); // 50000원 입금
        System.out.println("입금 50000원 입금 후 잔액 : " + myAcc.getBalance());
        myAcc.withdrawMoney(12000);
        System.out.println("점심 12000원 출금 후 잔액 : " + myAcc.getBalance());
        System.out.println("현재 계좌 정보\n");
        System.out.println("계좌주 : " + myAcc.getName());
        System.out.println("계좌번호 : " + myAcc.getAccountNumber());
        System.out.println("현재 잔액 : " + myAcc.getBalance());

    }
}

// MyData 클래스(데이터 저장)
class MyData { // 생일
    // 1. 멤버 변수
    // 년도(year), 월(month), 일(day)을 변수로 생성. 데이터 타입은 int
    public int year;
    public int month;
    public int day;
}

class MyData2 {
    // 은닉(캡슐화 사용)
    // 1. 멤버 변수(private으로 클래스 내에 있는 메서드, 생성자, 변수만 접근 가능하게 설정)
    private int year;
    private int month;
    private int day;

    // 캡슐화를 사용하는 경우 생성자 또는 메서드를 통해서 값을 설정 또는 초기화를 해야 합니다.
    // 2. 생성자.
    MyData2() {
    }

    MyData2(int year, int month, int day) {
        // 값 검증 로직은 생성자에 구현하지 않아요. (메서드...)
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 3. 메서드(getter, setter 생성)
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0)
            this.year = 0;
        else
            this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 && month > 12)
            month = 1;
        else
            this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        // day?? 윤년은 생각하지 않습니다. 2월달은 28일까지만 가능.
        if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8
                || this.month == 10 || this.month == 12) {
            if (day < 1 | day > 31)
                day = 1;
            else
                this.day = day;
        } else if (this.month == 2) {
            if (day < 1 | day > 29)
                day = 1;
            else
                this.day = day;
        } else {
            if (day < 1 | day > 30)
                day = 1;
            else
                this.day = day;
        }
        this.day = day;
    }
}

// ==================================================================
class Account2 {
    private String name;
    private String accountNumber;
    private String accountPassword;
    private int balance; // 잔액

    // 생성자로 부터 초기화.
    Account2(String name, String accountNumber, String accountPassword) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
    }

    // 입금
    void saveMoney(int money) {
        if (money > 0) { // 입력값 검증
            this.balance += money;
        } else {
            System.out.println("입금액 0이거나 미만되면 안 돼요.");
        }
    }

    // 출금
    void withdrawMoney(int money) {
        // 출금시 패스워드 확인 필요하지만, 여기서는 생략
        if (money > 0 && this.balance >= money) { // 값 검증
            this.balance -= money;
        } else {
            System.out.println("금액이 부족합니다.");
        }
    }

    long getBalance() {
        // 금액 확인시 패스워드 확인하지만, 여기서는 생략
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}