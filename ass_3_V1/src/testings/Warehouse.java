package REIT.testing;

import java.util.ArrayList;

import REIT.passives.RepairRequirements;
import REIT.passives.RepairMaterial;
import REIT.passives.RepairTool;
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
	 * this method simulates a maintenance man asking to take what needed for a certain asset repair.
	 * the method calls for the appropriate tools' acquire() method.
	 * @param repairRequirements of the tools and materials needed to be acquired.
	 */
	public void acquire(RepairRequirements repairRequirements) {
		// TODO Auto-generated method stub

	}

	/**
	 * this method simulates a maintenance man returning the tools used to fix an asset.
	 * the method calls for the appropriate tools' release() method.
	 * @param repairRequirements which was used and its tools are released.
	 */
	public void release(RepairRequirements repairRequirements) {
		// TODO Auto-generated method stub

	}

	/**
	 * this method adds a new repair tool to the Warehouse.
	 * @param tool to be added.
	 */
	protected void addTool(RepairTool tool){
		// TODO
	}
	
	/**
	 * this method adds a new material to the Warehouse.
	 * @param material to be added.
	 */
	protected void addMaterial(RepairMaterial material){
		// TODO
	}


}
