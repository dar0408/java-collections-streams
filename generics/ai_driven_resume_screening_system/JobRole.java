package ai_driven_resume_screening_system;

public abstract class JobRole {
    private String candidateName;
    private String resumeContent;

    // Constructor
    public JobRole(String candidateName, String resumeContent){
        this.candidateName = candidateName;
        this.resumeContent = resumeContent;
    }

    // Getter Method
    public String getcandidateName(){
        return candidateName;
    }

     // Getter Method
     public String getResumeContent(){
        return resumeContent;
    }

     // Abstract method to determine if the candidate is qualified
    public abstract boolean isQualified();
}
