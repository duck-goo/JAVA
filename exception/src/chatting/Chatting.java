package chatting;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("상대방에게 보내는 메세지 : ");
		try {
			message = sc.nextLine();
			if(message.contains("바보")) {
				throw new BadWordException("비속어 사용하지마!!!!!");
			}
			System.out.println(message);
		} catch (BadWordException e) {
			System.out.println("비속어 사용 금지");
		} catch (Exception e) {
						e.printStackTrace();
		}

	}
}
