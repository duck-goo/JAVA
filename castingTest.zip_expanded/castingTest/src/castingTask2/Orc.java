package castingTask2;

public class Orc extends Monster {
	public Orc() {;}
	public Orc(String name, int hp, int experience) {
		super(name, hp, experience);
	}
	
	@Override
	void get() {
		System.out.println("가죽을 얻었습니다.");
	}
	
}
