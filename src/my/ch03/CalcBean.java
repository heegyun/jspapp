package my.ch03;

/**
 * File : CalcBean.java
 * Desc : 계산기 빈즈 클래스
 * 
 */
public class CalcBean{

	// 멤버변수
	private int  num1,num2;
	private String operator="";
	private int result;


	// 계산기능 메서드
	public void calculate() {
		if(operator.equals("+")) {
			result = num1 + num2;
		}
		else if(operator.equals("-")) {
			result = num1 - num2;
		}
		else if(operator.equals("*")) {
			result = num1 * num2;
		}
		else if(operator.equals("/")) {
			result = num1 / num2;
		}
	}
	
	// setXxx 메서드
	public void setNum1(String num1) {
		this.num1 = Integer.parseInt(num1);
	}
	public void setNum2(String num2) {
		this.num2 = Integer.parseInt(num2);
	}
	public void setOperator(String operator) {
		System.err.println("## "+operator);
		this.operator = operator;
	}

	// getXxx 메서드
	public int getResult() {
		return result;
	}
}