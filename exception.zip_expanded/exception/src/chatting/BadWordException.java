package chatting;

//Exception: 컴파일러가 검사하므로 try~catch문을 써야 한다. 즉, 강제 종료된다.
//RuntimeException : 컴파일 시 이 예외를 처리하고 싶을 때, 컴파일러가 검사하지 않는다. 
//즉 강제 종료가 되지 않는다.

public class BadWordException extends RuntimeException{
	public BadWordException() {;}
	public BadWordException(String message) {
		super(message);
	}
}
