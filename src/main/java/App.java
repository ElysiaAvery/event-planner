import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    Console c = System.console();
    Event halloween = new Event("Halloween Party", 10, 20, 250);
    Event bbq = new Event("Bar-B-Que", 10, 25, 200);
    Event birthday = new Event("Birthday Party", 10, 20, 300);
    Event wedding = new Event("Wedding Reception", 50, 30, 600);
    Event costume = new Event("Costume Party", 20, 10, 200);
    Event dog = new Event("Dog Birthday", 15, 15, 200);
    Event pizza = new Event("Pizza Party", 15, 20, 200);
    Event painting = new Event("Painting Party", 10, 10, 300);
    List<Event> allEvents = new ArrayList<Event>();
    allEvents.add(halloween);
    allEvents.add(bbq);
    allEvents.add(birthday);
    allEvents.add(wedding);
    allEvents.add(costume);
    allEvents.add(dog);
    allEvents.add(pizza);
    allEvents.add(painting);
    String[] partyArray = {"Halloween", "Bar-B-Que", "Birthday Party", "Wedding Reception", "Costume Party", "Dog Birthday", "Pizza Party", "Painting Party"};
    int idx = new Random().nextInt(partyArray.length);
    String random = (partyArray[idx]);

    boolean programRunning = true;

    while (programRunning) {
      System.out.println("-------------------------------------------------");
      System.out.println("Welcome to Thra event planning! We can help you plan your next event or party. Please type in one of the following so that we may assist you: Plan Party, All Parties, Choose a Random Party, or Exit");
      String navigationChoice = c.readLine().trim().toLowerCase();

      if (navigationChoice.equals("plan party")) {
        System.out.println("What would you like your event to be called?");
        String userPartyName = c.readLine();
        System.out.println("How many people are you planning on having attend?");
        int totalPeopleSelection = Integer.parseInt(c.readLine());
        System.out.println("What type of meal would you like to be served? Please type one of the following: Nebrie Grub Cheese and Plant Tendrils, urAmaj and urNol's Healing Feast, or skekMal's Freshly Hunted Meats");
        String mealChoice = c.readLine().trim().toLowerCase();
        if (mealChoice.equals("nebrie grub cheese and plant tendrils")) {
          System.out.println("Each plate will cost $10. Please type 10 to confirm.");
        } else if (mealChoice.equals("uramaj and urnol's healing feast")) {
          System.out.println("Each plate will cost $15. Please type 15 to confirm.");
        } else if (mealChoice.equals("skekmal's freshly hunted meats")) {
          System.out.println("Each plate will cost $20. Please type 20 to confirm.");
        } else {
          System.out.println("I'm sorry, I didn't understand your input.");
        }
        Integer userMealChoice = Integer.parseInt(c.readLine().trim());
        System.out.println("What type of entertainment would you like at your event? Please type one of the following: urRu Band, Pod People DJ, Skeksis Noise Drone, or Garthrim Dancers");
        String entertainmentChoice = c.readLine().trim().toLowerCase();
        if (entertainmentChoice.equals("urru band")) {
          System.out.println("This band plays for free, please enter 0 to confirm.");
        } else if (entertainmentChoice.equals("pod people dj")) {
          System.out.println("This band plays for $100, please enter 100 to confirm.");
        } else if (entertainmentChoice.equals("skeksis noise drone")) {
          System.out.println("This band plays for $500, please enter 500 to confirm.");
        } else if (entertainmentChoice.equals("garthrim dancers")) {
          System.out.println("This band plays for $200, please enter 200 to confirm.");
        } else {
          System.out.println("I'm sorry, I didn't understand your input.");
        }
        Integer userChoiceEntertainment = Integer.parseInt(c.readLine().trim());
        Event userEvent = new Event(userPartyName, totalPeopleSelection, userMealChoice, userChoiceEntertainment);
        Integer userPricePerPerson = userEvent.attendance(totalPeopleSelection);
        Integer userPricePerMeal = userEvent.costPerMeal(userMealChoice);
        Integer userPriceForEntertainment = userEvent.costPerEntertainment(userChoiceEntertainment);
        Integer partyTotal = userEvent.eventTotalPrice(totalPeopleSelection, userMealChoice, userChoiceEntertainment);
        System.out.println("Your party will entail the following with prices:");
        System.out.println("-------------------------------------------------");
        System.out.println(userPartyName);
        System.out.println("Cost for initial party with guests: " + userPricePerPerson);
        System.out.println("Your catering cost is: " + userPricePerMeal);
        System.out.println("Your entertainment cost is: " + userPriceForEntertainment);
        System.out.println("Your total event cost is: " +  partyTotal);
      } else if (navigationChoice.equals("all parties")) {
          for (Event individualEvent : allEvents) {
            System.out.println("-------------------------------------------------");
            System.out.println("This party will entail the following with prices:");
            System.out.println("Type of event: " + individualEvent.getName());
            System.out.println("This party will host " + individualEvent.getPerson() + " people.");
            System.out.println("The cost per each meal is: $" + individualEvent.getMealType());
            System.out.println("The cost for entertainment at this event is: $" + individualEvent.getEntertainment());
          }
      } else if (navigationChoice.equals("choose a random party")) {
        System.out.println(random);
      } else if (navigationChoice.equals("exit")){
          programRunning = false;
      } else {
          System.out.println("I'm sorry, we don't recognize your input");
      }
    }
  }
}
