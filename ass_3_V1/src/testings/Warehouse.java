package REIT.testing;

import java.util.ArrayList;

import REIT.passives.Repair;
import REIT.passives.RepairMaterial;
import REIT.passives.RepairTool;
import REIT.passives.OrderOfDish; // ????????????? equivalent ???????????????
import REIT.passives.WarehouseInterface;

//TODO edit comments
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
	private ArrayList<RepairMaterial> materials;

	
	public Warehouse(){
		tools = new ArrayList<RepairTool>();
		materials = new ArrayList<RepairMaterial>();
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
