package chatting;



public class BadWordException extends RuntimeException{
	
	public BadWordException() {;}
	public BadWordException(String message) {
		super(message);		
	}
}
