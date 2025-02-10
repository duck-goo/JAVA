package classTest;

public class Company {
	String name;
	int age;
	int pay;
	static int totalMoney;
	
	public Company() {;}
	
	
	public Company(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		Company numberOne = new Company("이덕준", 30);
		Company numberTwo = new Company("홍길동", 20);
		Company numberThree = new Company("이순신", 40);
		Company numberFour = new Company("장보고", 60);

		numberOne.pay += 10_000;
		numberTwo.pay += 1_000;
		numberThree.pay += 2_000;
		numberFour.pay += 20_000;
		
		Company.totalMoney += numberOne.pay;
		Company.totalMoney += numberTwo.pay;
		Company.totalMoney += numberThree.pay;
		Company.totalMoney += numberFour.pay;
		
		System.out.println(Company.totalMoney);
	}
}
