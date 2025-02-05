package variableTest;

public class FormatTest {
	public static void main(String[] args) {
		String name = "이덕준";
		int age = 39;
		double height = 200.7;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("키 : %.1fcm", height);
	}
}
