package classTest2;

import java.util.Arrays;
import java.util.Scanner;

//1. 로또 번호 생성.
	//1~45까지 랜덤 숫자 6개 생성, 중복방지 (강사님 코드 사용)
	//오름차순으로 정렬.
	//
	//2.로또 당첨 확인
	//구매자 유형 회사원인지 연구원인지, 다른 직군의 구매자인지 확인.
	//다른 직군이면 "로또를 구매할 수 없습니다" 출력
	//입력한 번호와 당첨 번호 비교.
	//일치하는 번호 개수 비교.
	//6개 일치 시 1등, 5개 일치 시 2등.
	//회사원, 연구원 각각 다른 당첨 메세지.
	//
	//3. 실행
	//당첨 번호 먼저 콘솔에 출력.
	//구매자 유형 입력 받음.
	//구매자 로또 번호 입력.
	//입력 번호와 당첨 번호 비교하여 결과 출력.

	public class Lotto { 
	    public String[] drawNumber() {
	        String[] luckyNumberArray = new String[6];

	        for(int i = 0; i < 6; i++) {
	            luckyNumberArray[i] = String.valueOf((int)Math.floor((Math.random() * 45 + 1)));
	            for(int j = 0; j < i; j++) {
	               if(luckyNumberArray[j].equals(luckyNumberArray[i])) {
	                  i--;
	                  break;
	                }
	            }
	        }

	        Arrays.sort(luckyNumberArray, (a, b) -> Integer.parseInt(a) - Integer.parseInt(b));

	        return luckyNumberArray;
	    }
	    //당첨 여부 확인, 회사원, 연구원 구분
	    public void checkLotto(String buyerType, String[] myNumbers, String[] luckyNumbers) {
	        //구매자 유형 확인
	       if(!buyerType.equals("회사원") && !buyerType.equals("연구원")) {
	           System.out.println("로또를 구매할 수 없습니다.");
	           return;
	        }
	       
	       //일치하는 숫자 갯수
	        int matchCount = 0;
	        for(int i = 0; i < myNumbers.length; i++) {
	            for(int j = 0; j < luckyNumbers.length; j++) {
	                if(myNumbers[i].equals(luckyNumbers[j])) {
	                   //같은숫자면 증가
	                   matchCount++; 
	                }
	            }
	        }
	        //결과출력
	        System.out.println("\n 추첨 번호: " + printArray(luckyNumbers));
	        System.out.println(" 내 번호: " + printArray(myNumbers));
	        System.out.println(" 일치하는 개수: " + matchCount);
	        
	        //1,2등 결과 메세지 구분
	        if(matchCount == 6) {
	            System.out.println(buyerType.equals("회사원") ? "\n1등 당첨! 직장을 그만둔다!" : "\n1등 당첨! 연구에 투자한다!");
	        }else if(matchCount == 5) {
	            System.out.println(buyerType.equals("회사원") ? "\n2등 당첨! 전액을 저축한다!" : "\n2등 당첨! 지인에게 밥을 산다!");
	        }else{
	            System.out.println("꽝입니다, 안타깝네요..");
	        }
	    }
	    // 배열 문자열로 변환
	    private static String printArray(String[] arr) {
	        String result = "";
	        for(int i = 0; i < arr.length; i++) {
	           result += arr[i] + " ";
	        }
	        // 마지막 공백 제거 트림
	        return result.trim();
	    }

	    public static void main(String[] args) {
	       //스캐너
	        Scanner scanner = new Scanner(System.in);
	        Lotto lotto = new Lotto();

	        String[] luckyNumbers = lotto.drawNumber();
	        System.out.println("이번 주 추첨 번호: " + printArray(luckyNumbers)); 
	        System.out.println("\n구매자의 직업을 입력하세요 (회사원/연구원):");
	        String buyerType = scanner.nextLine();

	        System.out.println("\n구매하신 로또 번호 6개를 입력하세요 (1부터 45까지, 띄어쓰기 필수!):");
	        String input = scanner.nextLine();
	        //입력 문자열 공백 기준 잘라서 배열로 
	        String[] myNumbers = input.split(" ");
	        //입력 번호 6개 아니면 메세지
	        if(myNumbers.length != 6) {
	           System.out.println("6개의 숫자를 입력해야 합니다!");
	        }else{
	            lotto.checkLotto(buyerType, myNumbers, luckyNumbers);
	        }
	    }
	}


