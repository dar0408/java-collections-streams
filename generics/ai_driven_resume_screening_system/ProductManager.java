package ai_driven_resume_screening_system;

public class ProductManager extends JobRole{
    public ProductManager(String candidateName, String resumeContent){
        super(candidateName, resumeContent);
    }

    @Override
    public boolean isQualified(){
        // Checks if resume contains relevant skills for Product Management
        return getResumeContent().contains("Confidence") || getResumeContent().contains("Leadership");
    }
}
