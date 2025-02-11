package castingTest1;

import java.util.Scanner;

//넷플릭스
//	애니메이션, 영화, 드라마
//	사용자가 선택한 영상이 애니메이션이라면 "자막 지원" 기능 사용
//	영화라면 "4D" 기능 사용
//	드라마라면 "굿즈" 기능 사용



class Netflex {
	String choice;
	
	public Netflex() {;}

	public Netflex(String choice) {
		super();
		this.choice = choice;
	}
}

class Animation extends Netflex {
	public Animation() {;}
		
	void subscript() {
		System.out.println("자막지원");
	}
}
class Movie extends Netflex {
	public Movie() {;}
	
	void effect() {
		System.out.println("4D");
	}
}
class Drama extends Netflex{
	public Drama() {;}
	
	void goods() {
		System.out.println("굿즈");
	}
}

public class CastingTask {
	public static void main(String[] args) {
		Netflex ch1 = new Animation();
		Animation choiceAni = (Animation)ch1;
		Netflex ch2 = new Movie();
		Movie choiceMovie = (Movie)ch2;
		Netflex ch3 = new Drama();
		Drama choiceDrama = (Drama)ch3;
		
		Scanner sc = new Scanner(System.in);
		String ch11 = sc.next();
		
		System.out.println();
		
		choiceDrama.goods();
		
		
		
	}
}
