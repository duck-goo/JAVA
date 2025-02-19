package mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;

// 메일을 전송하는 메서드로 만들고,
// 팀원들에게 반복문으로 모두 메일 발송시키기

public class MailTest {
	public static void main(String[] args) {
		// 메일 인코딩
	       final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
	       
	       // 원하는 메일 제목 작성
	       String subject = "저희 집이 불타고 있어요.";
	       
	       // 보낸 이메일 작성
	       String fromEmail = "codefuling@gmail.com";
	       String fromUsername = "세환 킴";
	       
	       // 받는 이메일
	       String toEmail = "ssam010925@gmail.com"; // 콤마(,)로 여러개 나열
	       
	       //도메인 사용할 필요 없다
	       //앱비밀번호
	       final String username = "codefuling@gmail.com";         
	       final String password = "";
	       
	       // 메일에 출력할 텍스트
	       String html = null;
	       StringBuffer sb = new StringBuffer();
	       sb.append("<marquee>세현님 바로 밑에 사는 사람입니다.</marquee>\n");
	       sb.append("<h4>물이 세고 있는데 수리비 청구합니다</h4>\n");    
	       sb.append("<h4>★계좌번호 : 000 - 0000 - 000 입금요망★</h4>\n");    
	       html = sb.toString();
	       
	       // 메일 옵션 설정
	       Properties props = new Properties();    
	       props.put("mail.smtp.starttls.enable", "true");
	       props.put("mail.smtp.host", "smtp.gmail.com");
	       props.put("mail.smtp.auth", "true");
	       props.put("mail.smtp.port", "587");
	       props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	       props.put("mail.smtp.ssl.protocols", "TLSv1.2");
	       
	       try {
	         // 메일 서버  인증 계정 설정
	         Authenticator auth = new Authenticator() {
	           protected PasswordAuthentication getPasswordAuthentication() {
	             return new PasswordAuthentication(username, password);
	           }
	         };
	         
	         // 메일 세션 생성
	         Session session = Session.getDefaultInstance(props, auth);
	         
	         // 메일 송/수신 옵션 설정
	         Message message = new MimeMessage(session);
	         message.setFrom(new InternetAddress(fromEmail, fromUsername));
	         message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
	         message.setSubject(subject);
	         message.setSentDate(new Date());
	         
//	         // 메일 콘텐츠 설정
	         Multipart mParts = new MimeMultipart();
	         MimeBodyPart mTextPart = new MimeBodyPart();
	         MimeBodyPart mFilePart = null;
	//    
//	         // 메일 콘텐츠 - 내용
	         mTextPart.setText(html, bodyEncoding, "html");
	         mParts.addBodyPart(mTextPart);
//	               
//	         // 메일 콘텐츠 설정
	         message.setContent(mParts);
	    
	         // 메일 발송
	         Transport.send( message );
	         
	       } catch ( Exception e ) {
	         e.printStackTrace();
	       }
	}
}
