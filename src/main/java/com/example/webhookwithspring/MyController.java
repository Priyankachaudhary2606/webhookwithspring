package com.example.webhookwithspring;



import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value="/myapp",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public MyWebhookDto myfunc(@RequestBody String myWebhookRequestDto) {
		
		
		
		System.out.println("Hello World"+ myWebhookRequestDto);
//		try {
//			myjsonObj = new JSONObject(myWebhookRequestDto);
//			JSONObject queryResult = myjsonObj.getJSONObject("queryResult");
//			JSONObject intent = queryResult.getJSONObject("intent");
//			JSONObject parameters = queryResult.getJSONObject("parameters");
//			//JSONString nameparameter = queryResult.
//					
//			System.out.println("JSON QueryText"+ myjsonObj.getString("responseId"));
//			System.out.println("JSON Object"+ myjsonObj.getJSONObject("queryResult")+ "  "+ intent);
//			return myjsonObj;
//		} catch (Exception e) {
//			System.out.println(e);
//			return myjsonObj;
//		}
		return new MyWebhookDto("Hello World");
	}
}
