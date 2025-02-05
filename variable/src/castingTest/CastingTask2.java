package castingTest;

public class CastingTask2 {
	public static void main(String[] args) {
//      1번 문제
		int num1 = 1;
	      String dstr1 = "8.24", dstr2 = "7.8";
	      
	      System.out.printf("%d",num1);
	      System.out.println((int)(Double.parseDouble(dstr1)) + (int)(Double.parseDouble(dstr2)));
//		
//      2번 문제
//      a, j, k를 연산하여 A, J, K를 출력하기
		char str1 = 'a';
		char str2 = 'j';
		char str3 = 'k';
		int result1 = str1 - 32;
		int result2 = str2 - 32;
		int result3 = str3 - 32;
		
		System.out.println((char)result1);
		System.out.println((char)result2);
		System.out.println((char)result3);

      
//      3번 문제
//      "12.123"
//      "345.789"
//      "6789.456"
//      3개 값을 더해서 123456789를 출력하기
//		String str12 = "12.123";
//	    String str345 = "345.789";
//	    String str6789 = "6789.456";
//	      
//	    double dnum12 = Double.parseDouble(str12);
//	    double dnum345 = Double.parseDouble(str345);
//	    double dnum6789 = Double.parseDouble(str6789);
//	      
//	    System.out.printf("%d%d%d",(int)dnum12,(int)dnum345,(int)dnum6789);
		
	}
}
