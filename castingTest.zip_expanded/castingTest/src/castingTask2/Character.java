package castingTask2;

public class Character {
//	이름, 직업, 레벨
	String name;
	String job;
	int level;

	static {
		System.out.println("여행을 환영합니다");
	}
	
	{
		this.level = 1;
	}
	
	public Character() {;}

	public Character(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
//	사냥하는 메서드
//	요정, 오크, 사람
	public void hunt(Monster monster) {
		if(monster instanceof Fairy) {
			Fairy fairy = (Fairy)monster;
			fairy.get();
			
		}else if(monster instanceof Orc) {
			Orc orc = (Orc)monster;
			orc.get();
			
		}else if(monster instanceof Human) {
			Human human = (Human)monster;
			human.get();
		}
	}
	
}







