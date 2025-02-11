package castingTask2;

public class Character extends CastingTask2 {
// 이름, 직업, 레벨
// 사냥하는 메서드
	String name;
	String job;
	int level;
	
	public Character() {;}

	public Character(String name, String job, int level) {
		super();
		this.name = name;
		this.job = job;
		this.level = level;
	}
	Character killOrk = new Ork();
	Ork ork = (Ork)killOrk;
	
	Character killFairy = new Fairy();
	Fairy fairy = (Fairy)killFairy;
	
	Character killHuman = new Human();
	Human human = (Human)killHuman;
	
	void killMonster () {

		
}
}
