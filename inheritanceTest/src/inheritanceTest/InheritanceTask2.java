package inheritanceTest;

//상속 및 분리 실습
// Person 클래스
// 이름, 나이, 주소, 핸드폰 번호
// work 일은 한다.
// sleep 잠을 잔다.
// eat 세끼를 먹는다.

class Person {
	String name;
	
	int age;
	String address;
	String phoneNumber;
	
	public Person() {;}
	public Person(String name, int age, String address, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	void work() {
		System.out.println("일을 한다.");
	}
	void sleep() {
		System.out.println("잠을 잔다.");
	}
	void eat() {
		System.out.println("세끼를 먹는다.");
	}
}
// Student 클래스
// 인스타아이디
// work 아르바이트를 한다.
// sleep 수업시간에 잠을 잔다.
// eat 아침을 거른다
class Student extends Person{
	String instarId;
	
	public Student() {;}

	public Student(String name, int age, String address, String phoneNumber, String instarId) {
		super(name, age, address, phoneNumber);
		this.instarId = instarId;
	}
	@Override
	void work() {
		super.work();
		System.out.println("아르바이트를 한다.");
	}
	@Override
	void sleep() {
		super.sleep();
		System.out.println("수업시간에 잠을 잔다.");
	}
	@Override
	void eat() {
		super.eat();
		System.out.println("아침을 거른다.");
	}
}
// Emlpoyee 클래스
// 비상금
// work 하루 종일 일을 한다.
// sleep 잠을 설친다.
// eat 야식을 먹는다
class Employee extends Person{
	int hiddenMoney;
	
	public Employee() {;}

	public Employee(String name, int age, String address, String phoneNumber, String instarId, int hiddenMoney) {
		super(name, age, address, phoneNumber);
		this.hiddenMoney = hiddenMoney;
	}
	@Override
	void work() {
		super.work();
		System.out.println("하루 종일 일을 한다.");
	}
	@Override
	void sleep() {
		super.sleep();
		System.out.println("잠을 설친다.");
	}
	@Override
	void eat() {
		super.eat();
		System.out.println("야식을 먹는다.");
	}
}

public class InheritanceTask2 {
// 메인 메서드 생성 후 객체화
// 각 메서드 출력하기
	public static void main(String[] args) {
		Person ldj = new Person("이덕준", 39, "롯데캐슬아파트", "010-1234-5678");
		Student lkj = new Student("이경준", 37, "파라곤아파트", "010-2121-1212", "lkj-fj55");
		Employee ldw = new Employee("이동원", 40, "롯데타워", "010-5555-5575", "ldw4442", 1000000);
		
		System.out.println(ldj.name + ldj.age + ldj.address + ldj.phoneNumber);
		System.out.println(lkj.name + lkj.age + lkj.address + lkj.phoneNumber + lkj.instarId);
		System.out.println(ldw.name + ldw.age + ldw.address + ldw.phoneNumber + ldw.hiddenMoney);
		
		ldj.work();
		ldj.sleep();
		ldj.eat();
		lkj.work();
		lkj.sleep();
		lkj.eat();
		ldw.work();
		ldw.sleep();
		ldw.eat();
	}
}
