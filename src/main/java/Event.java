class Event {
  private String mPartyName;
  private int mCost = 250;
  private int mPerson;
  private int mMealType;
  private int mEntertainment;

  public Event(String partyName, int person, int mealType, int entertainment){
    mPartyName = partyName;
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
  public int getCost() {
    return mCost;
  }
  public String getName() {
    return mPartyName;
  }
  public int getPerson() {
    return mPerson;
  }
  public int getMealType() {
    return mMealType;
  }
  public int getEntertainment() {
    return mEntertainment;
  }
}
