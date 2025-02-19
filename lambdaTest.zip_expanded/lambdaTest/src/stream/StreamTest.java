package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
//		IntStream : 시작점부터 끝점까지 정해준다. 값은 1씩 증가
//		IntStream.range(0, 10); // 0~9까지
//		
////		IntStream.range(0, 10).forEach((num) -> { System.out.println(num); });
////		IntStream.range(0, 10).forEach(System.out::println);
//		
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
//		IntStream.rangeClosed(1, 10).forEach((num) -> datas.add(num));		
//		IntStream.rangeClosed(1, 10).forEach(datas::add);		
//		참조형
//		소속 :: 메서드
//		
//		datas.forEach(System.out::println);
		
//		datas2 인덱스 0부터 4까지 삭제
//		ArrayList<Integer> datas2 = new ArrayList<Integer>();
//		IntStream.range(0, 10).forEach((num) -> {
//			datas2.add(10 - num);
//		});
//		
//		datas2.forEach(System.out::println);
//		
//		IntStream.range(0, 5).forEach(num -> {
//			datas2.remove(0);
//		});
//		
//		datas2.forEach(System.out::println);
//	
////		문자열 stream
////		chars() : 문자열을 Intstream으로 변환
//		String data3 = "ABCDEFG";
//		String data4 = "ㄱㄴㄷㄹ";
//		
//		data3.chars().forEach(System.out::println);
//		data4.chars().forEach((c) -> {System.out.println((char)c); });
//		
////		.map()
//		data4.chars().map((c) -> c + 4).forEach(c -> {System.out.println((char)c);});
//		
//		
//		User user1 = new User(1, "이덕준", 10, "강사");
//		User user2 = new User(2, "홍길동", 20, "개발자");
//		User user3 = new User(3, "장보고", 30, "요리사");
//		User user4 = new User(4, "이순신", 40, "디자이너");
//		User user5 = new User(5, "이성계", 50, "사장");
//		
////		직업만 출력
//		ArrayList<User> users = new ArrayList<User>();
//		users.add(user1);
//		users.add(user2);
//		users.add(user3);
//		users.add(user4);
//		users.add(user5);
//		
//		users.forEach(System.out::println);
//		users.stream().map(User::getJob).map((job) -> "직업:" + job).forEach(System.out::println);	
//		
//		users.stream().map(user -> user.getAge()).forEach(age -> System.out.println(age));
//		
//		실습
//		"/news", "/game", "/brand", "/rank"
//		ArrayList에 담고 모든 경로앞에 "/app" 붙이기
		
		ArrayList<String> urls = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		urls.stream().map((url) -> "/app" + url).forEach(System.out::println);
		
//		정렬 : sorted()
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 10, 5, 6, 2));
		numbers.stream().sorted().forEach(System.out::println);
//		내림차순
		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

//		결과값의 리턴을 다양한 타입으로 리턴 : .collect(Colletor.~());
		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1, 10, 5, 6, 2));
		List<Integer> list = numbers2.stream().map(n -> n + 10).collect(Collectors.toList());
		System.out.println(list.toString());
		
//		문자열로 바꾸기
		
		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(1, 10, 5, 6, 2));
		String str = numbers3.stream().sorted().map(String::valueOf).collect(Collectors.joining(","));
		System.out.println(str);
		
//		filter()
		
		ArrayList<Integer> numbers4 = new ArrayList<Integer>(Arrays.asList(1, 10, 5, 6, 2));
		ArrayList<Integer> even = new ArrayList<Integer>();
		numbers4.stream().filter((n) -> n % 2 == 0).forEach(even::add);
		even.forEach(System.out::println);
			
		
		
		
		
	}
}
