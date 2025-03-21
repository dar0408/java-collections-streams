package multi_level_university_course_management_system;
import java.util.*;

// Generic Class
public class Course <T extends CourseType>{
    List<T> courses = new ArrayList<>();

    // Add Method
    public void add(T course){
        courses.add(course);
    }

    // Method to display list of name and instructor in ExamCourse, Assignment Course, Research Course
    public void display(List <? extends CourseType> list){
        for(CourseType num : list){
            System.out.println("Course Name: " + num.getCourseName());
            System.out.println("Instructor Name: " + num.getInstructorName());
        }
    }
}
