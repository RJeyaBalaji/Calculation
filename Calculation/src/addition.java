import static org.junit.Assert.*;

import org.junit.Test;

public class addition {

	@Test
	public void test() {
		Calculator obj1 = new Calculator();
		int output = obj1.sum(40, 80);
		assertEquals(120,output);
	}
	
	@Test
	public void test1() {
		Calculator obj1 = new Calculator();
		int output = obj1.sum(0, 0);
		assertEquals(0,output);
	}

	@Test
	public void test2() {
		Calculator obj1 = new Calculator();
		int output = obj1.sum(-19, -80);
		assertEquals(-99,output);
	}
	
	@Test
	public void test3() {
		Calculator obj1 = new Calculator();
		int output = obj1.sum(-87, 14);
		assertEquals(-73,output);
	}
	
	@Test
	public void test4() {
		Calculator obj1 = new Calculator();
		int output = obj1.sum(10000,40000);
		assertEquals(50000,output);
	}
	
	@Test
	public void test5() {
		Calculator obj1 = new Calculator();
		int output = obj1.sum(-40000, 10000);
		assertEquals(-30000,output);
	}
}
