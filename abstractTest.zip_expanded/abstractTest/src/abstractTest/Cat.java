package abstractTest;

public class Cat implements Pet {

	@Override
	public void poop() {
		System.out.println("배변 훈련 가능");
	}
	
	@Override
	public void sitDown() {
		System.out.println("안기다린다");
	}
	
	@Override
	public void waitNow() {
		System.out.println("기다리지 않는다");
	}
}
