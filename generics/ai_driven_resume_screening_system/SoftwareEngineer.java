package ai_driven_resume_screening_system;

public class SoftwareEngineer extends JobRole{
    public SoftwareEngineer(String candidateName, String resumeContent){
        super(candidateName, resumeContent);
    }

    @Override
    public boolean isQualified(){
        // Checks if resume contains relevant programming languages
        return getResumeContent().contains("Java") || getResumeContent().contains("C++");
    } 
}
