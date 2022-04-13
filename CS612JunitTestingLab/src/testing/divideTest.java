package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int num = 6;
		int den = 0;
		try {
			int output = (int) test.divide(num,den);
			assertEquals(3, output);
			if (den <= 0) {
				throw new ArithmeticException();
			}
		}
		catch (ArithmeticException ae){
			System.out.print("ArithmeticException");
		}
	}

}
