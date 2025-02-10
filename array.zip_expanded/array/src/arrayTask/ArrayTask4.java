package arrayTask;

import java.util.Scanner;

public class ArrayTask4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
	//	      1번 문제
//		String message = "텍스트를 입력해주세요.", inputText = null;
//		char [] inputTextChar = null;
//		int numA = (int)'A', numZ = (int)'Z', gap = (int)'a' - (int)'A';
//		int count = 0;
//		
//		System.out.println(message);
//		
//		inputText = sc.nextLine() + (char)0;
//		while(inputText.charAt(count) != 0) {
//		   count++;
//		}
//		
//		inputTextChar = new char[count];
//		
//		for(int i = 0; i < count; i++) {
//			inputTextChar[i] = inputText.charAt(i);
//		   
//			if((int)inputTextChar[i] >= numA && (int)inputTextChar[i] <= numZ) {
//		   		int changeLetter = (int)inputTextChar[i] + gap;
//		   		inputTextChar[i] = (char)changeLetter;
//			} else if((int)inputTextChar[i] >= numA + gap && (int)inputTextChar[i] <= numZ + gap) {
//		      int changeLetter = (int)inputTextChar[i] - gap;
//		      inputTextChar[i] = (char)changeLetter;
//			}
//		}
//		
//		for(int i = 0; i < count; i++) {
//		   System.out.print(inputTextChar[i]);
//		}
	       
//	    2번 문제
//		int textLength = 0;
//		String word = "", message1 = "정수 또는 텍스트를 입력해주세요. ex)1024, 일공이사";
//		Scanner sc1 = new Scanner(System.in);
//
//		System.out.println(message1);
//		word = sc.nextLine() + (char)0;
//		while(word.charAt(textLength) != 0) {
//		   textLength++;
//		}
//
//		int[] arr = new int[textLength];
//		char[] hangle = new char[textLength]; 
//
//		for (int i = 0; i < textLength; i++) {
//			arr[i] = word.charAt(i);
//		}
//
//		for (int i = 0; i < textLength; i++) {
//		   switch(arr[i]) {
//		      case '0':
//		         hangle[i] = '공';
//		         break;
//		      case '1':
//		         hangle[i] = '일';
//		         break;
//		      case '2':
//		         hangle[i] = '이';
//		         break;
//		      case '3':
//		         hangle[i] = '삼';
//		         break;
//		      case '4':
//		         hangle[i] = '사';
//		         break;
//		      case '5':
//		         hangle[i] = '오';
//		         break;
//		      case '6':
//		         hangle[i] = '육';
//		         break;
//		      case '7':
//		         hangle[i] = '칠';
//		         break;
//		      case '8':
//		         hangle[i] = '팔';
//		         break;
//		      case '9':
//		         hangle[i] = '구';
//		         break;
//		   }        
//		}
//		
//		for (int i = 0; i < textLength; i++) {
//		    switch(arr[i]) {
//		       case '공':
//		          hangle[i] = '0';
//		          break;
//		       case '일':
//		          hangle[i] = '1';
//		          break;
//		       case '이':
//		          hangle[i] = '2';
//		          break;
//		       case '삼':
//		          hangle[i] = '3';
//		          break;
//		       case '사':
//		          hangle[i] = '4';
//		          break;
//		       case '오':
//		          hangle[i] = '5';
//		          break;
//		       case '육':
//		          hangle[i] = '6';
//		          break;
//		       case '칠':
//		          hangle[i] = '7';
//		          break;
//		       case '팔':
//		          hangle[i] = '8';
//		          break;
//		       case '구':
//		          hangle[i] = '9';
//		          break;
//		    }        
//		   }
//		  
//		for (int i = 0; i < textLength; i++) {
//			System.out.print(hangle[i]);
//		}
//		System.out.println();
	       
//	    3번 문제
		System.out.println("입력: ");
		
		String word2 = sc.nextLine() + (char)0;
		int count1 = 0;
		while(word2.charAt(count1) != 0) {
		    count1++;
		}
		
		String findWord = sc.next();
		System.out.println("찾을 문자 : " + findWord);
		int num = count1;
		
		char[] arr2 = new char[num];
		int cnt = 0;
		
		for(int i = 0; i < num; i++) {
		   arr2[i] = word2.charAt(i);
		   if(arr2[i] == findWord.charAt(0)){
		      cnt++;
		   }
		}
		System.out.println(findWord + "의 개수" + cnt + "개");

	}
}
