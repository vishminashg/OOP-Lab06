package question2;

/** Basic membership: gym access only. */
public class BasicMembership extends Membership {

    private boolean hasGymAccess;

    // (c)(i) Default constructor
    public BasicMembership() {
        super();
        this.hasGymAccess = false;
    }

    // (c)(i) Parameterized constructor
    public BasicMembership(String membershipID, String memberName, int durationMonths,
                           boolean hasGymAccess) {
        super(membershipID, memberName, durationMonths);
        this.hasGymAccess = hasGymAccess;
    }

    public boolean isHasGymAccess() { return hasGymAccess; }
    public void setHasGymAccess(boolean hasGymAccess) { this.hasGymAccess = hasGymAccess; }

    // (c)(ii) Total Fee = 200 x durationMonths
    @Override
    public double calculateFee() {
        return 200 * getDurationMonths();
    }

    // (c)(iii) Display details including total fee and gym access status
    @Override
    public void displayMembershipDetails() {
        super.displayMembershipDetails();
        System.out.println("Gym Access Included: " + hasGymAccess);
        System.out.println("Total Fee: $" + calculateFee());
    }
}
