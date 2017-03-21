import org.junit.*;
import static org.junit.Assert.*;

public class JobOpeningTest{
  @Test
  public void JobOpening_instantiatesCorrectly_true() {
    JobOpening newJobOpening = new JobOpening("Developer");
    assertEquals(true, newJobOpening instanceof JobOpening);
  }

  @Test
  public void JobOpening_instantiatesCorrectly_jobTitleString() {
    JobOpening newJobOpening = new JobOpening("Developer");
    assertEquals("Developer", newJobOpening.getJobTitle());
  }
}
