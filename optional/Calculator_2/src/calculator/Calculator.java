package calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private double result;
	private String operation;
	
	private ArrayList<Double> num = new ArrayList<>();
	private ArrayList<String> token = new ArrayList<>();
	
	public Calculator() {
		super();
		this.operation = null;
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
	
	public void performOperation(String operation) {
		setOperation(operation);
		if (operation == "=") {
			calcMultDive();
		} else {
			token.add(operation);
		}		
	}
	
	public void performOperation (double nextOperand) {
		num.add(nextOperand);
	}
	
	private void calcMultDive() {
		System.out.println(Arrays.asList(num));
		System.out.println(Arrays.asList(token));
		
		for (int idx = 0; idx < token.size(); idx++) {
			System.out.println("idx " + idx);
			if (token.get(idx).equals("*") || token.get(idx).equals("/")) {
				calcMutlDiv(idx);
				idx--;
			}
		}
		
		result = num.get(0);
		for (int idx = 0; idx < token.size(); idx++) {
			if (token.get(idx) == "+") {
				result += num.get(idx + 1);
			} else {
				result -= num.get(idx + 1);
			}
		}	
	}
	
	private void calcMutlDiv(int xx) {
		double tot = 0;
		if (token.get(xx).equals("*")) {
			tot = num.get(xx) * num.get(xx + 1);
		} else {
			tot = num.get(xx) / num.get(xx + 1);
		}
		
		num.set(xx, tot);
		num.remove(xx + 1);
		token.remove(xx);
		System.out.println(Arrays.asList(num));
		System.out.println(Arrays.asList(token));
		System.out.println(token.size());
	}
	
	public void getResults() {		
		System.out.printf("%.1f",result);
	}	
}
