package ai_driven_resume_screening_system;

import java.util.ArrayList;
import java.util.List;

// Generic Class
public class Resume <T extends JobRole>{
    private List<T> resumes = new ArrayList<>();

    // Method to add resumes to the processor
    public void addResume(T resume){
        resumes.add(resume);
    }

    // Processes and evaluates all stored resumes
    public List<T> getResumes() {
        return resumes;
    }

    public void processResumes(List <? extends JobRole> resumes){
         // Processes resumes from multiple job roles using wildcard type
        for(JobRole resume : resumes){
            System.out.println("Processing for Resume: " + resume.getcandidateName());
            System.out.println("Qualified: " + resume.isQualified());
        }
    } 
}
