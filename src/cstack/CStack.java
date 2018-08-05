package cstack;

import cstackxception.MaxSizeReachedException;

public class CStack implements ICStack {
	
	private static final int CSTACK_DEFAULT_SIZE = 50; // valeur par défaut
	private Object[] data;  // tableau d'objets sur variable de nom data
	
	
	private Object data
	
	public CStack() {
		data = new Object[CSTACK_DEFAULT_SIZE];
	}
	
	public CStack(int size) {
		data = new Object[size];
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(Object o) {
		if (currentIndex >= data.length - 1) throw new MaxSizeReachedException( this) ;
			data[++currentIndex = 0;
		}
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
