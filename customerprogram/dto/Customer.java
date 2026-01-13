package customerprogram.dto;

public class Customer {

    private String name;
    private char gender;
    private String email;
    private int birthYear;
    private String rank;

    public Customer() {
    }

    public Customer(String name, char gender, String email, int birthYear, String rank) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.birthYear = birthYear;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", birthYear=" + birthYear
                + ", rank=" + rank + "]";
    }
}
/*
 * class Vip extends Customer {
 * 
 * public Vip(String name, char gender, String email, int birthYear, String
 * rank) {
 * super(name, gender, email, birthYear, rank);
 * }
 * 
 * @Override
 * public String toString() {
 * return String.format("이름 : %s, 성별 : %s, 이메일 : %s, 출생년도 : %d, 회원등급: %s",
 * getName(), getGender(), getEmail(),
 * getBirthYear(), getRank());
 * }
 * 
 * }
 * 
 * class Normal extends Customer {
 * public Normal(String name, char gender, String email, int birthYear, String
 * rank) {
 * super(name, gender, email, birthYear, rank);
 * }
 * 
 * @Override
 * public String toString() {
 * return String.format("이름 : %s, 성별 : %s, 이메일 : %s, 출생년도 : %d, 회원등급: %s",
 * getName(), getGender(), getEmail(),
 * getBirthYear(), getRank());
 * }
 * }
 * 
 * class Caution extends Customer {
 * public Caution(String name, char gender, String email, int birthYear, String
 * rank) {
 * super(name, gender, email, birthYear, rank);
 * }
 * 
 * @Override
 * public String toString() {
 * return String.format("이름 : %s, 성별 : %s, 이메일 : %s, 출생년도 : %d, 회원등급: %s",
 * getName(), getGender(), getEmail(),
 * getBirthYear(), getRank());
 * }
 * }
 */