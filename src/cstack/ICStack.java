package cstack;

import javax.naming.event.ObjectChangeListener;

public interface ICStack {
	
	public  Object peek();
	public Object pop();
	public void push(Object o);
	public boolean isEmpty();
	public int size();
	
}