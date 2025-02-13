package castingTask2;

public class CastingTask2 {
	public static void main(String[] args) {
		Character ksh = new Character("ksh", "사냥꾼");
		Monster[] monsters = {
			new Fairy("요정", 10, 100),
			new Orc("오크", 30, 250),
			new Human("인간", 1, 1000)
		};
		
		
//		캐릭터는 오크, 요정, 인간을 사냥할 수 있다.
//		오크 : 가죽을 얻는다
//		요정 : 날개를 얻는다
//		인간 : 갑옷을 얻는다.
		
		for(int i = 0; i < monsters.length; i++) {
			ksh.hunt(monsters[i]);
		}
		
//		for(Monster monster : monsters) {
//			ksh.hunt(monster);
//		}

	}
}
