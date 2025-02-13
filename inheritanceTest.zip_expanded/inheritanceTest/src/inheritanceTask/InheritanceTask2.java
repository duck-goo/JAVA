package inheritanceTask;

//상속 및 분리 실습
// Person 클래스
// 이름, 나이, 주소, 핸드폰 번호
// work 일을 한다.
// sleep 잠을 잔다.
// eat 세 끼를 먹는다

// Student 클래스
// 인스타아이디
// work 아르바이트를 한다
// sleep 수업 시간에 잠을 잔다
// eat 아침을 거른다

// Employee 클래스
// 비상금
// work 하루 종일 일을 한다
// sleep 잠을 설친다
// eat 야식을 먹는다


public class InheritanceTask2 {
//	메인 메서드 생성 후 객체화
//	각 메서드 출력하기
	public static void main(String[] args) {
		Person person = new Person("홍길동", 20, "서울시 강남", "01000000000");
		person.work();
		person.eat();
		person.sleep();
		
		Student student = new Student("박세현", 15, "서울시 역삼동", "01000000000", "sehyun zzang");
		student.work();
		student.eat();
		student.sleep();
		
		Employee employee = new Employee();
		employee.work();
		employee.sleep();
		employee.eat();
		
	}
}
























