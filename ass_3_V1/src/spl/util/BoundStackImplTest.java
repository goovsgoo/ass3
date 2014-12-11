package spl.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoundStackImplTest {

	Stack<Integer> stack;
	
	@Before
	public void setUp() throws Exception {
	this.stack = new BoundStackImpl<Integer>(5);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStackImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testPush() {
		Integer i1 = 1;
		stack.push(i1);
		assertEquals(false, stack.isEmpty());
		
	}

	@Test
	public void testPop() {
		stack.push(new Integer(7));
		stack.push(new Integer(19));
		
		
		
	}
	@Test
	public void testTop() {
		stack.push(new Integer(7));
		stack.push(new Integer(19));
		Integer T = ((BoundStackImpl)stack).top();
		System.out.println("t: "+T.intValue());
		assertEquals(19, T.intValue());
		
		
	}
	@Test
	public void testRemove() {
		fail ("not implemented");
	}
	
	
	
	
	@Test
	public void testIsEmpty() {
		//stack.push(new Integer(7));
		assertEquals(true, stack.isEmpty());
		
	}

	@Test
	public void testIsFull() {
		Integer tst;
		for (int i=0;i<5;i++){
			tst = i;	//insert 5 times, check if full
			stack.push(tst);
			
		}
		assertEquals(true, stack.isFull());
		
	}

}
