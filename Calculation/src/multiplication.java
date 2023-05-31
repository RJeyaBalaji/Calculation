import static org.junit.Assert.*;

import org.junit.Test;

public class multiplication {

	@Test
	public void test() {
		Calculator obj1 = new Calculator();
		int output = obj1.multiply(15, 7);
		assertEquals(105,output);
	}
	
	@Test
	public void test1() {
		Calculator obj1 = new Calculator();
		int output = obj1.multiply(0, 0);
		assertEquals(0,output);
	}
	
	@Test
	public void test2() {
		Calculator obj1 = new Calculator();
		int output = obj1.multiply(10, 0);
		assertEquals(0,output);
	}
	
	@Test
	public void test3() {
		Calculator obj1 = new Calculator();
		int output = obj1.multiply(-19, 5);
		assertEquals(-95,output);
	}
	
	@Test
	public void test4() {
		Calculator obj1 = new Calculator();
		int output = obj1.multiply(-12, -4);
		assertEquals(48,output);
	}

}
