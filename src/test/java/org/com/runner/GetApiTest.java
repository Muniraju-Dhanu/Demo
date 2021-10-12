package org.com.runner;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.com.client.RestClient;
import org.com.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GetApiTest extends TestBase {
	TestBase testbase;
	String endpoint;
	String apiurl;
	String url;
	RestClient restclient;
	
    @BeforeMethod	
	public void setUp() {
    	testbase = new TestBase();
		endpoint = prop.getProperty("url");
		apiurl = prop.getProperty("APIurl");	
		url = endpoint+apiurl;
	}
	
	@Test
	public void getTest() throws ClientProtocolException, IOException {	 
		restclient = new RestClient();
		restclient.get(url);		
	}

}
