package testings;

import static org.junit.Assert.*;
//TODO add JUNIT jar

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import restaurant.passives.*;;

public class WarehouseTesting {
	
	WarehouseTester wh;
	RepairTool tool1;
	RepairTool tool2;
	RepairMaterial material1;
	RepairMaterial material2;
	Repair repair;
	//OrderOfDish order; ????????????????
	
	
	@Before
	public void setUp() throws Exception {
		wh = new WarehouseTester();
		tool1 = new RepairMaterial("tool1", 2);
		tool2 = new RepairMaterial("tool2", 4);
		material1 = new RepairMaterial("material1", 6);
		material2 = new RepairMaterial("material2", 9);
		wh.addTool(tool1);
		wh.addTool(tool2);
		wh.addMaterial(material1);
		wh.addMaterial(material2);
		repair = new repair("repairOrder");
		repair.addTool("tool1", 1);
		repair.addMaterial("material2", 2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAcquire() {
		int beforeT1 = wh.toolAvailability(0);
		int beforeI1 = wh.materialQantity(0);
		int beforeT2 = wh.toolAvailability(1);
		int beforeI2 = wh.materialQantity(1);
		
		// tests that tool2 and ing2 and only them were acquired.
		wh.acquire(repair);
		assertEquals(beforeT1, wh.toolAvailability(0));
		assertEquals(beforeI1, wh.materialQantity(0));
		assertEquals(beforeT2-1, wh.toolAvailability(1));
		assertEquals(beforeI2-2, wh.materialQantity(1));
		
	}

	@Test
	public void testRelease() {
		int beforeT1 = wh.toolAvailability(0);
		int beforeI1 = wh.materialQantity(0);
		int beforeT2 = wh.toolAvailability(1);
		int beforeI2 = wh.materialQantity(1);

		// tests that tool2 and only tool2 was released.
		wh.release(repair);
		assertEquals(beforeT1, wh.toolAvailability(0));
		assertEquals(beforeI1, wh.materialQantity(0));
		assertEquals(beforeT2+1, wh.toolAvailability(1));
		assertEquals(beforeI2, wh.materialQantity(1));
	}

	@Test
	public void testAddTool() {
		int before = wh.toolTypeCount();
		
		// tests addition of new tool.
		wh.addTool(new Tool("Material3", 4));
		int after1 = wh.toolTypeCount();
		assertEquals(before+1, after1);
		assertTrue("Material3".equals(""+wh.getTool(after1-1)));
		
		// tests addition of existing Material.
		wh.addTool(new Tool("material3", 2));
		int after2 = wh.toolTypeCount();
		assertEquals(after1, after2);
		assertEquals(6, wh.toolAvailability(after1-1));		
	}
	
	
	@Test
	public void testAddMaterial() {
		int before = wh.materialTypeCount();
		
		// tests addition of new Material.
		wh.addMaterial(new RepairMaterial("material3", 4));
		int after1 = wh.materialTypeCount();
		assertEquals(before+1, after1);
		assertTrue("material3".equals(""+wh.getMaterial(after1-1)));
		
		// tests addition of existing ingredient.
		wh.addMaterial(new Material("material3", 2));
		int after2 = wh.materialTypeCount();
		assertEquals(after1, after2);
		assertEquals(6, wh.materialQantity(after1-1));
	}

}
