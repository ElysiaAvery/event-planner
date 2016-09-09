import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console c = System.console();
    // Event halloween = new Event("Halloween Party", 250, 10, 20, 250);
    List<Event> allEvents = new ArrayList<Event>();
    System.out.println("Welcome to Thra event planning! We can help you plan your next event or party. Please type in one of the following so that we may assist you: Plan Party, Plan a Party For Me, or Exit");
    String navigationChoice = c.readLine().trim().toLowerCase();

    if(navigationChoice.equals("plan party")) {
      System.out.println("Let's begin planning your party! How many people are you planning on having attend?");
      int totalPeopleSelection = Integer.parseInt(c.readLine());
      System.out.println("What type of meal would you like to be served? Please type one of the following: Nebrie Grub Cheese and Plant Tendrils, urAmaj and urNol's Healing Feast, or skekMal's Freshly Hunted Meats");
      String mealChoice = c.readLine().trim().toLowerCase();
      if (mealChoice.equals("nebrie grub cheese and plant tendrils")) {
        System.out.println("Each plate will cost $10. Please type 10 to confirm.");
        Integer userMealChoice = Integer.parseInt(c.readLine().trim());
      } else if (mealChoice.equals("urmaj and urnol's healing feast")) {
        System.out.println("Each plate will cost $15. Please type 15 to confirm.");
        Integer userMealChoice = Integer.parseInt(c.readLine().trim());
      } else if (mealChoice.equals("skekmal's freshly hunted meats")) {
        System.out.println("Each plate will cost $20. Please type 20 to confirm.");
        Integer userMealChoice = Integer.parseInt(c.readLine().trim());
      } else {
        System.out.println("I'm sorry, I didn't understand your input.");
      }
      int userMealChoice = Integer.parseInt(c.readLine().trim());

      System.out.println("What type of entertainment would you like at your event? Please type one of the following: urRu Band, Pod People DJ, Skeksis Noise Drone, or Garthrim Dancers");
      String entertainmentChoice = c.readLine().trim().toLowerCase();
      int userChoiceEntertainment = Integer.parseInt(c.readLine().trim().toLowerCase());
      Event userEvent = new Event(totalPeopleSelection, userMealChoice, userChoiceEntertainment);
      Integer userPricePerPerson = userEvent.attendance();
      Integer userPricePerMeal = userEvent.costPerMeal();
      System.out.println("Your party will entail the following with prices: " + userEvent);
    }
  }
}
