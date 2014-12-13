package testings;
//TODO packeges

import java.util.ArrayList;

import restaurant.passives.Ingredient;
import restaurant.passives.KitchenTool;

public class WarehouseTester extends Warehouse {
	
	private ArrayList<RepairTool> tools;
	private ArrayList<RepairMaterial> materials;
	
	public WarehouseTester(){
		tools = new ArrayList<RepairTool>();
		materials = new ArrayList<RepairMaterial>();
	}
	
	protected int toolTypeCount(){
		return tools.size();
	}
	
	protected int materialsTypeCount(){
		return materials.size();
	}
	
	protected RepairTool getTool(int i){
		return tools.get(i);
	}
	
	protected RepairMaterial getMaterials(int i){
		return materials.get(i);
	}
	
	protected int toolAvailability(int i){
		return tools.get(i).availablePermits();
	}
	
	protected int materialsQantity(int i){
		return materials.get(i).quantity();
	}
	
	protected void cleare(){
		tools.clear();
		materials.clear();
	}
	
}
