package abstractTest;


public abstract class Electronics {
// 추상 메서드
	public abstract void on(); //선언만.
	public abstract void off();

//	상수 : final
	public final void safe() {
		System.out.println("안전장치 가동");
	}
}
