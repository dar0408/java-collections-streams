package ai_driven_resume_screening_system;

public class DataScientist extends JobRole{
    public DataScientist(String candidateName, String resumeContent){
        super(candidateName, resumeContent);
    }

    @Override
    public boolean isQualified(){
        // Checks if resume contains relevant skills data science 
        return getResumeContent().contains("Machine Learning") || getResumeContent().contains("Python");
    } 
}
