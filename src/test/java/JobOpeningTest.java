import org.junit.*;
import static org.junit.Assert.*;

public class JobOpeningTest{
  @Test
  public void JobOpening_instantiatesCorrectly_true() {
    JobOpening newJobOpening = new JobOpening("Developer", "Must Be Able to Code", "Bossy Boss");
    assertEquals(true, newJobOpening instanceof JobOpening);
  }

  @Test
  public void JobOpening_getsJobTitle_jobTitleString() {
    JobOpening newJobOpening = new JobOpening("Developer", "Must Be Able to Code", "Bossy Boss");
    assertEquals("Developer", newJobOpening.getJobTitle());
  }

  @Test
  public void JobOpening_getsJobDescription_jobDescriptionString() {
    JobOpening newJobOpening = new JobOpening("Developer", "Must Be Able to Code", "Bossy Boss");
    assertEquals("Must Be Able to Code", newJobOpening.getJobDescription());
  }

  @Test
  public void JobOpening_getContactInfo_contactInfoString(){
    JobOpening newJobOpening = new JobOpening("Developer", "Must Be Able to Code", "Bossy Boss");
    assertEquals("Bossy Boss", newJobOpening.getContactInfo());
  }
}
