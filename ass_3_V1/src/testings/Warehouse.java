//TODO edit comments
package testings;
//TODO create package and change the imported list accordingly

import java.util.ArrayList;

import restaurant.passives.Dish;
import restaurant.passives.Ingredient;
import restaurant.passives.KitchenTool;
import restaurant.passives.OrderOfDish;
import restaurant.passives.WarehouseInterface;

/**
 * 
 * @author Meni & Yoed
 * the Warehouse class simulates the REIT's maintenance storage.
 * 
 * it holds two databases:
 * 		ArrayList<repair> - list of tools being implemented as semaphores. 
 * 		ArrayList<Ingredient> - list of ingredients.
 *  
 * the class offers two public methods:
 * 		acquire(Dish dish) - for all tools and ingredients in Dish, calls for the tools' acquire() method and subtracts the ingredients' quantity.
 * 		release(Dish dish) - for all tools and ingredients in Dish, calls for the tools' release().
 * 
 */
public class Warehouse implements WarehouseInterface {
	
	private ArrayList<RepairTool> tools;
	private ArrayList<RepairMaterial> material;

	
	public Warehouse(){
		tools = new ArrayList<RepairTool>();
		material = new ArrayList<RepairMaterial>();
	}
	
	/**
	 * this method simulates a chef asking to take what needed for a certain dish.
	 * the method calls for the appropriate tools' acquire() method.
	 * @param dish to acquire tools and ingredients for.
	 */
	public void acquire(Repair repair) {
		// TODO Auto-generated method stub

	}

	/**
	 * this method simulates a chef returning the tools used to prepare a dish.
	 * the method calls for the appropriate tools' release() method.
	 * @param dish which order was finished and it's tools are released.
	 */
	public void release(Repair repair) {
		// TODO Auto-generated method stub

	}

	/**
	 * this method adds a new KitchenTool to the Warehouse.
	 * @param tool to be added.
	 */
	protected void addTool(RepairTool tool){
		// TODO
	}
	
	/**
	 * this method adds a new ingredient to the Warehouse.
	 * @param ingredient to be added.
	 */
	protected void addMaterial(RepairMaterial material){
		// TODO
	}


}
