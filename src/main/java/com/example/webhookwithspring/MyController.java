package com.example.webhookwithspring;


import org.json.JSONObject;
import org.json.JSONString;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value="/myapp",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public String myfunc(@RequestBody String myWebhookRequestDto) {
		
	return myWebhookRequestDto;
		
//		System.out.println("Hello World"+ myWebhookRequestDto);
//		try {
//			JSONObject myjsonObj = new JSONObject(myWebhookRequestDto);
//			JSONObject queryResult = myjsonObj.getJSONObject("queryResult");
//			JSONObject intent = queryResult.getJSONObject("intent");
//			JSONObject parameters = queryResult.getJSONObject("parameters");
//			//JSONString nameparameter = queryResult.
//					
//			System.out.println("JSON QueryText"+ myjsonObj.getString("responseId"));
//			System.out.println("JSON Object"+ myjsonObj.getJSONObject("queryResult")+ "  "+ intent);
//		} catch (Exception e) {
//			System.out.println(e);
//			// TODO Auto-generated catch block
//		}
//		return new MyWebhookDto("Hello World");
	}
}
