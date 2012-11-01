/**
 * 
 */
package calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the {@link Calculator} that utilizes reverse polish notation.
 * 		Enter Key - performs a push to the stack
 * 		Operators - Perform operation on last operand on the stack and current display value
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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		calculator = null;
	}

	/**
	 * Keypress Simulated - 1 Enter 2 Enter 5 +
	 */
	@Test
	public void shouldBeAbleToAddWhenPlusIsPressed() {
		calculator.push("1");//1 Enter
		calculator.push("2");//2 Enter
		calculator.setDisplayValue("5");// 5
		assertEquals(7, calculator.add());//+
	}

	/**
	 * Keypress Simulated - 2 Enter 6 Enter +
	 */
	@Test
	public void shouldBeAbleToAddWhenEnterIsPressed() {
		calculator.push("2"); //2 Enter
		calculator.push("6"); //6 Enter
		calculator.setDisplayValue("6");
		assertEquals(12, calculator.add()); //+
	}
	
	@Test
	public void shouldUpdateDisplayAfterAddition() {
		calculator.push("2"); //2 Enter
		calculator.push("6"); //6 Enter
		calculator.setDisplayValue("6");
		calculator.add();//+
		assertEquals("12", calculator.getDisplayValue());
	}
	
	/**
	 * Keypress Simulated - 2 Enter 1 Enter 5 -
	 */
	@Test
	public void shouldBeAbleToSubtractWhenMinusIsPressed() {
		calculator.push("2"); //2 Enter
		calculator.push("1"); //1 Enter
		calculator.setDisplayValue("5"); //5
		assertEquals(-4, calculator.subtract()); //-
	}

	/**
	 * Keypress Simulated - 2 Enter 5 Enter -
	 */
	@Test
	public void shouldBeAbleToSubtractWhenEnterIsPressed() {
		calculator.push("2");//2 Enter
		calculator.push("5");//5 Enter
		calculator.setDisplayValue("5");
		assertEquals(0, calculator.subtract()); //-
	}

	@Test
	public void shouldUpdateDisplayAfterSubtracting() {
		calculator.push("2");//2 Enter
		calculator.push("5");//5 Enter
		calculator.setDisplayValue("5");
		calculator.subtract(); //-
		assertEquals("0", calculator.getDisplayValue());
	}
	
	/**
	 * Keypress Simulated - 2 Enter 5 *
	 */
	@Test
	public void shouldBeAbleToMultiplyWhenTimesIsPressed() {
		calculator.push("2");//2 Enter
		calculator.setDisplayValue("5");//5
		assertEquals(10, calculator.multiply());
	}

	/**
	 * Keypress Simulated - 2 Enter 5 Enter *
	 */
	@Test
	public void shouldBeAbleToMultiplyWhenEnterIsPressed() {
		calculator.push("2");//2 Enter
		calculator.push("5");//5 Enter
		calculator.setDisplayValue("5");
		assertEquals(25, calculator.multiply());
	}
	
	@Test
	public void shouldUpdateDisplayAfterMultiplying() {
		calculator.push("2");//2 Enter
		calculator.push("5");//5 Enter
		calculator.setDisplayValue("5");
		calculator.multiply();
		assertEquals("25", calculator.getDisplayValue());
	}
	
	/**
	 * Keypress Simulated - 4 Enter 2 /
	 */
	@Test
	public void shouldBeAbleToDivideWhenDivideIsPressed() {
		calculator.push("4");//4 Enter
		calculator.setDisplayValue("2");//2
		assertEquals(2, calculator.divide());
	}

	/**
	 * Keypress Simulated - 4 Enter 2 Enter /
	 */
	@Test
	public void shouldBeAbleToDivideWhenEnterIsPressed() {
		calculator.push("4");//4 Enter
		calculator.push("2");//2 Enter
		calculator.setDisplayValue("2");
		assertEquals(1, calculator.divide());
	}	

	@Test
	public void shouldUpdateDisplayAfterDividing() {
		calculator.push("4");//4 Enter
		calculator.push("2");//2 Enter
		calculator.setDisplayValue("2");
		calculator.divide();
		assertEquals("1", calculator.getDisplayValue());
	}
	
	/**
	 * Keypress Simulated - 4 Enter 0 /
	 */
	@Test
	public void shouldDisplayErrorWhenDividingByZero() {
		calculator.push("4");//4 Enter
		calculator.setDisplayValue("0");//0
		calculator.divide();// {divide key}
		assertEquals("Error: Division by 0.", calculator.getDisplayValue());
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
