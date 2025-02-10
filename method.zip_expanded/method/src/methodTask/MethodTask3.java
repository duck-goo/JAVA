package methodTask;

public class MethodTask3 {
	
//	1) 세 정수를 뺄셈해서 결과값을 알려주는 메소드
	int subtract(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
	
//	2) 두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드(배열사용)
	int[] getResultByDivision(int num1, int num2) {
		return new int[] { num1 / num2, num1 % num2 };
	}
	
//	3) 1~n까지의 합을 구해주는 메소드
	int getTotalFrom1(int count) {
		int result = 0;
		for(int i = 0; i < count; i++) {
			result += i + 1;
		}
		return result;
	}
	
//	4) 어떤 값이 홀수인지 짝수인지 알려주는 메소드
	String isEvenOdd(int num) {
		if(num == 0) { return "0은 홀수 짝수를 확인할 수 없습니다."; }
		return num % 2 == 0 ? "짝수" : "홀수";
	}
	
//	5) 문자열을 입력받고 소문자는 대문자로, 
//	대문자는 소문자로 바꿔주는 메소드
	String changeToUpperCaseOrToLowerCase(String content) {
		String result = "";
		for(int i = 0; i < content.length(); i++) {
			char c = content.charAt(i);
			if(c >= 65 && c <= 90) {
				result += (char)(c + 32);
			}else if(c >= 97 && c <= 125) {
				result += (char)(c - 32);
			}else {
				result += c;
			}
		}
		return result;
	}
	
	
//	모든 결과 값은 콘솔에 출력하여 확인하기
	
	public static void main(String[] args) {
		MethodTask3 mt3 = new MethodTask3();
		int result1 = 0, result3 = 0;
//		null : 초기값이 어떤 값으로 대체될 때 사용되는 값, 크기 할당x
//		"" : 결과값이 ""을 연결해서 사용하거나 결과값을 얻을 때, 크기 할당(2byte)
		String result4 = null, result5 = null;
		int[] arr = null; 
		
//		1번 풀이
		result1 = mt3.subtract(10, 5, 3);
		System.out.println(result1);
		
//		2번 풀이
		arr = mt3.getResultByDivision(20, 4);
		System.out.println("두 수의 몫: " + arr[0]);
		System.out.println("두 수의 나머지: " + arr[1]);
		
//		3번 풀이
		result3 = mt3.getTotalFrom1(10);
		System.out.println(result3);
		
//		4번 풀이
		result4 = mt3.isEvenOdd(0);
		System.out.println(result4);
		
//		5번 풀이
		result5 = mt3.changeToUpperCaseOrToLowerCase("오늘 즐거운 Friday!");
		System.out.println(result5);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
