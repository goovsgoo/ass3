package spl.util;
import static org.junit.Assert.fail;

import java.util.Vector;

public class BoundStackImpl<T> implements Stack<T>{

	//Vector<Integer> vec = new Vector<Integer>();
	Vector<Integer> vec;
	int max_size;
	
	BoundStackImpl(int num){
		max_size = num;
		vec = new Vector<Integer>(max_size);
		System.out.println("created. current: "+vec.capacity());
	}
	@Override
	
	public void push(T obj) {
		vec.add((Integer)obj);
		}

	@Override
	public T pop() throws Exception {
		
		return null;
	}

	
	@Override
	public boolean isEmpty() {
		return vec.isEmpty();
	}

	@Override
	public boolean isFull() {
		System.out.println("curerntly: "+vec.size());
		return (vec.capacity() ==vec.size());
	}
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Integer top() {
		Integer T;
		T = (Integer)vec.lastElement();
		return T;
		
	}

}
