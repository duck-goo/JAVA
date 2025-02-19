package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {
	ArrayList<User2> users = new ArrayList<User2>(Arrays.asList(
			new User2("이덕준", "ldj", "1234"),
			new User2("김덕준", "kdj", "2345"),
			new User2("장덕준", "jdj", "3456"),
			new User2("박덕준", "pdj", "6789")
			));
	
	public Optional<User2> findById(Long id) {
		User2 user = null;
		for(User2 userInDB :users) {
			if(userInDB.getId() == id) {
				user = userInDB;
			}
		}
		return Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
		OptionalTest ot = new OptionalTest();
//		Long num1 = 3L;
//		long num2 = 3;
		
		Optional<User2> user = ot.findById(200L);
		
		
//		if(user !=null)
		
		
		
//		orElse : null이 아니라면 user, null이라면 대체 user
//		user.orElse(new User2());
		
//		orElseThrow : null 아니라면 user, null이라면 () -> { 예외발생};
//		user.orElseThrow(() -> {
//			throw new NoSearchUserException("그런 회원 없습니다.");
//		});
		
		
		user = ot.findById(200L);
		user.ifPresent((findUser) -> {
//			null이 아닐때만 아래 로직을 실행해!
			System.out.println("ifPresent");
			System.out.println(findUser.toString());
		});
		
		user.ifPresentOrElse((findUser) -> {
			
		}, () -> {
			System.out.println("없는 회원입니다.");
		});
		
		
		System.out.println(user.isPresent());
	}
	
}
