package question1;

/** Premium course: includes an optional certification service. */
public class PremiumCourse extends Course {

    private static final double CERTIFICATION_FEE = 50.0;

    private boolean includeCertification;

    // (f)(ii) Default constructor
    public PremiumCourse() {
        super();
        this.includeCertification = false;
    }

    // (f)(ii) Parameterized constructor
    public PremiumCourse(String courseID, String courseName, int durationWeeks,
                         boolean includeCertification) {
        super(courseID, courseName, durationWeeks);
        this.includeCertification = includeCertification;
    }

    public boolean isIncludeCertification() { return includeCertification; }
    public void setIncludeCertification(boolean includeCertification) { this.includeCertification = includeCertification; }

    // (f)(iii) Total Fee = (150 x durationWeeks) + $50 certification fee if included
    @Override
    public double calculateTotalFee() {
        double fee = 150 * getDurationWeeks();
        if (includeCertification) {
            fee += CERTIFICATION_FEE;
        }
        return fee;
    }

    // (f)(iv) Display details including total fee and certification status
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Certification Included: " + includeCertification);
        System.out.println("Total Fee: $" + calculateTotalFee());
    }
}
