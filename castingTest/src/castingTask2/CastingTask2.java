package castingTask2;

public class CastingTask2 {
	public static void main(String[] args) {
//		오크, 요정, 인간
//		오크 : 가죽을 얻는다
//		요정 : 날개을 얻는다
//		인간 : 갑옷을 얻는다
		CastingTask2 ork = new Character();
		Character killOrk = (Character)ork;
		
		CastingTask2 fairy = new Character();
		Character killFairy = (Character)fairy;
		
		CastingTask2 human = new Character();
		Character killHuman = (Character)human;
		
		killHuman.human.dropItem();
		
	}
}
