package lambdaTask2;
//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
//3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove, removeStr()
//5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
public class LambdaResult2 {
	public static void main(String[] args) {
//1번 문제
		PrintNum printNum = () -> {
	   		for(int i = 1; i <= 10; i++){
			System.out.println(i + " ");	   	
	   		}
	   	};
	   	
	   	printNum.printUpTo10();
	
//2번 문제
		PrintString printString = (str, target) -> {
			int count = 0;
	        for (int i = 0; i < str.length(); i++) { 
	        	if (str.charAt(i) == target) {
	        		count++;
	            }
	        }
	        return count;
	    };
	    String text = "안녕하십니까 안녕하세요 안녕";
	    char searchChar = '안';
	    int result = printString.strCount(text, searchChar);
	    
	    System.out.println(searchChar + "의 개수: " + result);
	  
	    
//3번 문제
        Reverse reverse = str -> {
        	String result = "";
        	for(int i = 0; i < str.length(); i++) {
        		result += str.charAt(str.length() - i - 1);
        	}
        	return result;
        };
        
        
	    String text2 = "배고파 밥먹고 싶다";
        String result2 = reverse.reverseString(text2);

        System.out.println("뒤집은 거: " + result2);
            
	}
}




