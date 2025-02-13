package lambdaTask2;

//	1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//	2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
//	3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
//	4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove, removeStr()
//	5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//	ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"

public class LambdaResult2 {
	public static void main(String[] args) {
		
//		1번 문제
//		PrintNum printNum = () -> {
//			for(int i = 0; i < 10; i++) {
//				System.out.println(i + 1);
//			}
//		};
//		
//		printNum.printUpTo10();
		
//		2번
		PrintString printString = (content, c) -> {
			int count = 0;
			for(int i = 0; i < content.length(); i++) {
				if(content.charAt(i) == c) {
					count++;
				}
			} 
			return count;
		};
		
		int result2 = printString.strCount("abcd", 'a');
		System.out.println(result2);
		
//		3번
		Reverse reverse = (str) -> {
			String result = "";
			for(int i = 0; i < str.length(); i++) {
				result += str.charAt(str.length() - i - 1);
			}
			return result;
		};
		
//		4번 문제
		Remove remove = (content, c) -> {
			String result = "";
			for(int i = 0; i < content.length(); i++) {
				if(content.charAt(i) == c) {
					continue;
				}
				result += content.charAt(i);
			}
			return result;
		};
		
		
		String result4 = remove.removeStr("abcdeg", 'b');
		System.out.println(result4);
		
//		5번 문제
		Deduce deduce = (content) -> {
			String result = "";
			for(int i = 0; i < content.length(); i++) {
				if(!result.contains(String.valueOf(content.charAt(i)))) {
					result += String.valueOf(content.charAt(i));
				}
			}
			return result;
		};
		
		String result5 = deduce.getDedupe("abcdabcdabcd");
		System.out.println(result5);
		
	}
}








