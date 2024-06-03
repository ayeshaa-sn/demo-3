public class Grade {
    private String studentID;
    private String courseCode;
    private float obtainedMarks;

    public Grade(String studentID, String courseCode, float obtainedMarks){
        this.studentID=studentID;
        this.courseCode=courseCode;
        this.obtainedMarks=obtainedMarks;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public float getObtainedMarks() {
        return obtainedMarks;
    }
}
