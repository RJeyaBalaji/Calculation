import static org.junit.Assert.*;

import org.junit.Test;

public class subtraction {

	@Test
	public void test() {
		Calculator obj1 = new Calculator();
		int output = obj1.subtract(60, 30);
		assertEquals(30,output);
	}

	@Test
	public void test1() {
		Calculator obj1 = new Calculator();
		int output = obj1.subtract(0, 0);
		assertEquals(0,output);
	}

	@Test
	public void test2() {
		Calculator obj1 = new Calculator();
		int output = obj1.subtract(-19, -80);
		assertEquals(61,output);
	}
	
	@Test
	public void test3() {
		Calculator obj1 = new Calculator();
		int output = obj1.subtract(-87, 14);
		assertEquals(-101,output);
		System.out.println(output);
	}
	
	@Test
	public void test4() {
		Calculator obj1 = new Calculator();
		int output = obj1.subtract(10000,40000);
		assertEquals(-30000,output);
		System.out.println(output);
	}
	
	@Test
	public void test5() {
		Calculator obj1 = new Calculator();
		int output = obj1.subtract(-40000, 10000);
		assertEquals(-50000,output);
		System.out.println(output);
	}
}
