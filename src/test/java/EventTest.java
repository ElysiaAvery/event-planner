import org.junit.*;
import static org.junit.Assert.*;

public class EventTest{

  @Test
  public void newEvent_createsObject_true() {
    Event thisEvent = new Event();
    assertEquals(true, thisEvent instanceof Event);
  }

  @Test
  public void initialCost_createsInitialCost_250() {
    Event thisEvent = new Event();
    assertEquals(250, thisEvent.initialCost(250));
  }

  @Test
  public void costPerPerson_increasesCostPerPerson_15() {
    Event thisEvent = new Event();
    assertEquals(15, thisEvent.costPerPerson(15));
  }

  @Test
  public void costPerPlate_increasesCostBasedOnFood_25() {
    Event thisEvent = new Event();
    assertEquals(25, thisEvent.costPerPlate(25));
  }
}
