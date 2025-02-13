package objectTest;

public class Sports {
// 1.기본 생성자
// 2.초기화 생성자
// 3.private 붙이기
// 4.getter setter 메서드 만들기
// 5.toString 재정의
// 6.해시코드, equals 재정의
		
	private String type;
	private int total;
	
	public Sports() {;}
	
	public Sports(String type, int total) {
		super();
		this.type = type;
		this.total = total;
	}

// alt + shift + s -> r -> alt + a -> r
	
	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public static void main(String[] args) {
		Sports sports = new Sports();
		System.out.println(sports.toString());
		
	}

}
