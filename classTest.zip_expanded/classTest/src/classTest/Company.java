package classTest;

// 15분
public class Company {
//  회사 클래스 필드 구성하기
//  이름, 나이, 수입
//	회사의 총 수입
	static int money;
	String name;
	int age;
	int income;
		
	public Company() {;}
	
	public Company(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	회사원은 총 4명(객체 생성)
//	1번 +10000원
//	2번 +1000원
//	3번 +2000원
//	4번 -20000원
//	각 회사의 총 수입을 출력하기
	public static void main(String[] args) {
		Company employee1 = new Company("홍길동", 20);
		Company employee2 = new Company("장보고", 30);
		Company employee3 = new Company("이순신", 25);
		Company employee4 = new Company("김동건", 20);
//		System.out.println(employee1.name);
		
		employee1.income += 10_000;
		employee2.income += 1_000;
		employee3.income += 2_000;
		employee4.income -= 20_000;
		
		Company.money += employee1.income;
		Company.money += employee2.income;
		Company.money += employee3.income;
		Company.money += employee4.income;
		
		System.out.println(Company.money);
		
		
	}
}















