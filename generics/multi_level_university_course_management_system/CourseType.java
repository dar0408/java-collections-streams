package multi_level_university_course_management_system;

public abstract class CourseType {
    // Attributes
    private String courseName;
    private String instructor;

    // Constructor
    public CourseType(String courseName, String instructor){
        this.courseName = courseName;
        this.instructor = instructor;
    }

    // Getter Method
    public String getCourseName(){
        return courseName;
    }

    // Getter Method
    public String getInstructorName(){
        return instructor;
    }
}
