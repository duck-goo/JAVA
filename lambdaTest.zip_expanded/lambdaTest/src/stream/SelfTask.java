package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SelfTask {
	public static void main(String[] args) {
		
//		정수 리스트 numbers가 주어졌을 때,
//
//		중복된 값을 제거하고
//		오름차순 정렬한 리스트를 출력하시오.
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(5, 3, 8, 3, 2, 1, 4, 2));
		numbers = new ArrayList<Integer>(new HashSet<Integer>(numbers));
		numbers.stream().sorted().forEach(System.out::println);
		
//		문자열 리스트 words가 주어졌을 때,
//		문자 "a"를 포함하는 단어만 필터링하여 출력하시오
		
		ArrayList<String> words = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "grape", "melon"));
		words.stream().filter(word -> word.contains("a")).forEach(System.out::println);
		
//		학생들의 이름과 점수를 HashMap에 저장한 후,
//		모든 학생의 평균 점수를 구하시오.
		
		HashMap<String, Integer> scores = new HashMap<>();
		scores.put("Alice", 85);
		scores.put("Bob", 92);
		scores.put("Charlie", 78);
		scores.put("David", 88);
		scores.put("Eve", 95);
		
		ArrayList<Integer> scoresAverage = new ArrayList<Integer>(scores.values());
//		double average = scoresAverage.stream().mapToInt(n -> n).average().orElse(0);
//		System.out.println(average);
	
		scoresAverage.stream().reduce((sum, num) -> sum + num).map(sum -> (double)sum / scoresAverage.size());
		System.out.println(scoresAverage);
		
//		두 개의 정수 리스트가 있을 때,
//		공통된 숫자만 찾아서 리스트로 반환하시오.
		
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 8, 9));
		
		ArrayList<Integer> list3 = new ArrayList<Integer>(list1);
		list3.addAll(list2);
		
		list3.stream().filter(list3::contains).forEach(System.out::println);
		
		
	}
}
