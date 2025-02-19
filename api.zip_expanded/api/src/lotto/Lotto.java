package lotto;

import java.util.Arrays;
import java.util.Scanner;

// **부모 클래스 (Lotto)**
class Lotto {
    public String[] drawNumber() {
        String[] luckyNumberArray = new String[6];

        for (int i = 0; i < 6; i++) {
            luckyNumberArray[i] = String.valueOf((int) Math.floor((Math.random() * 45 + 1)));
            for (int j = 0; j < i; j++) {
                if (luckyNumberArray[j].equals(luckyNumberArray[i])) {
                    i--;
                    break;
                }
            }
        }

        Arrays.sort(luckyNumberArray, (a, b) -> Integer.parseInt(a) - Integer.parseInt(b));
        return luckyNumberArray;
    }

    // **로또 번호 체크 (자식 클래스에서 오버라이딩 예정)**
    public void checkLotto(String[] myNumbers, String[] luckyNumbers) {
        int matchCount = countMatches(myNumbers, luckyNumbers);
        System.out.println("\n추첨 번호: " + printArray(luckyNumbers));
        System.out.println("내 번호: " + printArray(myNumbers));
        System.out.println("일치하는 개수: " + matchCount);
    }

    // **배열을 문자열로 변환**
    protected String printArray(String[] arr) {
        return String.join(" ", arr);
    }

    // **일치하는 개수 계산**
    protected int countMatches(String[] myNumbers, String[] luckyNumbers) {
        int count = 0;
        for (String myNumber : myNumbers) {
            for (String luckyNumber : luckyNumbers) {
                if (myNumber.equals(luckyNumber)) {
                    count++;
                }
            }
        }
        return count;
    }
}

// **회사원 전용 로또 클래스 (자식 클래스)**
class CompanyEmployeeLotto extends Lotto {
    @Override
    public void checkLotto(String[] myNumbers, String[] luckyNumbers) {
        super.checkLotto(myNumbers, luckyNumbers); // 부모 메서드 실행 후 추가 메시지

        int matchCount = countMatches(myNumbers, luckyNumbers);
        if (matchCount == 6) {
            System.out.println("\n1등 당첨! 직장을 그만둔다!");
        } else if (matchCount == 5) {
            System.out.println("\n2등 당첨! 전액을 저축한다!");
        } else {
            System.out.println("꽝입니다, 안타깝네요..");
        }
    }

    public void exclusiveMethodForEmployee() {
        System.out.println("회사원 전용 기능 실행 중...");
    }
}

// **연구원 전용 로또 클래스 (자식 클래스)**
class ResearcherLotto extends Lotto {
    @Override
    public void checkLotto(String[] myNumbers, String[] luckyNumbers) {
        super.checkLotto(myNumbers, luckyNumbers);

        int matchCount = countMatches(myNumbers, luckyNumbers);
        if (matchCount == 6) {
            System.out.println("\n1등 당첨! 연구에 투자한다!");
        } else if (matchCount == 5) {
            System.out.println("\n2등 당첨! 지인에게 밥을 산다!");
        } else {
            System.out.println("꽝입니다, 안타깝네요..");
        }
    }

    public void exclusiveMethodForResearcher() {
        System.out.println("연구원 전용 기능 실행 중...");
    }
}

// **메인 실행 클래스**
public class LottoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lotto lotto; // 부모 타입 변수 선언 (업캐스팅)

        String[] luckyNumbers = new Lotto().drawNumber();
        System.out.println("이번 주 추첨 번호: " + Arrays.toString(luckyNumbers));

        System.out.println("\n구매자의 직업을 입력하세요 (회사원/연구원):");
        String buyerType = scanner.nextLine();

        // **업캐스팅: 부모 타입으로 자식 객체를 참조**
        if (buyerType.equals("회사원")) {
            lotto = new CompanyEmployeeLotto(); // 업캐스팅
        } else if (buyerType.equals("연구원")) {
            lotto = new ResearcherLotto(); // 업캐스팅
        } else {
            System.out.println("로또를 구매할 수 없습니다.");
            return;
        }

        System.out.println("\n구매하신 로또 번호 6개를 입력하세요 (1부터 45까지, 띄어쓰기 필수!):");
        String input = scanner.nextLine();
        String[] myNumbers = input.split(" ");

        if (myNumbers.length != 6) {
            System.out.println("6개의 숫자를 입력해야 합니다!");
        } else {
            // **다형성을 이용하여 부모 클래스 메서드 실행**
            lotto.checkLotto(myNumbers, luckyNumbers);

            // **다운캐스팅을 사용하여 특정 기능 실행**
            if (lotto instanceof CompanyEmployeeLotto) {
                CompanyEmployeeLotto empLotto = (CompanyEmployeeLotto) lotto; // 다운캐스팅
                empLotto.exclusiveMethodForEmployee(); // 회사원 전용 기능 실행
            } else if (lotto instanceof ResearcherLotto) {
                ResearcherLotto resLotto = (ResearcherLotto) lotto; // 다운캐스팅
                resLotto.exclusiveMethodForResearcher(); // 연구원 전용 기능 실행
            }
        }
    }
}
