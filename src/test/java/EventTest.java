import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class EventTest{

  @Test
  public void newEvent_createsObject_true() {
  Event userEvent = new Event("Birthday", 15, 15, 250);
    assertTrue(userEvent instanceof Event);
  }

  @Test
  public void getName_createsInitialCost_Birthday() {
  Event userEvent = new Event("Birthday", 15, 15, 250);
    assertEquals("Birthday", userEvent.getName());
  }

  @Test
  public void getPerson_increasesCostPerPerson_15() {
  Event userEvent = new Event("Birthday", 15, 15, 100);
    assertEquals(15, userEvent.getPerson());
  }

  @Test
  public void getMealType_increasesCostBasedOnFood_15() {
  Event userEvent = new Event("Birthday", 15, 15, 250);
    assertEquals(15, userEvent.getMealType());
  }

  @Test
  public void getEntertainment_increasesCostBasedOnEntertainment_250() {
  Event userEvent = new Event("Birthday", 15, 15, 250);
    assertEquals(250, userEvent.getEntertainment());
  }
}
