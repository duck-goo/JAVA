package inputTask;
import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0, sum = 0;
		System.out.print("첫번째 : ");
        num1 = Integer.parseInt(sc.next()); 
        System.out.print("두번째 : ");
        num2 = Integer.parseInt(sc.next());
        System.out.print("세번째 : ");
        num3 = Integer.parseInt(sc.next());
        sum = num1 * num2 * num3; 
        String message = "결과는";
        System.out.println(message+" " + sum);
}
}
//		Scanner sc = new Scanner(System.in);
//		String message = "정수 3개 입력", 
//				resultMessage = "%d * %d * %d = %d";
//		System.out.println(message);
//		int num1 = 0, num2 = 0, num3 = 0, result = 0;
////		num1 = Integer.parseInt(sc.next());
////		num2 = Integer.parseInt(sc.next());
////		num3 = Integer.parseInt(sc.next());
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		result = num1 * num2 * num3;
//		System.out.printf(resultMessage, num1, num2, num3, result);