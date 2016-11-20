
public class Food {
	
	private String[] broadNames = new String[]{"pizzaRating", "sandwichRating"};
	private String[] pizzaNames = new String[]{"cheeseRating", "pepperoniRating", "sausageRating", "mushroomRating", 
				"onionRating", "baconRating", "oliveRating"};
	private String[] sandwichNames = new String[]{"whiteBreadRating", "sourdoughRating", "wholeWheatRating", "veggieRating",
				"chickenRating", "turkeyRating", "roastBeefRating"};
	
	public String[] getBroadNames() {return broadNames;}
	public String[] getPizzaNames() {return pizzaNames;}
	public String[] getSandwichNames() {return sandwichNames;}
	
	public int indexBroadNames(String s) {
		for(int i=0; i<broadNames.length; i++) {
			if(broadNames[i].equals(s)) {return i;}
		}
		return -1;
	}

	public int indexPizzaNames(String s) {
		for(int i=0; i<pizzaNames.length; i++) {
			if(pizzaNames[i].equals(s)) {return i;}
		}
		return -1;
	}
	
	public int indexSandwichNames(String s) {
		for(int i=0; i<sandwichNames.length; i++) {
			if(sandwichNames[i].equals(s)) {return i;}
		}
		return -1;
	}
	
}
