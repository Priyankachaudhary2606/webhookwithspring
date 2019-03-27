package com.example.webhookwithspring;

import com.google.actions.api.ActionRequest;
import com.google.actions.api.ActionResponse;
import com.google.actions.api.DialogflowApp;
import com.google.actions.api.ForIntent;
import com.google.actions.api.response.ResponseBuilder;

public class IntentApp extends DialogflowApp{
	
	@ForIntent("bye")
	  public ActionResponse make_name(ActionRequest request) {

	    String response =
	        "<Alright, your silly name is Maya. I hope you like it. See you next time.";
	    ResponseBuilder responseBuilder = getResponseBuilder(request).add(response).endConversation();
	    ActionResponse actionResponse = responseBuilder.build();
	   
	    return actionResponse;
	  }

}
