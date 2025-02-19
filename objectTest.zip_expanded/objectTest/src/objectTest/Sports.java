package objectTest;

public class Sports{
//	1. 기본 생성자
//	2. 초기화 생성자
//	3. private 붙이기
//	4. getter, setter
//	5. toString 재정의
	
//	alt + shift + a
	private String type;
	private int total;

	public Sports() {;}

	public Sports(String type, int total) {
		this.type = type;
		this.total = total;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}

	int getTotal() {
		return total;
	}

	void setTotal(int total) {
		this.total = total;
	}

//	alt + shift + s -> s
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}
	
	//	alt + shift + s -> r -> alt + a -> r
//  10번
	public static void main(String[] args) {
		Sports sports = new Sports();
//		System.out.println(sports.hashCode());
		System.out.println(sports.toString());
//		sports.equals(sports);
	}
	
}
















