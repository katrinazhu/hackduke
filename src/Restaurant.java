import java.util.List;

public class Restaurant {
	private List<FoodItem> myFoodItemList;
	private String myFoodType;
	public Restaurant(String foodType, List<FoodItem> foodItemList){
		myFoodType=foodType;
		myFoodItemList=foodItemList;
	}
	public List<FoodItem> getMyFoodItemList() {
		return myFoodItemList;
	}
	public String getMyFoodType() {
		return myFoodType;
	}
	
}