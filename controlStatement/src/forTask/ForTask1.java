package forTask;

import java.util.Scanner;

public class ForTask1 {
	public static void main(String[] args) {

    
//  1~100까지 출력하기
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + " ");
		}
		System.out.println();   

//// 100~1까지 출력
//		
        for(int i = 100; i >= 1; i--) {
        	System.out.println(i + " ");
        }
        System.out.println();
//		
//// 1~100까지 중 짝수만 출력
        for (int i = 2; i <= 100; i += 2) {
        	System.out.print(i + " ");
        }
        System.out.println();
//		
//// 1~10까지의 합
        int sum = 0;
        for(int i = 1; i<=10; i++) {
        	sum += i;
        }
        System.out.println(sum);
//
//// 1~n까지의 합 (n값 지정)
        Scanner sc = new Scanner(System.in);
        int n = 0, sumN = 0;
        n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
        	sumN += i;
        }
        System.out.println(sumN);
//    
//// A~F까지 출력
//        char a = 'A';
//        for(int i = 0; i < 6; i++)
//        	System.out.println((char)(a + i));
        
        for(char a = 'A'; a <= 'F'; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
//
//// A~F까지 중 C를 제외하고 출력

        for(char b = 'A'; b <= 'F'; b++) {
        if(b != 'C') {
             System.out.print(b + " ");
        }
        }
        System.out.println();
//        
//  012340123401234 출력하기      
        for(int i = 0; i < 15; i++) {
             System.out.print(i % 5);
        }
        System.out.println();

// aBcDeF...Z까지 출력
//        int gap = 'a' - 'A';
//        for(int i = 0; i < 26; i++) {
//            System.out.print(i % 2 == 0 ? (char)(a + gap + i) : (char)(a + i));
//        }
//        System.out.println();
        
        

//  별찍기
//   *
//  ***
//  *****
//*******
//*********
	}
}