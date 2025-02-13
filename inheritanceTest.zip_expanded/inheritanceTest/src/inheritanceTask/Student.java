package inheritanceTask;

//인스타아이디
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다
public class Student extends Person{
	String insta;
	
	public Student() {;}

	public Student(String name, int age, String address, String phone, String insta) {
		super(name, age, address, phone);
		this.insta = insta;
	}
	
	@Override
	void work() {
		System.out.println("아르바이트를 한다");
	}

	@Override
	void sleep() {
		System.out.println("수업시간에 잔다.");
	}
	
	@Override
	void eat() {
		System.out.println("아침을 거르고 간식을 먹는다.");
	}
}









