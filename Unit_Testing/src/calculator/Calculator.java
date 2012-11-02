/**
 * 
 */
package calculator;

import java.io.Serializable;
import java.util.Stack;

/**
 * @author smask
 *
 */
public class Calculator implements Serializable{

	private static final long serialVersionUID = -9219489523716397746L;

	private Stack<String> operands;
	
	private String displayValue;
	
	public Calculator() {
		operands = new Stack<String>();
	}
	
	public void push(String operand) {
		operands.push(operand);
		setDisplayValue(operand);
	}

	public int add() {
		int operand1 = pop();
		int operand2 = Integer.parseInt(getDisplayValue());
		int result = operand1 + operand2;
		setDisplayValue(String.valueOf(result));
		return result;
	}

	public int subtract() {
		int operand1 = pop();
		int operand2 = Integer.parseInt(getDisplayValue());
		int result = operand1 - operand2;
		setDisplayValue(String.valueOf(result));
		return result;
	}

	public int multiply() {
		int operand1 = pop();
		int operand2 = Integer.parseInt(getDisplayValue());
		int result = operand1 * operand2;
		setDisplayValue(String.valueOf(result));
		return result;
	}

	public int divide() {
		int operand1 = pop();
		int operand2 = Integer.parseInt(getDisplayValue());
		int result = 0;
		try {
			result = operand1 / operand2;
			setDisplayValue(String.valueOf(result));
		} catch(ArithmeticException e) {
			setDisplayValue("Error: Division by 0.");
		}
		return result;
	}

	private int pop() {
		int result = 0;
		if(!operands.empty()) {
			result = Integer.parseInt(operands.pop());
		}
		return result;
	}

	public int clear() {
		operands = new Stack<String>();
		setDisplayValue("0");
		return 0;
	}

	public String getDisplayValue() {
		return displayValue;
	}
	
	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}
}
