package question2;

public class MembershipApp {
    public static void main(String[] args) {

        // (e)(i) BasicMembership using the default constructor
        BasicMembership basic = new BasicMembership();
        System.out.println("=== Basic Membership (Default Constructor) ===");
        basic.displayMembershipDetails();
        System.out.println("Base Fee: $" + basic.calculateFee());
        System.out.println("Discounted Fee (10%): $" + basic.calculateFee(10));
        System.out.println();

        // (e)(ii) PremiumMembership using the parameterized constructor
        PremiumMembership premium = new PremiumMembership("PM101", "Kasun Silva", 6, true);
        System.out.println("=== Premium Membership (Parameterized Constructor) ===");
        premium.displayMembershipDetails();
        System.out.println("Base Fee: $" + premium.calculateFee());
        System.out.println("Discounted Fee (20%): $" + premium.calculateFee(20));
    }
}
