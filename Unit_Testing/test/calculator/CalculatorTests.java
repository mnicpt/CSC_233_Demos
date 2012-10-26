/**
 * 
 */
package calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the @link Calculator that utilizes reverse polish notation.
 * 
 * @author 		smask
 * @version 	1.0
 *
 */
public class CalculatorTests {

	private Calculator calculator;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
		
		calculator.push("1");
		calculator.push("3");
		calculator.push("5");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		calculator = null;
	}

	@Test
	public void shouldBeAbleToAddWhenThreeAreOnTheStack() {
		int result = calculator.add();
		assertEquals(8, result);
	}

	@Test
	public void shouldBeAbleToSubtractWhenThreeAreOnTheStack() {
		int result = calculator.subtract();
		assertEquals(-2, result);
	}

	@Test
	public void shouldBeAbleToMultiplyWhenThreeAreOnTheStack() {
		int result = calculator.multiply();
		assertEquals(15, result);
	}

	@Test
	public void shouldBeAbleToDivideWhenThreeAreOnTheStack() {
		int result = calculator.divide();
		assertEquals(3/5, result);
	}
	
	@Test
	public void shouldBeAbleToClearTheCalculator() {
		calculator.push("3");
		calculator.push("5");
		calculator.push("1");
		int result = calculator.clear();
		assertEquals(0, result);
	}
}
