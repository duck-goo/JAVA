//package arrayTask;
//
//import java.util.Scanner;
//
//public class ArrayTask2 {
//	public static void main(String[] args) {
//		힌트 배열의 '열'은 나열
		
//		chatGPT X 검색 X
//		.charAt()
//		단 문자열의 메서드는 사용하지 않는다.
		
//		주말 -> 메서드를 사용해서 코드를 간결하게 만들기
		
		
//		1) 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//		대문자는 모두 소문자로 변경한다.
//		
//		입력 예) 안녕hI!!
//		출력 예) 안녕Hi!!
//		Scanner sc = new Scanner(System.in);
//		String input = null, message = "대소문자를 바꿀 문자열을 입력하세요.", result = "";
//		char[] arr1 = null;
//		int count = 0, gap = 32;
//		
//		System.out.println(message);
//		input = sc.nextLine();
//		
//		while(true) {
//			try {
//				input.charAt(count);
//				count++;
//			} catch (Exception e) {
//				break;
//			}
//		}
//		
//		arr1 = new char[count];
		
//		배열에 input값을 추가하기
//		for(int i = 0; i < count; i ++) {
//			arr1[i] = input.charAt(i);
//		}
		
//		arr1 = input.toCharArray();
		
//		for(int i = 0; i < arr1.length; i++) {
//			char c = arr1[i];
//			if(c >= 65 && c <= 90) {
//				result += (char)(c + gap);
//			}else if(c >= 97 && c <= 122) {
//				result += (char)(c - gap);
//			}else{
//				result += c;
//			}
//		}
//		
//		System.out.println(result);
		
// 과제1
//Scanner sc = new Scanner(System.in);
//        
//       System.out.print("대소문자를 바꿀 문자열을 입력하세요: ");
//        String input = sc.nextLine();
//        
//        StringBuilder result = new StringBuilder();
//        
//        for (char c : input.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                result.append(Character.toLowerCase(c));
//            } else if (Character.isLowerCase(c)) {
//                result.append(Character.toUpperCase(c));
//            } else {
//                result.append(c);
//            }
//        }
//        
//        System.out.println("변환 결과: " + result);
//        sc.close();
//    }

		
//
//		2) 정수를 한글로 변경
//		- 입력 값을 배열에 담고 정수를 한글로 변경
//		입력 예) 1024
//		출력 예) 일공이사

//		String input2 = null, message2 = "한글로 바꿀 1~9까지의 정수를 입력하세요.\nex)1024", result2 = "",
//				hangle = "공일이삼사오육칠팔구";
//		int[] arr2 = null;
//		int count2 = 0;
//		
//		System.out.println(message2);
//		input2 = sc.next();
//		
//		while(true) {
//			try {
//				input2.charAt(count2);
//				count2++;
//			} catch (Exception e) {
//				break;
//			}
//		}
//		
//		arr2 = new int[count2];
//		
//		for(int i = 0; i < arr2.length; i++) {
//			arr2[i] = input2.charAt(i) - 48;
//			result2 += hangle.charAt(arr2[i]);
//		}
//		
//		System.out.println(result2);
		
// 과제2
//		import java.util.Scanner;
//
//		public class NumberToKorean {
//		    public static void main(String[] args) {
//		        Scanner sc = new Scanner(System.in);
//		        
//		        System.out.print("한글로 바꿀 정수를 입력하세요 (ex: 1024): ");
//		        String input = sc.next();
//		        
//		        String[] koreanNumbers = {"공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
//		        StringBuilder result = new StringBuilder();
//		        
//		        for (char c : input.toCharArray()) {
//		            result.append(koreanNumbers[c - '0']); 
//		        }
//		        
//		        System.out.println("변환 결과: " + result);
//		        sc.close();
//		    }
//		}

		
		
		
//		3) 문자열과 찾을 문자를 입력받고
//		문자열에서 문자의 개수를 찾기
//		예시) 입력: content cc!
//			 찾을 문자 : c
//			 c의 개수 3개

//		String input3 = null, message3 = "전체 문장을 입력해주세요.",
//				message4 = "찾을 문자 1개를 입력하세요.\nex)e", result3 = "";
//		char find = ' ';
//		char[] arr3 = null;
//		int count3 = 0, foundCount = 0;
//		
//		System.out.println(message3);
//		input3 = sc.nextLine();
//		
//		System.out.println(message4);
//		find = sc.nextLine().charAt(0);
//		
//		while(true) {
//			try {
//				input3.charAt(count3);
//				count3++;
//			} catch (Exception e) {
//				break;
//			}
//		}
//
//		arr3 = new char[count3];
//		
//		for(int i = 0; i < arr3.length; i++) {
//			arr3[i] = input3.charAt(i);
//		}
//		
//		for(int i = 0; i < arr3.length; i++) {
//			if(arr3[i] == find) {
//				foundCount++;
//			}
//		}
//		
//		System.out.println("전체 문장: " + input3 + "\n찾으려고 하는 문자: " + find + "\n문자의 개수: " + foundCount);
//
//
//	}
// 과제3
//Scanner sc = new Scanner(System.in);	        
//	System.out.print("전체 문장을 입력하세요: ");
//	String input = sc.nextLine();	        
//	System.out.print("찾을 문자 1개를 입력하세요: ");
//	char find = sc.next().charAt(0);
//		        
//	long count = input.chars().filter(c -> c == find).count(); 
//		        
//	System.out.println("전체 문장: " + input);
//	System.out.println("찾는 문자: " + find);
//	System.out.println("문자의 개수: " + count + "개");       
//		    }
//		}

//}





