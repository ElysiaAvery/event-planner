import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class EventTest{

  @Test
  public void newEvent_createsObject_true() {
    List<Event> userEvent = new ArrayList<Event>();
    assertEquals(true, userEvent instanceof Event);
  }

  @Test
  public void getCost_createsInitialCost_250() {
    List<Event> userEvent = new ArrayList<Event>();
    assertEquals(250, userEvent.getCost(250));
  }

  @Test
  public void costPerPerson_increasesCostPerPerson_15() {
    List<Event> userEvent = new ArrayList<Event>();
    assertEquals(15, userEvent.costPerPerson(15));
  }

  @Test
  public void costPerMeal_increasesCostBasedOnFood_15() {
    List<Event> userEvent = new ArrayList<Event>();
    assertEquals(15, userEvent.costPerMeal(15));
  }

  @Test
  public void costPerEntertainment_increasesCostBasedOnEntertainment_250() {
    List<Event> userEvent = new ArrayList<Event>();
    assertEquals(250, userEvent.costPerEntertainment(250));
  }
}
