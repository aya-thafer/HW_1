package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import CALC.Calc;

public class Testcalc {

	@Test
	public void test_addTowPositive_retunPositive() {
		int x=2;
		int y=4;
		Calc c =new Calc();
		int z= c.add(x,y);
        assertTrue(z>0);
	}
	
	@Test
	public void test_addTownegative_retunnegative() {
		int x=-2;
		int y=-4;
		Calc c =new Calc();
		int z= c.add(x,y);
        assertTrue(z<0);
	}
	@Test(expected =ArithmeticException.class)
	public void test_divByZero_returnError() {
		int x=0;
		int y=4;
		Calc c =new Calc();
		int z= c.div(y,x);
        
	}
}
