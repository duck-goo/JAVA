package classTest;

public class Student {
//	학생의 학번, 이름, 국어점수, 영어점수, 수학점수 입력 받고
	int number;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double average;
	
	public Student() {;}
	
	public Student(int number) {;}
	public Student(String name) {;}
	public Student(int number, String name) {;}
	
	public Student(int number, String name, int kor, int eng, int math) {
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = Double.parseDouble(String.format("%.3f",total / 3.0));
	}
	
	
//	총점과 평균을 출력하기
	public static void main(String[] args) {
		
		Student 김세환 = new Student(1, "김세환", 100, 100, 10);
		Student 홍길동 = new Student();
		System.out.println("총 점 : " + 김세환.total);
		System.out.println("평 균 : " + 김세환.average);
	}
	
	
	
}








