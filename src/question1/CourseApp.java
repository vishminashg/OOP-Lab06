package question1;

public class CourseApp {
    public static void main(String[] args) {

        // (g)(i) RegularCourse using the default constructor
        RegularCourse regular = new RegularCourse();
        System.out.println("=== Regular Course (Default Constructor) ===");
        regular.displayCourseDetails();
        System.out.println("Basic Fee: $" + regular.calculateTotalFee());
        System.out.println("Discounted Fee (10%): $" + regular.calculateTotalFee(10));
        System.out.println();

        // (g)(ii) PremiumCourse using the parameterized constructor
        PremiumCourse premium = new PremiumCourse("PC202", "Machine Learning", 6, true);
        System.out.println("=== Premium Course (Parameterized Constructor) ===");
        premium.displayCourseDetails();
        System.out.println("Basic Fee: $" + premium.calculateTotalFee());
        System.out.println("Discounted Fee (20%): $" + premium.calculateTotalFee(20));
    }
}
