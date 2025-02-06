package arrayTest;

import java.util.Scanner;

public class ArrayTask1 {
   public static void main(String[] args) {
//      25분
      
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력
//      int[] arData = new int[10];
//      for(int i = 0; i < 5; i++) {
//         arData[i] =  (5 - i) * 2;
//         System.out.println(arData[i]);
//      }
      
//      1~10까지 배열에 담고 출력
//      int[] arData2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      for(int i = 0; i < arData2.length; i++) {
//         System.out.println(arData2[i]);
//      }
      
//      1~100까지 배열에 담은 후 홀수만 출력
      /*
       * int[] arData3 = new int[100]; for(int i = 0; i < arData3.length; i++) {
       * arData3[i] = i + 1; if(i % 2 == 0) { System.out.println(arData3[i]);} }
       */
      
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
//      int[] arData4 = new int[100];
//      int result = 0;
//      
//      for(int i = 0; i < arData4.length; i++) {
//         arData4[i] = i + 1;
//         if(i % 2 == 0) { continue; }
//         result += arData4[i];
//      }
//      
//      System.out.println(result);
      
//      A~F까지 배열에 담고 출력
//      char[] arData5 = new char[6];
//      for(int i = 0; i < arData5.length; i++) {
//         arData5[i] = (char)(65 + i);
//         System.out.print(arData5[i]);
//      }
      
//      A~F까지 중 C를 제외하고 배열에 담은 후 출력
//      char[] arData6 = new char[5];
//      for(int i = 0; i < arData6.length; i++) {
//         arData6[i] = (char)(i > 1 ? 65 + i + 1 : 65 + i);
//         System.out.print(arData6[i]);
//      }
//      
//      
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
      Scanner sc = new Scanner(System.in);
      int[] arr7 = new int[5];
      int max = arr7[0], min = arr7[0];
      System.out.println("정수 5개를 입력하세용\n예) 1 2 3 4 5");
      	
      for(int i = 0; i < arr7.length; i++) {
      	arr7[i] = sc.nextInt();
      }
      
      	for(int i = 1; i < arr7.length; i++) {
      		if(arr7[i] > max) {
      			max = arr7[i]; 
      		}
            if(arr7[i] < min) {
            	min = arr7[i];
            }
        }     
        System.out.println("제일큰거: " + max);
        System.out.println("제일작은거: " + min);           
        }

//      다이아
//      사용자가 입력할 정수의 개수만큼 배열은 만든 후 정수를 입력받고 평균값 구하기
//      Scanner sc = new Scanner(System.in);
//      int[] arr8 = null;
//      System.out.println("정수를 입력하시오오\n예)1 4 5 6 9 6");
//      
//      for(int i = 0; i < arr8.length; i++) {
//    	  arr8[i] = sc.nextInt();
//      }
//      for 
      
}

