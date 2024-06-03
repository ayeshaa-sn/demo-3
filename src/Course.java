public class Course {
    private String code;
    private String courseName;
    private String courseCredit;
    private String courseType;
    private String semester;

    public Course(String code,String courseName,String courseCredit,String courseType,String semester){
        this.code=code;
        this.courseName=courseName;
        this.courseCredit=courseCredit;
        this.courseType=courseType;
        this.semester=semester;
    }

    public String getCode() {
        return code;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public String getCourseType() {
        return courseType;
    }

    public String getSemester() {
        return semester;
    }
}
