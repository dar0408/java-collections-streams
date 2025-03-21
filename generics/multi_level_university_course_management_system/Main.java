package multi_level_university_course_management_system;

public class Main {
    public static void main(String[] args) {
        Course<ExamCourse> exam = new Course<>();
        Course<AssignmentCourse> assignment = new Course<>();
        Course<ResearchCourse> research = new Course<>();

        // Adding name, instructor in list
        exam.add(new ExamCourse("Mathematics", "Dr. Smith"));
        assignment.add(new AssignmentCourse("Computer Science", "Prof. Johnson"));
        research.add(new ResearchCourse("Physics Research", "Dr. Brown"));

        // Calling display Method
        System.out.println("Exam Courses: ");
        exam.display(exam.courses);

        System.out.println();

        System.out.println("Assignment Courses: ");
        assignment.display(assignment.courses);

        System.out.println();

        System.out.println("Research Courses: ");
        research.display(research.courses);
    }
}
