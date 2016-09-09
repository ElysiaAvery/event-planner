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
