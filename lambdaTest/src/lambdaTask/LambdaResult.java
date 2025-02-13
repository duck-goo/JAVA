package lambdaTask;

// 람다식 구현해서 성과 이름 전달하고 전체 이름 콘솔에 출력
public class LambdaResult {
	public static void main(String[] args) {
			
	PrintName printName = (firstName, lastName) -> firstName + lastName;
		
		System.out.println(printName.makeFullName("이", "덕준"));
	}
}
