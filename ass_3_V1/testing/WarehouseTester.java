package testings;

import java.util.ArrayList;

import restaurant.passives.Ingredient;
import restaurant.passives.KitchenTool;

public class WarehouseTester extends Warehouse {
	
	private ArrayList<KitchenTool> tools;
	private ArrayList<Ingredient> ingredients;
	
	public WarehouseTester(){
		tools = new ArrayList<KitchenTool>();
		ingredients = new ArrayList<Ingredient>();
	}
	
	protected int toolTypeCount(){
		return tools.size();
	}
	
	protected int ingredientTypeCount(){
		return ingredients.size();
	}
	
	protected KitchenTool getTool(int i){
		return tools.get(i);
	}
	
	protected Ingredient getIngredient(int i){
		return ingredients.get(i);
	}
	
	protected int toolAvailability(int i){
		return tools.get(i).availablePermits();
	}
	
	protected int ingredientQantity(int i){
		return ingredients.get(i).quantity();
	}
	
	protected void cleare(){
		tools.clear();
		ingredients.clear();
	}
	
}
