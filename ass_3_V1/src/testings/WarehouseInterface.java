package testings;

/*
 *
2.6 Warehouse
Found in: Management, RunnableMaintainenceRequest

This object contains: (1) Collection of repair tools (2) Collection of repair materials.

This warehouse is the shared storage component, where the different maintenance persons acquire
their tools and materials. You will have methods that allow the maintenance person to acquire and
release tools, as well as to consume repair material.
Note: The warehouse contains enough maintenance materials and tools in order to successfully
complete the simulation process. There is no case where your simulation will get stuck due to insufficient units.
 */


public interface WarehouseInterface {

	
	//maintenance men asking to take tools that needed for a repair.
	public void acquireTool(RepairTool repairTool);
	
	//maintenance men returning the tools used for repair.
	public void releaseTool(RepairTool repairTool);
	
	//maintenance men asking to take materials that needed for a repair.
	public void acquireMaterial(RepairMaterial repairMaterial);
	
}

/*
package restaurant.passives;


 * 2.5 Warehouse

Found in: Management

This object contains: (1) a collection of available kitchen tools (2) a collection of available ingredients.
This warehouse is the shared storage component where the different chefs acquire their tools and needed ingredients from.

You may assume the warehouse contains enough ingredients and kitchen tools in order to successfully complete the simulation process.



public interface WarehouseInterface {

	
	//this method simulates a chef asking to take what needed for a certain dish.
	public void acquire(Dish dish);
	
	//this method simulates a chef returning the tools used to prepare a dish.
	public void release(Dish dish);
	
}
 */
