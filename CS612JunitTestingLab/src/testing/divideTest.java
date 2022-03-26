package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output1 = (int) test.divide(6,2);
		//int output2 = (int) test.divide(5,2);
		assertEquals(3, output1);
		//assertEquals(3, output2);
	}

}
