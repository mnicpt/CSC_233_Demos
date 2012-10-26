/**
 * 
 */
package calculator;

import java.util.Stack;

/**
 * @author smask
 *
 */
public class Calculator {

	private Stack<String> operands;
	
	public Calculator() {
		operands = new Stack<String>();
	}
	
	public void push(String operand) {
		operands.push(operand);
	}

	public int add() {
		int operand1 = pop();
		int operand2 = pop();
		return operand1 + operand2;
	}

	public int subtract() {
		int operand1 = pop();
		int operand2 = pop();
		return operand2 - operand1;
	}

	public int multiply() {
		int operand1 = pop();
		int operand2 = pop();
		return operand1 * operand2;
	}

	public int divide() {
		int operand1 = pop();
		int operand2 = pop();
		return operand2 / operand1;
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
		return 0;
	}
}
