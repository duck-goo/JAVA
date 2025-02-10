package methodTask;

public class MethodTask1 {
//	1~10까지 println으로 출력하는 메서드
	void printFromTo10() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
//	"홍길동" 이름을 n번 println()으로 출력하는 메서드
	void printNameHong(int count) {
		for(int i = 0; i < count; i++) {
			System.out.println("홍길동");
		}
	}
	
//	결과를 콘솔에 출력하기
	public static void main(String[] args) {
		MethodTask1 mt1 = new MethodTask1();
		
		mt1.printFromTo10();
		mt1.printNameHong(5);
		
	}
	
}
