package lotto;

import java.util.Arrays;
import java.util.Scanner;

//클래스 Lotto
//메서드 drawNumber로 추첨한다. 추첨은 아래와 같다.
//1 ~ 45까지의 랜덤한 숫자를 6개 추출한다.
//
//메서드 checkLotto
//로또의 구매는 회사원과 연구원만 구매할 수 있으며 checkLotto 메서드로 당첨자를 확인한다.
//로또를 구매하는 회사원과 연구원이 아닌 경우 "로또를 구매할 수 없습니다"를 출력한다.
//
//회사원과 연구원이 가진 로또 번호가 
//1등 또는 2등이라면 각각의 메서드를 실행한다.
//
//회사원 1등 시 콘솔에 "직장을 그만둔다"를 출력한다.
//회사원 2등 시 콘솔에 "전액을 저축한다"를 출력한다.
//
//연구원 1등 시 콘솔에 "연구에 투자한다"를 출력한다.
//연구원 2등 시 콘솔에 "지인에게 밥을 산다"를 출력한다.


//알고리즘을 짜보자 제발 하나하나 천천히

//1. 로또 번호 생성 drawNumber
1~45까지 랜덤 숫자 6개 생성, 중복방지
>오름차순으로 정렬. 

//2.로또 당첨 확인 checkLotto
구매한 사람이 회사원인지 연구원인지
> 다른 직업이면 "로또를 구매할 수 없습니다" 출력 구매자 확인 시 회사원 연구원 둘다 아니면 메세지
>> 당첨됐는지 확인은....... 콘솔에 입력한 번호랑 기존 출력된 당첨 번호 비교
>>> 입,출력 번호끼리 같은 번호 갯수 비교 포문 돌려서 값 이퀄이면 변수값 하나씩 증가
>>>> 6개가 일치하면 1등, 5개가 일치하면 2등
>>>>> 회사원, 연구원 각 등수에 맞게 다른 당첨 메세지
>>>>>> 회사원 1등 "직장을 그만둔다!" 연구원 "연구에 투자한다!"
>>>>>>> 회사원 2등 "전액을 저축한다?" 연구원 "지인에게 밥을 산다!"


상속, 캐스팅 적용 한다면....
lotto를 부모로 놓고 (랜덤 숫자 생성)
자식클래스는 1.회사원 2.연구원 3.메인
1번,2번은 자식 클래스 등수에 따라 메세지 다르게 출력하는거
lotto클래스에 일치하는 숫자 갯수 메서드 만들어 놓고 오버라이딩
구매자 타입에 따라 회사원 / 연구원 객체 만들기


//3. 실행
콘솔 실행하면 당첨번호 먼저 출력
> 구매자한 사람 직업 입력 받고
>> 구매자 로또 번호 입력
>>> 입력 번호와 당첨 번호 비교하여 결과 출력

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
