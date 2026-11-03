package question2;

/** SE1020 Lab 06 - Q2: Fitness Center Membership Management System (base class). */
public class Membership {

    private String membershipID;
    private String memberName;
    private int durationMonths;

    // (a)(i) Default constructor
    public Membership() {
        this("N/A", "N/A", 0);
    }

    // (a)(i) Parameterized constructor
    public Membership(String membershipID, String memberName, int durationMonths) {
        this.membershipID = membershipID;
        this.memberName = memberName;
        this.durationMonths = durationMonths;
    }

    public String getMembershipID() { return membershipID; }
    public void setMembershipID(String membershipID) { this.membershipID = membershipID; }

    public String getMemberName() { return memberName; }
    public void setMemberName(String memberName) { this.memberName = memberName; }

    public int getDurationMonths() { return durationMonths; }
    public void setDurationMonths(int durationMonths) { this.durationMonths = durationMonths; }

    // (a)(ii) Print basic membership information
    public void displayMembershipDetails() {
        System.out.println("Membership ID: " + membershipID);
        System.out.println("Member Name: " + memberName);
        System.out.println("Duration: " + durationMonths + " months");
    }

    // (b)(i) Base membership fee
    public double calculateFee() {
        return 5000.00;
    }

    // (b)(ii) Fee after discount (uses the fee from calculateFee())
    public double calculateFee(double discountPercentage) {
        double fee = calculateFee();
        return fee - (fee * discountPercentage / 100);
    }
}
