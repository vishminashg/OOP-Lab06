package question1;

/** SE1020 Lab 06 - Q1: Online Course Enrollment System (base class). */
public class Course {

    private String courseID;
    private String courseName;
    private int durationWeeks;

    // (b) Default constructor
    public Course() {
        this("N/A", "N/A", 0);
    }

    // (b) Parameterized constructor
    public Course(String courseID, String courseName, int durationWeeks) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
    }

    public String getCourseID() { return courseID; }
    public void setCourseID(String courseID) { this.courseID = courseID; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public int getDurationWeeks() { return durationWeeks; }
    public void setDurationWeeks(int durationWeeks) { this.durationWeeks = durationWeeks; }

    // (c) Display course information
    public void displayCourseDetails() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + durationWeeks + " weeks");
    }

    // (d)(i) Basic course fee
    public double calculateTotalFee() {
        return 10000.00;
    }

    // (d)(ii) Fee after discount (uses the basic fee from calculateTotalFee())
    public double calculateTotalFee(double discountPercentage) {
        double fee = calculateTotalFee();
        return fee - (fee * discountPercentage / 100);
    }
}
