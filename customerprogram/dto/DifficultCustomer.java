package customerprogram.dto;

public class DifficultCustomer extends Customer {

    // 1. 멤버변수 추가.
    private String comment;
    private String benefit;
    private String complainContext; // 컴플레인에 대한 항목

    // 2. 생성자(부모 생성자)
    public DifficultCustomer(String name, char gender, String email, int birthYear) {
        super(name, gender, email, birthYear);
    }

    // 3. 메서드 : getter, setter
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // getComplainContext 수정...
    public String getComplainContext(String password) {
        if (password.equals("admin")) {
            return complainContext;
        }
        return "권한이 없습니다.";

    }

    // setComplainContext 수정...
    public void setComplainContext(String complainContext, String password) {
        if (password.equals("admin"))
            this.complainContext = complainContext;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

}