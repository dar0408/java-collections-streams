package ai_driven_resume_screening_system;

public class Main {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> engineer = new Resume<>();
        Resume<DataScientist> scientist = new Resume<>();
        Resume<ProductManager> manager = new Resume<>();

        scientist.addResume(new DataScientist("Charlie", "Python, Machine Learning, AI"));
        manager.addResume(new ProductManager("Eve", "Agile, Roadmap"));
        engineer.addResume(new SoftwareEngineer("Alice", "Java, Spring, SQL"));

        System.out.println("Processing Software Engineer Resumes:");
        engineer.processResumes(engineer.getResumes());

        System.out.println("\nProcessing Data Scientist Resumes:");
        scientist.processResumes(scientist.getResumes());

        System.out.println("\nProcessing Product Manager Resumes:");
        manager.processResumes(manager.getResumes());
    }
}
