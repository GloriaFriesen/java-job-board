public class JobOpening {
  private String mJobTitle;
  private String mJobDescription;
  private String mContactInfo;

  public JobOpening(String jobTitle, String jobDescription, String contactInfo){
    mJobTitle = jobTitle;
    mJobDescription = jobDescription;
    mContactInfo = contactInfo;
  }

  public String getJobTitle(){
    return mJobTitle;
  }

  public String getJobDescription(){
    return mJobDescription;
  }
  public String getContactInfo(){
    return mContactInfo;
  }
}
