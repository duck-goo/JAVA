package methodTask;

public class MethodTask4 {
//   1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
   int getCountOfCharactorInContent(String content, char c) {
      int count = 0;
      for(int i = 0; i < content.length(); i++) {
         if(content.charAt(i) == c) {
            count++;
         }
      }
      return count;
   }
   
   
//   2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
   int getValueInArray(int[] arData, int index) {
      return arData[index];
   }
   
//   3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
   int changeToInteger(String hangle) {
//      .indexOf('일') : 값이 있으면 그 index 값을 리턴
      String hangles = "공일이삼사오육칠팔구";
      String result = "";
      for(int i = 0; i < hangle.length(); i++) {
         result += hangles.indexOf(hangle.charAt(i));
      }
      return Integer.parseInt(result);
   }
   
//   4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드
   int[] getMaxAndMin(int[] arData) {
      int[] arResult = { arData[0], arData[0] };
      for(int i = 1; i < arData.length; i++) {
         if(arResult[0] < arData[i]) {
            arResult[0] = arData[i];
         }
         if(arResult[1] > arData[i]) {
            arResult[1] = arData[i];
         }
      }
      return arResult;
   }
   
   
//   5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
   void getMaxAndMin(int[] arData, int[] arResult) {
      for(int i = 0; i < arData.length; i++) {
         if(arResult[0] < arData[i]) {
            arResult[0] = arData[i];
         }
         if(arResult[1] > arData[i]) {
            arResult[1] = arData[i];
         }
      }
   }
   
   
//   매개 변수 2개 : 최솟값과 최댓값을 구할 배열, 최솟값과 최댓값을 구한 결과를 담을 배열
//   6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
   int indexOf(String content, char c) {
      for(int i = 0; i < content.length(); i++) {
         if(content.charAt(i) == c) {
            return i;
         }
      }
      return -1;
   }
   
   
   public static void main(String[] args) {
      MethodTask4 mt4 = new MethodTask4();
      
//      1번 문제 풀이
      int count = mt4.getCountOfCharactorInContent("apple", 'p');
      System.out.println(count);
      
//      2번 문제 풀이
      int result = mt4.getValueInArray(new int[] {1, 3, 5, 7, 9}, 2);
      System.out.println(result);
      
//      3번 문제 풀이
      int result3 = mt4.changeToInteger("팔팔공이삼사");
      System.out.println(result3);
      
//      4번 문제 풀이
      int[] arResult = mt4.getMaxAndMin(new int[] {3, 6, 1, 8, 10});
      System.out.println("최댓값 : " + arResult[0]);
      System.out.println("최솟값 : " + arResult[1]);
      
//      5번 문제풀이
      int[] arData = {3, 10, 20, 30, 11};
      int[] arResult2 = {arData[0], arData[0]};
      mt4.getMaxAndMin(arData, arResult2);
      System.out.println("최댓값 : " + arResult2[0]);
      System.out.println("최솟값 : " + arResult2[1]);
      
//      6번 문제풀이
      int result6 = mt4.indexOf("apple", 'e');
      System.out.println(result6);
   }
   
   
}































