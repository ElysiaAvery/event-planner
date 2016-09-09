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
      } else if (mealChoice.equals("uramaj and urnol's healing feast")) {
        System.out.println("Each plate will cost $15. Please type 15 to confirm.");
        Integer userMealChoice = Integer.parseInt(c.readLine().trim());
      } else if (mealChoice.equals("skekmal's freshly hunted meats")) {
        System.out.println("Each plate will cost $20. Please type 20 to confirm.");
        Integer userMealChoice = Integer.parseInt(c.readLine().trim());
      } else {
        System.out.println("I'm sorry, I didn't understand your input.");
      }


      System.out.println("What type of entertainment would you like at your event? Please type one of the following: urRu Band, Pod People DJ, Skeksis Noise Drone, or Garthrim Dancers");
      String entertainmentChoice = c.readLine().trim().toLowerCase();
      if (entertainmentChoice.equals("urru band")) {
        System.out.println("This band plays for free, please enter 0 to confirm.");
        Integer userChoiceEntertainment = Integer.parseInt(c.readLine().trim());
      } else if (entertainmentChoice.equals("pod people dj")) {
        System.out.println("This band plays for $100, please enter 100 to confirm.");
        Integer userChoiceEntertainment = Integer.parseInt(c.readLine().trim());
      } else if (entertainmentChoice.equals("skeksis noise drone")) {
        System.out.println("This band plays for $500, please enter 500 to confirm.");
        Integer userChoiceEntertainment = Integer.parseInt(c.readLine().trim());
      } else if (entertainmentChoice.equals("garthrim dancers")) {
        System.out.println("This band plays for $200, please enter 200 to confirm.");
        Integer userChoiceEntertainment = Integer.parseInt(c.readLine().trim());
      } else {
        System.out.println("I'm sorry, I didn't understand your input.");
      }
      Integer userChoiceEntertainment = Integer.parseInt(c.readLine().trim());
      Event userEvent = new Event(totalPeopleSelection, userMealChoice, userChoiceEntertainment);
      Integer userPricePerPerson = userEvent.attendance(totalPeopleSelection);
      Integer userPricePerMeal = userEvent.costPerMeal(userMealChoice);
      Integer userPriceForEntertainment = userEvent.costPerEntertainment(userChoiceEntertainment);
      Integer partyTotal = userEvent.eventTotalPrice(totalPeopleSelection, userMealChoice, userChoiceEntertainment);
      System.out.println("Your party will entail the following with prices:");
      System.out.println("-------------------------------------------------");
      System.out.println("Cost for initial party with guests: " + userPricePerPerson);
      System.out.println("Your catering cost is: " + userPricePerMeal);
      System.out.println("Your entertainment cost is: " + userPriceForEntertainment);
      System.out.println("Your total event cost is: " +  partyTotal);
    }
  }
}
