package operTask;

import java.util.Scanner;

public class OperTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// 사용자에게 값을 입력받고
// 정수라면 정수입니다.
// 실수라면 실수입니다.
// 예) 183 -> 입력한 값은 정수입니다.
// 183.5 -> 입력한 값은 실수입니다.
// 삼항연산자 사용하기      
	     System.out.print("값을 입력하세요: ");
		 String input = sc.next();      
		 String result = (input.contains(".")) ? "입력한 값은 실수입니다." : "입력한 값은 정수입니다.";
		 System.out.println(result);

	}
}

