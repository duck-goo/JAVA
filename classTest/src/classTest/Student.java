package classTest;

import java.security.DomainCombiner;

public class Student {
// 학생의 학번, 이름, 국어점수, 영어점수, 수학점수 입력 받고
// 총점과 평균을 출력하기
	int number;
	String name;
	int koreanGrade;
	int englishGrade;
	int mathGrade;
	int total;
	double average;
		
	public Student() {;}
	
	public Student(int number, String name, int koreanGrade, int englishGrade, int mathGrade) {
		this.number = number;
		this.name = name;
		this.koreanGrade = koreanGrade;
		this.englishGrade = englishGrade;
		this.mathGrade = mathGrade;
		this.total = koreanGrade + englishGrade + mathGrade;
		this.average = Double.parseDouble(String.format("%.3f", total / 3.0));
	}
	public static void main(String[] args) {
		Student 이덕준 = new Student(1, "이덕준", 100, 100, 80);
		System.out.println("총 점 :" + 이덕준.total);
		System.out.println("평 균 :" + 이덕준.average);
	}
}
