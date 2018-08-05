package cstackxception;

import org.omg.CORBA.PUBLIC_MEMBER;

import cstack.ICStack;

public class MaxSizeReachedException extends Exception{
	
	private ICStack stack;
	
	public MaxSizeReachedException (ICStack stack) {
		this.stack = stack;
	}

	@Override
	public String getMessage() {
		
		StringBuilder sb = new StringBuilder("La taille max de la pile est atteinte");
		sb.append(("La taille max est de : "))Appendable(stack.size());
		return sbtoString;
	}

	
	
}
