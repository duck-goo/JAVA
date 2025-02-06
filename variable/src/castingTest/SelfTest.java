package castingTest;

public class SelfTest {
	public static void main(String[] args) {
//        double pi = 3.14159;
//        int intPi = (int)pi; // 여기에 강제 형변환 추가
//
//        System.out.println("정수형 pi 값: " + intPi);
        
        
        char letter = 'J';
        int asciiValue = (int)letter ; // 'J'를 정수로 변환
        char nextLetter = (char)(letter + 1); // 정수값을 다시 문자로 변환 (letter + 1)

        System.out.println("문자: " + letter);
        System.out.println("아스키 코드 값: " + asciiValue);
        System.out.println("다음 문자: " + nextLetter);
	}
}      
