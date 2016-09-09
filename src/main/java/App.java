import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console c = System.console();
    // Event halloween = new Event("Halloween Party", 250, 10, 20, 250);
    // List<Event> allEvents = new ArrayList<Event>();
    Event newEvent = new Event();
    System.out.println("Welcome to Thra event planning! We can help you plan your next event or party. Please type in one of the following so that we may assist you: plan party, plan a party for me, or exit");
    String navigationChoice = myConsole.readLine().trim().toLowerCase();

    if(navigationChoice.equals("plan party")) {
      System.out.println("Let's begin planning your party! How many people are you planning on having attend?");
      int totalPeopleSelection = Integer.parseInt(c.readLine());
    }

  }
}
