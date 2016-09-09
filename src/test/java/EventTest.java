import org.junit.*;
import static org.junit.Assert.*;

public class EventTest{

  @Test
  public void newEvent_createsObject_true() {
    Event userEvent = new Event();
    assertEquals(true, thisEvent instanceof Event);
  }

  @Test
  public void initialCost_createsInitialCost_250() {
    Event userEvent = new Event();
    assertEquals(250, userEvent.initialCost(250));
  }

  @Test
  public void costPerPerson_increasesCostPerPerson_15() {
    Event userEvent = new Event();
    assertEquals(15, thisEvent.costPerPerson(15));
  }

  @Test
  public void costPerMeal_increasesCostBasedOnFood_userMealChoice() {
    Event userEvent = new Event();
    assertEquals(userMealChoice, userEvent.costPerMeal(userMealChoice));
  }

  @Test
  public void costPerEntertainment_increasesCostBasedOnEntertainment_250() {
    Event userEvent = new Event();
    assertEquals(250, thisEvent.costPerEntertainment(250));
  }
}
