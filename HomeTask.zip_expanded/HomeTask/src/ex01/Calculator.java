package ex01;

public class Calculator {
	public void calcNum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public double calcNum(int num1, double num2) {
		return num1 + num2;
	}
	
	public int calcNum(double num1) {
		return (int)num1;
	}
	
	public void calcNum(String str1, String str2) {
		System.out.println(str1 + str2);
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.calcNum(5, 4);
		
		double result1 = calc.calcNum(8, 2.5);
		System.out.println(result1);
		
		int result2 = calc.calcNum(7.4);
		System.out.println(result2);
		
		calc.calcNum("안녕, ", "집에서 복습하고 있지");
	}
}
