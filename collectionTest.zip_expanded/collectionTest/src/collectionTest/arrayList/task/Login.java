package collectionTest.arrayList.task;

public class Login {
	public static void main(String[] args) {
		UserField userField = new UserField();
		
	//  단위 테스트
	User user = new User();
	user.setId("djduckgoo");
	user.setPassword("1234");
	
	System.out.println(user);
	
	if(userField.checkId(user.getId()) == null) {
		userField.join(user);
		System.out.println(DBConnecter.users);
	}
	
	User userForLogin = new User();
	userForLogin.setId("djduckgoo");
	userForLogin.setPassword("1234");
	if(userField.login(userForLogin)) {
		System.out.println("로그인 성공");
	}else {
		System.out.println("로그인 실패");
	}
	
	System.out.println(UserField.userId);
	User foundUser = userField.checkId(UserField.userId);
	foundUser.setPassword("6789");
	
	userField.update(foundUser);
	
	userField.logout();
	
	userForLogin = new User();
	userForLogin.setId("djduckgoo");
	userForLogin.setPassword("1234");
	
	if(userField.login(userForLogin)) {
		System.out.println("로그인 성공");
	}else {
		System.out.println("로그인 실패");
	}
	}
}
