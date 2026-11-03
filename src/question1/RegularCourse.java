package question1;

/** Regular course: no certification, optional live sessions. */
public class RegularCourse extends Course {

    private boolean hasLiveSessions;

    // (e)(ii) Default constructor
    public RegularCourse() {
        super();
        this.hasLiveSessions = false;
    }

    // (e)(ii) Parameterized constructor
    public RegularCourse(String courseID, String courseName, int durationWeeks,
                         boolean hasLiveSessions) {
        super(courseID, courseName, durationWeeks);
        this.hasLiveSessions = hasLiveSessions;
    }

    public boolean isHasLiveSessions() { return hasLiveSessions; }
    public void setHasLiveSessions(boolean hasLiveSessions) { this.hasLiveSessions = hasLiveSessions; }

    // (e)(iii) Total Fee = 100 x durationWeeks
    @Override
    public double calculateTotalFee() {
        return 100 * getDurationWeeks();
    }

    // (e)(iv) Display all details including total fee and live session status
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Live Sessions Included: " + hasLiveSessions);
        System.out.println("Total Fee: $" + calculateTotalFee());
    }
}
