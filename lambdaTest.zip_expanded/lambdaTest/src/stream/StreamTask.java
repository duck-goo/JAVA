package stream;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
//		1) 1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		IntStream.rangeClosed(1, 10).forEach(System.out::println);

//		2) ABCDEF를 각 문자별로 출력
//		ArrayList<String> datas2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
//		datas2.stream().forEach(System.out::println);
		"ABCDEF".chars().forEach(c -> {System.out.println((char)c);});
//		3) 1~100까지 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> datas3 = new ArrayList<Integer>(Arrays.asList());
		IntStream.rangeClosed(1, 100).filter((n) -> n % 2 == 1).forEach(System.out::println);
	
//		4) A~F 중 D를 제외하고 ArrayList에 담고 출력
		ArrayList<String> datas4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
		datas4.stream().filter(data4 -> !data4.equals("D")).forEach(System.out::println);
		
		ArrayList<Character> datas5 = new ArrayList<Character>();
		IntStream.rangeClosed('A', 'E').map(c -> c > 67 ? c + 1 : c).forEach(c -> datas5.add((char)c));
		datas5.forEach(System.out::println);
		
		
	}
}
