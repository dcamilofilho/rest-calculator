package com.illimitati;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Calculator
 */
@Stateless(mappedName = "ejb.CalculatorEJB")
public class Calculator implements CalculatorRemote, CalculatorLocal {

	/**
	 * Default constructor.
	 */
	public Calculator() {

	}

	@Override
	public int sum(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + b);		
		return a + b;
	}

	@Override
	public int division(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + b);		
		return a / b;
	}

	@Override
	public int subtraction(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + b);		
		return a - b;
	}
	@Override
	public int multiplication(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + b);		
		return a * b;
	}

}
