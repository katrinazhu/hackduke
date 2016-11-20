import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static List<Restaurant> myRestaurantList=new ArrayList<Restaurant>();
	public static void main(String[]args){
		File file = new File("src/menus/jimmyjohns.txt");
		ReadMenu readMenu = new ReadMenu(file);
		readMenu.parseMenu();		
		myRestaurantList.add(readMenu.getMyRestaurant());
		file = new File("src/menus/dominos.txt");
		readMenu = new ReadMenu(file);
		readMenu.parseMenu();		
		myRestaurantList.add(readMenu.getMyRestaurant());
		//now you have the list of restaurants and their food types
		//can pick the best one based on information from the user
	}
}