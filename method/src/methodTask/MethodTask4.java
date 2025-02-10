package methodTask;

public class MethodTask4 {
//	1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
	int getCountOfCharactorInContent(String content, char c) {
		int count = 0;
		for(int i = 0; i < content.length(); i++) {
			if(content.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	
	
//	2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
	int getValueInArray(int[] arData, int index) {
		return arData[index];
	}
	
//	3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
	String changeToInteger(String hangle) {
//		.indexOf('일') : 값이 있으면 그 index 값을 리턴
		String hangles = "공일이삼사오육칠팔구";
		String result = "";
		for(int i = 0; i < hangle.length(); i++) {
			result += hangles.indexOf(hangle.charAt(i));
		}
		return result;
	}
	
//	4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드
//	5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
//	매개 변수 2개 : 최솟값과 최댓값을 구할 배열, 최솟값과 최댓값을 구한 결과를 담을 배열
//	6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	
}










