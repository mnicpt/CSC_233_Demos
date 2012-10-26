package calculator;

public class Screen {
	public int result(int operand1, int operand2, String operator) {
		if("+".equals(operator)) {
			return operand1 + operand2;
		}
		return 0;
	}
}
