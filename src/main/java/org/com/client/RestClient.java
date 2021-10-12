package org.com.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {

	CloseableHttpResponse closeablehttpresponse;
	//1. getMethod
	public void get(String url) throws ClientProtocolException, IOException {
	CloseableHttpClient httpClient = HttpClients.createDefault();
	HttpGet httpget= new HttpGet(url); //http get request
	CloseableHttpResponse closeablehttpresponse = httpClient.execute(httpget); //hit the URL
	
	//status code
	int statuscode = closeablehttpresponse.getStatusLine().getStatusCode();
	System.out.println("Status code ----> "+statuscode);
	
	//JSON String
	String responsestring = EntityUtils.toString(closeablehttpresponse.getEntity(), "UTF-8");
	
	JSONObject responsejson = new JSONObject(responsestring);
	System.out.println("Response JSON from API--->" +responsejson);
	
	//Headers
	Header[] headersarray = closeablehttpresponse.getAllHeaders();
	HashMap<String, String> allheaders = new HashMap<String, String>();
		for(Header header: headersarray) {
			allheaders.put(header.getName(), header.getValue());
		}
			System.out.println("Headers Array"+ allheaders);
		}
		
	  public CloseableHttpResponse post(String url, String entityString, HashMap<String, String> headermap) throws ClientProtocolException,
	  IOException { 
		  CloseableHttpClient httpClient = HttpClients.createDefault();
		  HttpPost httppost= new HttpPost(url); //http post request
		  httppost.setEntity(new StringEntity(entityString));// for payload	  
	  
	  //for headers: 
	  for(Map.Entry<String, String> entry: headermap.entrySet()) {
		  httppost.addHeader(entry.getKey(), entry.getValue()); }
	  
	    closeablehttpresponse = httpClient.execute(httppost);//hit the post URL 
	  	return closeablehttpresponse; 
   }	 
}
