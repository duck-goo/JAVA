package methodTask;

import java.util.Scanner;

public class MethodTask4 {
////	1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
//	int getCountOfCharactorInContent(String content, char c) {
//		int count = 0;
//		for(int i = 0; i < content.length(); i++) {
//			if(content.charAt(i) == c) {
//				count++;
//			}
//		}
//		return count;
//	}
//	
//	
////	2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
//	int getValueInArray(int[] arData, int index) {
//		return arData[index];
//	}
//	
////	3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
//	String changeToInteger(String hangle) {
////		.indexOf('일') : 값이 있으면 그 index 값을 리턴
//		String hangles = "공일이삼사오육칠팔구";
//		String result = "";
//		for(int i = 0; i < hangle.length(); i++) {
//			result += hangles.indexOf(hangle.charAt(i));
//		}
//		return result;
//	}
//	
////	4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드
//	public static int[] findMinMax(int[] numbers) {
//	   int min = numbers[0]; 
//	   int max = numbers[0]; 
//		          
//	   for (int num : numbers) {
//	      if (num < min) {
//	         min = num;
//	       }
//	       if (num > max) {
//	          max = num;
//	          }
//	       }
//	           return new int[]{min, max};
//	       }
//
//	public static void main(String[] args) {
//	   Scanner sc = new Scanner(System.in);
//	   int[] numbers = new int[5];
//
//	   System.out.println("5개의 정수를 입력하세요:");
//	   for (int i = 0; i < 5; i++) {
//	      numbers[i] = sc.nextInt();
//	   }
//	   
//	   int[] result = findMinMax(numbers);
//	   System.out.println("최소값: " + result[0] + ", 최대값: " + result[1]);
//	   }
//	5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
//	매개 변수 2개 : 최솟값과 최댓값을 구할 배열, 최솟값과 최댓값을 구한 결과를 담을 배열
//	public static void findMinMax2(int[] numbers, int[] results) {
//	    int min = numbers[0];
//	    int max = numbers[0];
//
//	    for (int num : numbers) {
//	        if (num < min) min = num;
//	        if (num > max) max = num;
//	    }
//
//	    results[0] = min;
//	    results[1] = max;
//	}
//	public static void main(String[] args) {
//	    Scanner sc = new Scanner(System.in);
//	    int[] numbers2 = new int[5];
//	    int[] results = new int[2];
//
//	    System.out.println("5개의 정수를 입력하세요:");
//	    for (int i = 0; i < 5; i++) {
//	        numbers2[i] = sc.nextInt();
//	    }
//
//	    findMinMax2(numbers2, results); 
//	    System.out.println("최소값: " + results[0] + ", 최대값: " + results[1]); 
//	}
		
//	6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	public int indexOf(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    public void run() {
        String text = "Hi, My Name is DeokJun Lee";

        int index1 = indexOf(text, 'D');
        int index2 = indexOf(text, 'e');
        int index3 = indexOf(text, 'L');

        System.out.println("D의 위치: " + index1);
        System.out.println("e의 위치: " + index2);
        System.out.println("L의 위치: " + index3);
    }
}











