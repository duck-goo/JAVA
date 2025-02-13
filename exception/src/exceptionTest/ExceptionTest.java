package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] arData = new int[5];
		int num = 0;
		
		try {
//			System.out.println(arData[10]);
			arData[0] = 20;
			System.out.println(arData[0] / num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인데스 확인!");
		} catch (ArithmeticException e) { //데드 코드 (위에서 부모가 잡음)
			System.out.println("0으로 나눌수 없당");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
