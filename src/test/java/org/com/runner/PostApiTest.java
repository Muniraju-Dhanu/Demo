package org.com.runner;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.com.client.RestClient;
import org.com.testbase.TestBase;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.users.Users;


public class PostApiTest extends TestBase{
	TestBase testbase;
	String endpoint;
	String apiurl;
	String url;
	RestClient restclient;
	
	@BeforeMethod	
	public void setUp() {
    	testbase = new TestBase();
		endpoint = prop.getProperty("url");
		apiurl = prop.getProperty("serviceurl");	
		url = endpoint+apiurl;
	}
	
	/*
	 * //@Test public void postApitest() throws StreamWriteException,
	 * DatabindException, IOException { restclient = new RestClient();
	 * HashMap<String, String> headerMap = new HashMap<String, String>();
	 * headerMap.put("Content-Type", "application/json");
	 * 
	 * //jackson API: ObjectMapper mapper = new ObjectMapper(); Users users = new
	 * Users("morphous", "leader");
	 * 
	 * //Object to json file: mapper.writeValue(new
	 * File("C:/Users/Dell/Documents/Demo/restapitest/users.json"), users);
	 * 
	 * //Object to json in String: String usersjsonstring =
	 * mapper.writeValueAsString(users); System.out.println(usersjsonstring);
	 * 
	 * closeablehttpresponse = restclient.post(url, usersjsonstring, headerMap);
	 * 
	 * //status code int statuscode =
	 * closeablehttpresponse.getStatusLine().getStatusCode();
	 * System.out.println("Status code ----> "+statuscode);
	 * 
	 * //JSON String String responsestring =
	 * EntityUtils.toString(closeablehttpresponse.getEntity(), "UTF-8");
	 * 
	 * JSONObject responsejson = new JSONObject(responsestring);
	 * System.out.println("Response JSON from API--->" +responsejson);
	 * 
	 * }
	 */
}
