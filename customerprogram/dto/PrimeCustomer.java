package customerprogram.dto;

public class PrimeCustomer extends Customer {

    private String comment;
    private String benefit;

    public PrimeCustomer(String name, char gender, String email, int birthYear) {
        super(name, gender, email, birthYear);
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }

}
