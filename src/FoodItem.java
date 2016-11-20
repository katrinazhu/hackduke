public class FoodItem {
	private String myName;
	private String mySize;
	private String[] myMeats;
	private String[] myCondiments;
	private int myCalories;
	private double myPrice;
	public FoodItem(String name, String size, String[] meats, String[] condiments, int calories, double price){
		myName=name;
		mySize=size;
		myMeats=meats;
		myCondiments=condiments;
		myCalories=calories;
		myPrice=price;
	}
	public String getMyName() {
		return myName;
	}
	public String getMySize() {
		return mySize;
	}
	public String[] getMyMeats() {
		return myMeats;
	}
	public String[] getMyCondiments() {
		return myCondiments;
	}
	public int getMyCalories() {
		return myCalories;
	}
	public double getMyPrice() {
		return myPrice;
	}
}
