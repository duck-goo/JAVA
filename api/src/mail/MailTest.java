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

import lotto.Lotto;
import sms.Sms;

import javax.mail.internet.MimeMultipart;

//메일 전송하는 메서드 만들고 반복문으로 팀원들에게 전송하기

public class MailTest {
	public static void main(String[] args) {
		// 메일 인코딩
        final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
        
        //원하는 메일 제목 작성
        String subject = "";
        
        //보낸 이메일 작성
        String fromEmail = "djduckgoo@gmail.com";
        String fromUsername = "이덕준";
        
        String toEmail = mailAddressLists[]; // 콤마(,)로 여러개 나열
        
        //도메인 사용할 필요 없다
        //앱비밀번호
        final String username = "djduckgoo@gmail.com";         
        final String password = "uens qziu ehcl fsvf";
        
        // 메일에 출력할 텍스트
        String html = null;
        StringBuffer sb = new StringBuffer();
        sb.append("<marquee>안녕하세요</marquee>\n");
        sb.append("<h4>회식 메뉴 정하자</h4>\n");    
        sb.append("<h4>1.갈비 2.탄두리 3.</h4>\n");    
        sb.append("<h4></h4>\n");    
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
          
//          // 메일 콘텐츠 설정
          Multipart mParts = new MimeMultipart();
          MimeBodyPart mTextPart = new MimeBodyPart();
          MimeBodyPart mFilePart = null;
 //    
//          // 메일 콘텐츠 - 내용
          mTextPart.setText(html, bodyEncoding, "html");
          mParts.addBodyPart(mTextPart);
//                
//          // 메일 콘텐츠 설정
          message.setContent(mParts);
     
          // 메일 발송
          Transport.send( message );
          
        } catch ( Exception e ) {
          e.printStackTrace();
        }
        
        MailTest mailTest = new MailTest();
        String[] mailMessage = lotto.getLuckyNumber();
        String message = "";
        
        for(String address : luckyNumbers) {
           message += number + " ";
        }
        
        System.out.println(message);
        
        String[] mailAddressLists = {"alsdk6761@gmail.com", "dcode0971@gmail.com", "djduckgoo@gmail.com", "ssam010925@gmail.com", "croissen214@gmail.com"};
        
        for(String mail : mailAddressLists) {
           MailTest.sendSms(mail, message);
        }
	}
}
