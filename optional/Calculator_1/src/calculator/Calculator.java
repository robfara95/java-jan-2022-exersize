package calculator;

public class Calculator implements java.io.Serializable {
	private double operandOne;
	private double operandTwo;
	private double result;
	private String operation;
	
	public Calculator() {
		super();
	}
	
	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	public double getResult() {
		return result;
	}

	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void performOperation () {
		if (operation.equals("+")) {
			result = operandOne + operandTwo;
		} else if (operation.equals("-")) {
			result = operandOne - operandTwo;
		} else {
			result = 0;
		}		
	}
	
	public void getResults() {
		System.out.printf("%.1f %s %.1f = %.1f",operandOne, operation, operandTwo, result);
	}
	
}
