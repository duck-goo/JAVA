package castingTask2;

public class Human extends Monster{
	public Human() {;}
	public Human(String name, int hp, int experience) {
		super(name, hp, experience);
	}	
	
	@Override
	void get() {
		System.out.println("갑옷을 얻었습니다.");
	}
}
