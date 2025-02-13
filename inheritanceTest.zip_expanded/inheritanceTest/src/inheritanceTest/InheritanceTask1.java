package inheritanceTest;

class Car {
	String brand;
	String color;
	long price;
	
	public Car() {;}
	public Car(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}	
	
	void engineStart() {
		System.out.println("열쇠 시동 켜짐");
	}
	
	void engineStop() {
		System.out.println("열쇠 시동 꺼짐");
	}
	
}

class SuperCar extends Car{
	String mode;
	
	public SuperCar() {;}

	public SuperCar(String brand, String color, long price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
//		super.engineStart();
		System.out.println("음성 시동 켜짐");
	}
	
	@Override
	void engineStop() {
//		super.engineStop();
		System.out.println("음성 시동 꺼짐");
	}
}

public class InheritanceTask1 {
	public static void main(String[] args) {
		Car matiz = new Car("기아", "빨강", 10000000);
		SuperCar ferrari = new SuperCar();
		ferrari.engineStart();
		matiz.engineStart();
	}
}























