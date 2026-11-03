package question2;

/** Premium membership: gym access, personal training and spa facilities. */
public class PremiumMembership extends Membership {

    private static final double PERSONAL_TRAINING_FEE = 100.0;

    private boolean includePersonalTraining;

    // (d)(i) Default constructor
    public PremiumMembership() {
        super();
        this.includePersonalTraining = false;
    }

    // (d)(i) Parameterized constructor
    public PremiumMembership(String membershipID, String memberName, int durationMonths,
                             boolean includePersonalTraining) {
        super(membershipID, memberName, durationMonths);
        this.includePersonalTraining = includePersonalTraining;
    }

    public boolean isIncludePersonalTraining() { return includePersonalTraining; }
    public void setIncludePersonalTraining(boolean includePersonalTraining) {
        this.includePersonalTraining = includePersonalTraining;
    }

    // (d)(ii) Total Fee = (300 x durationMonths) + $100 personal training fee if included
    @Override
    public double calculateFee() {
        double fee = 300 * getDurationMonths();
        if (includePersonalTraining) {
            fee += PERSONAL_TRAINING_FEE;
        }
        return fee;
    }

    // (d)(iii) Display details including total fee and personal training status
    @Override
    public void displayMembershipDetails() {
        super.displayMembershipDetails();
        System.out.println("Personal Training Included: " + includePersonalTraining);
        System.out.println("Total Fee: $" + calculateFee());
    }
}
