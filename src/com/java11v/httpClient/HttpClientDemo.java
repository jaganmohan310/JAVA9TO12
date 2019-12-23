package com.java11v.httpClient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
//import jdk.incubator.http.HttpRequest;
//import jdk.incubator.http.HttpResponse;
import java.sql.*;

public class HttpClientDemo {

	public static void main(String[] args) {
		String url = "https://www.google.com/";
		HttpClient httpclient = HttpClient.newHttpClient();
		try {
			HttpRequest httpRequest = HttpRequest.newBuilder(new URI(url)).GET().build();
			HttpResponse httpResponse = httpclient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
			System.out.println("Request: "+ httpRequest);
			System.out.println("Response from server: \n" + httpResponse.body());
		} catch (IOException | InterruptedException | URISyntaxException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
}
