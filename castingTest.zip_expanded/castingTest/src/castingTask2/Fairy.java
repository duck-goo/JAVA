package castingTask2;

public class Fairy extends Monster{
	public Fairy() {;}
	public Fairy(String name, int hp, int experience) {
		super(name, hp, experience);
	}	
	
	@Override
	void get() {
		System.out.println("날개를 얻었습니다.");
	}
}
