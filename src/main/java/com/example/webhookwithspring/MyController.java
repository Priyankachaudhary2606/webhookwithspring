package com.example.webhookwithspring;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.apache.tomcat.util.codec.binary.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.actions.api.DialogflowApp;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@RestController
public class MyController{
	
	 public static final String ACCOUNT_SID = "ACe84ff27d59431b995407b6f6d6ca3106";
     public static final String AUTH_TOKEN = "b403f88573e9f96e25f094385bdc1465";

	@RequestMapping(value="/myapps",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public MyWebhookDto myfunc(@RequestBody String myWebhookRequestDto) throws JSONException {
		
		
		// to get user Id
		System.out.println("Hello World"+ myWebhookRequestDto);
		JSONObject webhookJson = new JSONObject(myWebhookRequestDto);
		JSONObject originalDetectIntent = webhookJson.getJSONObject("originalDetectIntentRequest");
		JSONObject payload = originalDetectIntent.getJSONObject("payload");
		JSONObject user = payload.getJSONObject("user");
		String jwtToken = user.getString("idToken");
		System.out.println("------------ Decode JWT ------------");
        String[] split_string = jwtToken.split("\\.");
        String base64EncodedHeader = split_string[0];
        String base64EncodedBody = split_string[1];
        String base64EncodedSignature = split_string[2];

        System.out.println("~~~~~~~~~ JWT Header ~~~~~~~");
        Base64 base64Url = new Base64(true);
        String header = new String(base64Url.decode(base64EncodedHeader));
        System.out.println("JWT Header : " + header);


        System.out.println("~~~~~~~~~ JWT Body ~~~~~~~");
        String body = new String(base64Url.decode(base64EncodedBody));
        System.out.println("JWT Body : "+body);  
        
        JSONObject bodyObject = new JSONObject(body);
        String email = bodyObject.getString("email");
        System.out.println(email);
        
       
		/* 
        // to send msg using twilio
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+918527526472"),
            new PhoneNumber("+12023355674"), "This is the test message from twilio").create();

        System.out.println(message.getSid());
        */
		
		/*
		
		//to send message using MSG91
		String authkey = "269073AuvmpLrGs5c986aba";
        //Multiple mobile numbers separated by comma
        String mobiles = "8527526472, 9654019428";
        //Sender ID,While using route4 sender id should be 6 characters long.
        String senderId = "SMSPOC";
        //Your message to send, Add URL encoding here.
        String message = "Test message";
        //define route=4 for transactional message & route=1 for Promotional
        String route="4";

        //Prepare Url
        URLConnection myURLConnection=null;
        URL myURL=null;
        BufferedReader reader=null;

        //encoding message
        String encoded_message=URLEncoder.encode(message);

        //Send SMS API
        String mainUrl="http://api.msg91.com/api/sendhttp.php?";

        //Prepare parameter string
        StringBuilder sbPostData= new StringBuilder(mainUrl);
        sbPostData.append("authkey="+authkey);
        sbPostData.append("&mobiles="+mobiles);
        sbPostData.append("&message="+encoded_message);
        sbPostData.append("&route="+route);
        sbPostData.append("&sender="+senderId);

        //final string
        mainUrl = sbPostData.toString();
        try
        {
            //prepare connection
            myURL = new URL(mainUrl);
            myURLConnection = myURL.openConnection();
            myURLConnection.connect();
            reader= new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
            //reading response
            String response;
            while ((response = reader.readLine()) != null)
            //print response
            System.out.println(response);

            //finally close connection
            reader.close();
        }
        catch(Exception e){
        	
        }
        */
		
		return new MyWebhookDto("<speak> Hello World this is SSML <break time='2000ms'/> You like it </speak>");
	}
}
