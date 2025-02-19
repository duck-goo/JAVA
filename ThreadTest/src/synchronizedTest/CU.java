package synchronizedTest;

public class CU {
	public static void main(String[] args) {
	ATM atm = new ATM();
	
	Thread dj = new Thread(atm, "덕준");
	Thread dg = new Thread(atm, "동건");

	dj.start();
	dg.start();
}
}