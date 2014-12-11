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
