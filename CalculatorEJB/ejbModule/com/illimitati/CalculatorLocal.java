package com.illimitati;

import javax.ejb.Local;

@Local
public interface CalculatorLocal {
	
	int sum(int a, int b);
	
	int division(int a, int b);
	
	int subtraction(int a, int b);
	
	int multiplication(int a, int b);

}
