package sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import lotto.Lotto;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class Sms {
   
   static String code;
   
   {
      this.code = "153623";
   }
   
   public void sendSms(String phoneNumber, String message) {
      String api_key = "";
      String api_secret = "";
      Message coolsms = new Message(api_key, api_secret);
      
      // 4 params(to, from, type, text) are mandatory. must be filled
      HashMap<String, String> params = new HashMap<String, String>();
      params.put("to", phoneNumber);
      params.put("from", "01047099813");
      params.put("type", "SMS");
      params.put("text", message);
      params.put("app_version", "text app 1.2"); // application name and version

      try {
         JSONObject obj = (JSONObject) coolsms.send(params);
         System.out.println(obj.toString());
      } catch (CoolsmsException e) { 
         System.out.println(e.getMessage());
         System.out.println(e.getCode());
      }
   }
   
   
   public static void main(String[] args) {
      Sms sms = new Sms();
      Lotto lotto = new Lotto();
      String[] luckyNumbers = lotto.getLuckyNumber();
      String message = "";
      
      for(String number : luckyNumbers) {
         message += number + " ";
      }
      
      System.out.println(message);
      
      String[] phoneNumberLists = {"010-0000-0000", "010-0000-0000", "010-0000-0000", "010-0000-0000"};
      
      for(String phone : phoneNumberLists) {
         sms.sendSms(phone, message);
      }
   }
}


















