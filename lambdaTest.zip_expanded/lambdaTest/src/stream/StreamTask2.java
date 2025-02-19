package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTask2 {
	public static void main(String[] args) {
//		1) 5개의 문자열을 모두 소문자로 변경하기
//		"Black", "WHITE", "reD", "yeLLow", "PINk"
		
		ArrayList<String> color = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
		color.stream().map(String::toLowerCase).forEach(System.out::println);
				
		
//		2) Apple, banana, Melon, cherry, "딸기"
//		단어 중 영문이면서, 앞글자가 대문자인 단어만 출력
		
		ArrayList<String> fruit = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "cherry", "딸기"));
		fruit.stream().filter(str -> str.charAt(0) >= 'A').filter(str -> str.charAt(0) <= 'Z').forEach(System.out::println);
		
		
				
//		3) 한글을 정수로 변경
                
        String hangle = "공일이삼사오육칠팔구";
        String data = "일공이사";
        data.chars().map(c -> hangle.indexOf(c)).forEach(System.out::print);
        
//		4) 정수를 한글로 변경
//		"1024" -> "일공이사"
	
        String hangle2 = "공일이삼사오육칠팔구";
        String data2 = "1";   
        hangle2.charAt(Integer.parseInt(data2));
        data2.chars().map(c -> c - 48).forEach(i -> {System.out.println(hangle2.charAt(i));});

        
        
        
        


	}

}
