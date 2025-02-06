package inputTask;
import java.util.Scanner;

public class InputTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("첫번째 : ");
        int num1 = Integer.parseInt(sc.next()); 
        System.out.print("두번째 : ");
        int num2 = Integer.parseInt(sc.next());
        int sum = num1 + num2; 

        System.out.println("합은 바로: " + sum);

     }
}
