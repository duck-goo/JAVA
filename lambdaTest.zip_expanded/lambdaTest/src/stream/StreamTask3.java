package stream;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask3 {
   public static void main(String[] args) {
   
      
//     1) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
       ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
       number.stream().reduce((a, b) -> a + b).ifPresent(System.out::println);     
      
//     1) 1~50까지 ArrayList에 담고 출력하기
       ArrayList<Integer> numbers = new ArrayList<Integer>();
       IntStream.rangeClosed(1, 50).forEach(n -> numbers.add(n));
       numbers.forEach(System.out::println);  
              
//     IntStream.range(0, 50).map(n -> n + 1).forEach(numbers::add);
//     numbers.forEach(System.out::println(n));
       
       
////   2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기
       ArrayList<Integer> numbers2 = new ArrayList<Integer>();
       IntStream.rangeClosed(1, 10).forEach(n -> numbers2.add(n));
       numbers2.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
       
//     ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//     numbers2.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
       
              
//       
////   3) 1~50까지 ArrayList에 짝수만 담고 출력하기
       ArrayList<Integer> numbers3 = new ArrayList<Integer>();
       IntStream.rangeClosed(1, 10).forEach(n -> numbers3.add(n));
       numbers3.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
       
       
//       ArrayList<Integer> numbers3 = new ArrayList<Integer>();
//       for(int i = 1; i <= 25; i++) {
//    	   number3.add(i * 2);
//       }
//       for(Integer number : numbers3) {
//    	   System.out.println(numbers3);
//       }
       
       
       
//     4) a~z까지 ArrayList에 담고 출력하기
       ArrayList<Character> abc = new ArrayList<Character>();
       IntStream.rangeClosed('a', 'z').mapToObj(c -> (char)c).forEach(c -> abc.add(c));
       abc.stream().forEach(System.out::println);
       
       
//       ArrayList<Integer> abc = new ArrayList<Integer>();
//       IntStream.rangeClosed('a', 'z').forEach(abc::add);
       

       
//      5) a~z까지 ex) aceg... 하나씩 건너뛰고 ArrayList에 담고 출력하기
        ArrayList<Character> abc2 = new ArrayList<Character>();
        IntStream.iterate('a', c -> c + 2).limit(13).mapToObj(c -> (char)c).forEach(c -> abc2.add(c));
        abc2.stream().forEach(System.out::println);
      
//      IntStream.rangeClosed('a', 'z').filter(c -> c % 2 != 0).forEach(abc2::add);
//      abc2.forEach(c -> {
//      	System.out.println((char)(int)c);
//      });
           
        
//      IntStream.rangeClosed('a', 'z').filter(c -> (c - 'a') % 2 == 0).forEach(c -> abc2.add((char)c));
//      abc2.stream().forEach(System.out::println);
       
       
       
//      6) 1~50까지 ArrayList에 담고 10~20만 출력하기
        ArrayList<Integer> numbers4 = new ArrayList<Integer>();
        IntStream.rangeClosed(1, 50).forEach(numbers4::add);
        numbers4.stream().filter(n -> n >=10 && n <= 20).forEach(System.out::println);
       
        
        
       
//      7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기
        ArrayList<Integer> numbers5 = new ArrayList<Integer>();
        IntStream.rangeClosed(1, 10).forEach(numbers5::add);
        numbers5.stream().filter(n -> n % 2 == 1).reduce((a, b) -> a + b).ifPresent(System.out::println);
        
        
        
        
//      8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기
        ArrayList<String> words = new ArrayList<String>(Arrays.asList("hello", "java", "apple", "test"));  
        words.stream().filter(s -> s.contains("a")).forEach(System.out::println);
          
        
//      9) 1~10까지 ArrayList에 담고 모든 합을 출력하기
        ArrayList<Integer> numbers6 = new ArrayList<Integer>();
        IntStream.rangeClosed(1, 10).forEach(numbers6::add);
        numbers6.stream().reduce((a, b) -> a + b).ifPresent(System.out::println);
        
        
//      10) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
        ArrayList<Integer> number7 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
        number7.stream().reduce((a, b) -> a + b).ifPresent(System.out::println);
        
        
              
//      2) 각각의 Member가 들어가 있는 ArrayList<Member>가 존재한다.
//         모든 Member의 취미를 검토하여, 개발을 좋아하는 사람의 데이터를 출력한다.
//
//         필드 : 이름, 취미, 소개
//         홍길동, 축구_농구_야구, 나는 축구왕!
//         이순신, 개발_당구_축구, 나는 개발자 좋아!
//         장보고, 피아노, 피아노만 한 우물!
//         김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//         김영희, 골프_야구, 운동 선수는 나의 꿈
//         흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
      
      
        ArrayList<Member> members = new ArrayList<>(Arrays.asList(
        new Member("홍길동", "축구_농구_야구", "나는 축구왕!"),
        new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!"),
        new Member("장보고", "피아노", "피아노만 한 우물!"),
        new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~"),
        new Member("김영희", "골프_야구", "운동 선수는 나의 꿈"),
        new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!")
        ));
        members.stream().filter(member -> member.hobby.contains("개발")).forEach(System.out::println);

//		짝수만 출력
        List<Integer> numbers8 = Arrays.asList(10, 3, 7, 8, 20, 15, 6);
        numbers8.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

//      대문자 변환
        List<String> words2 = Arrays.asList("apple", "banana", "cherry");
        words2.stream().map(String::toUpperCase).forEach(System.out::println);
      
//      모든 합 구하기
        List<Integer> numbers9 = Arrays.asList(5, 10, 20, 7);
        numbers9.stream().reduce((a, b) -> a + b).ifPresent(System.out::println);
        
//      중복 제거 후 정렬
//        List<Integer> numbers10 = Arrays.asList(5, 3, 7, 5, 2, 3, 10, 7);
//        numbers10.stream().sorted().filter(n -> )

   }
}
 