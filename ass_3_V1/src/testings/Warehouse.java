package testings;

import java.util.ArrayList;

import restaurant.passives.Dish;
import restaurant.passives.Ingredient;
import restaurant.passives.KitchenTool;
import restaurant.passives.OrderOfDish;
import restaurant.passives.WarehouseInterface;

/**
 * 
 * @author Shimrit Zabib and Itai Sanders
 * the Warehouse class simulates the restaurant's storage.
 * 
 * it holds two databases:
 * 		ArrayList<KitchenTool> - list of tools being implemented as semaphores. 
 * 		ArrayList<Ingredient> - list of ingredients.
 *  
 * the class offers two public methods:
 * 		acquire(Dish dish) - for all tools and ingredients in Dish, calls for the tools' acquire() method and subtracts the ingredients' quantity.
 * 		release(Dish dish) - for all tools and ingredients in Dish, calls for the tools' release().
 * 
 */
public class Warehouse implements WarehouseInterface {
	
	private ArrayList<KitchenTool> tools;
	private ArrayList<Ingredient> ingredients;

	
	public Warehouse(){
		tools = new ArrayList<KitchenTool>();
		ingredients = new ArrayList<Ingredient>();
	}
	
	/**
	 * this method simulates a chef asking to take what needed for a certain dish.
	 * the method calls for the appropriate tools' acquire() method.
	 * @param dish to acquire tools and ingredients for.
	 */
	public void acquire(Dish dish) {
		// TODO Auto-generated method stub

	}

	/**
	 * this method simulates a chef returning the tools used to prepare a dish.
	 * the method calls for the appropriate tools' release() method.
	 * @param dish which order was finished and it's tools are released.
	 */
	public void release(Dish dish) {
		// TODO Auto-generated method stub

	}

	/**
	 * this method adds a new KitchenTool to the Warehouse.
	 * @param tool to be added.
	 */
	protected void addTool(KitchenTool tool){
		// TODO
	}
	
	/**
	 * this method adds a new ingredient to the Warehouse.
	 * @param ingredient to be added.
	 */
	protected void addIngredient(Ingredient ingredient){
		// TODO
	}


}
