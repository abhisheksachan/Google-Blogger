package org.blogger.demo.blogger;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HttpURLConnection connection = null;
		String mediaData = null;
		String jobUrl = "https://www.googleapis.com/blogger/v3/blogs/byurl?url="
				+ "http%3A%2F%2Fdeshrajdry.blogspot.in&key=AIzaSyDCyoS7wsxZdSRCmUozarU435it8zJ5oaI";
		
		URL url;
		try {
			url = new URL(jobUrl);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type","application/json");
			InputStream responseStream = connection.getInputStream();
			 String charset = "UTF-8";
			mediaData = IOUtils.toString(responseStream, charset);
			System.out.println("-------"+mediaData);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
					}
		
    }
}
