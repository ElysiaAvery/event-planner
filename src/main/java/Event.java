
public class Event {
  private String mParty;
  private int mBase = 0;
  private int mCost = 250;
  private int mPerson = 15;
  private int mMeal = 25;
  private int mEntertainment = 250;

  // public Event(int person, int meal, int entertainment) {
  //   mPerson = person;
  //   mMeal = meal;
  //   mEntertainment = entertainment;
  // }

  public int initialCost(int userChoice) {
    // return mBase.equals(mCost + userChoice);
    return 250;
  }

  public int costPerPerson(int totalPeopleSelection) {
    // return mBase.equals(totalPeopleSelection * mPerson);
    return 15;
  }

  public int costPerPlate(int foodSelection) {
    // return mBase.equals(foodSelection.mMeal * totalPeopleSelection);
    return 25;
  }

  public int costPerEntertainment(int entertainmentSelection) {
    // returnmBase.equals(entertainmentSelection.mEntertainment;
    return 250;
  }
}
