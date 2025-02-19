package collectionTest;

public class Array {
	public static void main(String[] args) {
		
		int[] arData = new int[2];
		int[] arTemp = new int[2];
		int[] arTemp2 = new int[3];
		
		arData[0] = 1;
		arData[1] = 2;
		
//		회원을 추가
		arTemp[0] = arData[0];
		arTemp[1] = arData[1];
				
		arData = new int[3];
		
		arData[0] = arTemp[0];
		arData[1] = arTemp[1];
		arData[2] = 3;
		
//		회원추가 
		System.out.println("퇴사");
	}
}




