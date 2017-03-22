import org.junit.*;
import static org.junit.Assert.*;

public class CityTest {

  @Test
  public void category_instantiatesCorrectly_true(){
    City testCity = new City("Portland");
    assertEquals(true, testCity instanceof City);
  }

  @Test
  public void getName_cityInstantiatesWithName_Portland(){
    City testCity = new City("Portland");
    assertEquals("Portland", testCity.getName());
  }

  @Test
  public void all_returnsAllInstancesOfCity_true(){
    City firstCity = new City("Portland");
    City secondCity = new City("Seattle");
    assertEquals(true, City.all().contains(firstCity));
    assertEquals(true, City.all().contains(secondCity));
  }

  @Test
  public void clear_emptiesAllCitiesFromList_0(){
    City testCity = new City("Portland");
    City.clear();
    assertEquals(City.all().size(), 0);
  }

  @Test
  public void getId_cityInstantiatesWithAnId_1(){
    City.clear();
    City testCity = new City("Portland");
    assertEquals(1, testCity.getId());
  }

  @Test
  public void find_returnsCityWithSameId_secondCity(){
    City.clear();
    City firstCity = new City("Portland");
    City secondCity = new City("Tokyo");
    assertEquals(City.find(secondCity.getId()), secondCity);
  }

  @Test
  public void getJobOpenings_initiallyReturnsEmptyList_ArrayList(){
    City.clear();
    City testCity = new City("Portland");
    assertEquals(0, testCity.getJobOpenings().size());
  }

  @Test
  public void addJobOpening_addsJobOpeningToList_true(){
    City testCity = new City("Portland");
    JobOpening testJobOpening = new JobOpening("Developer", "Code", "Bossy Boss");
    testCity.addJobOpening(testJobOpening);
    assertTrue(testCity.getJobOpenings().contains(testJobOpening));
  }
}
