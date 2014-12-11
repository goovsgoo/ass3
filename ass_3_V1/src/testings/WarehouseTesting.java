package testings;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import restaurant.passives.*;;

public class WarehouseTesting {
	
	WarehouseTester wh;
	//KitchenTool tool1;
	//KitchenTool tool2;
	//Ingredient ing1;
	//Ingredient ing2;
	//Dish dish;
	//OrderOfDish order;
	
	
	@Before
	public void setUp() throws Exception {
		wh = new WarehouseTester();
		//tool1 = new KitchenTool("tool1", 3);
		//tool2 = new KitchenTool("tool2", 5);
		//ing1 = new Ingredient("ing1", 7);
		//ing2 = new Ingredient("ing2", 9);
		//wh.addTool(tool1);
		//	wh.addTool(tool2);
		//	wh.addIngredient(ing1);
		//wh.addIngredient(ing2);
		//	dish = new Dish("dish");
		//	dish.addTool("tool2", 1);
		//	dish.addIngredient("ing2", 2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAcquire() {
		int beforeT1 = wh.toolAvailability(0);
		int beforeI1 = wh.ingredientQantity(0);
		int beforeT2 = wh.toolAvailability(1);
		int beforeI2 = wh.ingredientQantity(1);
		
		// tests that tool2 and ing2 and only them were acquired.
		wh.acquire(dish);
		assertEquals(beforeT1, wh.toolAvailability(0));
		assertEquals(beforeI1, wh.ingredientQantity(0));
		assertEquals(beforeT2-1, wh.toolAvailability(1));
		assertEquals(beforeI2-2, wh.ingredientQantity(1));
		
	}

	@Test
	public void testRelease() {
		int beforeT1 = wh.toolAvailability(0);
		int beforeI1 = wh.ingredientQantity(0);
		int beforeT2 = wh.toolAvailability(1);
		int beforeI2 = wh.ingredientQantity(1);

		// tests that tool2 and only tool2 was released.
		wh.release(dish);
		assertEquals(beforeT1, wh.toolAvailability(0));
		assertEquals(beforeI1, wh.ingredientQantity(0));
		assertEquals(beforeT2+1, wh.toolAvailability(1));
		assertEquals(beforeI2, wh.ingredientQantity(1));
	}

	@Test
	public void testAddTool() {
		int before = wh.toolTypeCount();
		
		// tests addition of new tool.
		wh.addTool(new Tool("ing3", 4));
		int after1 = wh.toolTypeCount();
		assertEquals(before+1, after1);
		assertTrue("ing3".equals(""+wh.getTool(after1-1)));
		
		// tests addition of existing ingredient.
		wh.addTool(new Tool("ing3", 2));
		int after2 = wh.toolTypeCount();
		assertEquals(after1, after2);
		assertEquals(6, wh.toolAvailability(after1-1));		
	}
	
	
	@Test
	public void testAddIngredient() {
		int before = wh.ingredientTypeCount();
		
		// tests addition of new ingredient.
		wh.addIngredient(new Ingredient("ing3", 4));
		int after1 = wh.ingredientTypeCount();
		assertEquals(before+1, after1);
		assertTrue("ing3".equals(""+wh.getIngredient(after1-1)));
		
		// tests addition of existing ingredient.
		wh.addIngredient(new Ingredient("ing3", 2));
		int after2 = wh.ingredientTypeCount();
		assertEquals(after1, after2);
		assertEquals(6, wh.ingredientQantity(after1-1));
	}

}
