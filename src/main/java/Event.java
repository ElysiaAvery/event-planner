class Event {
  private int mCost = 250;
  private int mPerson;
  private int mMealType;
  private int mEntertainment;

public Event(int person, int mealType, int entertainment){
  mPerson = person;
  mMealType = mealType;
  mEntertainment = entertainment;
}
public int attendance(int totalPeopleSelection){
  return (mCost + (mPerson * 10));
}
public int costPerMeal(int userMealChoice){
return (mPerson * mMealType);
}
public int costPerEntertainment(int userChoiceEntertainment){
  return (mEntertainment);
}
public int eventTotalPrice(int totalPeopleSelection, int userMealChoice, int userChoiceEntertainment) {
  return ((mCost + (mPerson * 10)) + (mPerson * mMealType) + (mEntertainment));
}
}






//
// public class Event {
//   private String mPartyName;
//   private int mBase = 0;
//   private int mCost = 250;
//   private int mPerson = 15;
//   private int mMeal = 0;
//   private int mEntertainment = 250;
//
//   public Event(String partyName, int cost, int person, int meal, int entertainment) {
//     mPartyName = partyName;
//     mCost = cost;
//     mPerson = person;
//     mMeal = meal;
//     mEntertainment = entertainment;
//   }
//
//   public int initialCost(int userChoice) {
//     // return mBase.equals(mCost + userChoice);
//     return 250;
//   }
//
//   public int costPerPerson(int totalPeopleSelection) {
//     // return mBase += totalPeopleSelection * mPerson;
//     return 15;
//   }
//
//   public int costPerPlate() {
//     return 25;
//   }
//
//   public int costPerEntertainment(int entertainmentSelection) {
//     // return mBase.equals(entertainmentSelection.mEntertainment);
//     return 250;
//   }
// }
