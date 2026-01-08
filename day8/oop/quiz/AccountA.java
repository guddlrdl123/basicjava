/*
(연습2)
  Account 클래스를 생성합니다. 
  Account 클래스에는 이름(name), 계좌번호(accountNumber), 계좌비밀번호(accountPassword), 예치금(balance), 이자(interest)를 속성(필드)를 가지고 있어요. 

  생성자는 이름, 계좌번호, 계좌 비밀번호 필드 만를 초기화 합니다.

  메서드는 저축(saveMoney()), 출금(withdrawMoney()), 예치금 확인(getBalance)으로 되어 있어요. 
*/
package day8.oop.quiz;

public class AccountA {
    String name;
    String accountNumber;
    String accountPassword;
    int balance;
    int interest;

    public void saveMoney(int money) {
        if (money > 0) { // 입력값 검증
            this.balance += money;
        } else {
            System.out.println("입금액 0이거나 미만되면 안 돼요.");
        }
    }

    public void withdrawMoney(int money) {
        // 출금시 패스워드 확인 필요하지만, 여기서는 생략
        if (money > 0 && this.balance >= money) { // 값 검증
            this.balance -= money;
        } else {
            System.out.println("금액이 부족합니다.");
        }
    }

    public long getBalance() {
        // 금액 확인시 패스워드 확인하지만, 여기서는 생략
        return balance;
    }
}
