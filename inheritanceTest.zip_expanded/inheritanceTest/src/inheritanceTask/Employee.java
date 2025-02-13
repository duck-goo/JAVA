package inheritanceTask;

// 비상금
// work 하루 종일 일을 한다
// sleep 잠을 설친다
// eat 야식을 먹는다
public class Employee extends Person{
	int nestEgg;
	
	public Employee() {;}

	public Employee(String name, int age, String address, String phone, int nestEgg) {
		super(name, age, address, phone);
		this.nestEgg = nestEgg;
	}
	
	@Override
	void work() {
		System.out.println("하루종일 일을 합니다");
	}
	
	@Override
	void sleep() {
		System.out.println("잠을 설친다.");
	}
	
	@Override
	void eat() {
		System.out.println("야식을 먹는다.");
	}
}
