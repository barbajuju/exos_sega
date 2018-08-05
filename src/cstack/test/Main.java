package cstack.test;

import cstack.CStack;

public class Main {
	

	
	public static void main (String[] args) {
		CStack stack = new CStack(10);
		stack.push("titi");
		stack.push(2);
		System.out.println(stack);

		
	}

}
