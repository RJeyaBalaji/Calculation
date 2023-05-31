import static org.junit.Assert.*;

import org.junit.Test;

public class division {

	@Test
	public void test() {
		Calculator obj1 = new Calculator();
		int output = obj1.divide(90, 6);
		assertEquals(15,output);
	}
	
	@Test(expected=ArithmeticException.class)
	public void test1() {
		Calculator obj1 = new Calculator();
		int output = obj1.divide(90, 0);
//		assertEquals(ArithmeticException,output);
	}
	
	@Test
	public void test2() {
		Calculator obj1 = new Calculator();
		int output = obj1.divide(0, 6);
		assertEquals(0,output);
	}
	
	@Test
	public void test3() {
		Calculator obj1 = new Calculator();
		int output = obj1.divide(-50, 5);
		assertEquals(-10,output);
	}
	
	@Test
	public void test4() {
		Calculator obj1 = new Calculator();
		int output = obj1.divide(-160, -4);
		assertEquals(40,output);
	}


}
