package castingTask2;

public class Monster {
	String name;
	int hp;
	int experience;
	
	public Monster() {;}

	public Monster(String name, int hp, int experience) {
		this.name = name;
		this.hp = hp;
		this.experience = experience;
	}
	
	void get() {
		System.out.println("몬스터를 잡았습니다.");
		System.out.println("아이템을 얻었습니다");
		System.out.println(experience + "경험치를 얻었습니다");
	}
	
}
