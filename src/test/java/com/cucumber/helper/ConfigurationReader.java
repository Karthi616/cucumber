package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
public  ConfigurationReader() throws IOException 
	{
		File f= new File("C:\\Users\\USER\\eclipse-workspace\\Cucumbe\\src\\test\\java\\com\\cucumber\\properties\\Configuration.properties");
FileInputStream fis= new FileInputStream(f);
 p= new Properties();
p.load(fis);

	}
public static String getbrowserName() {
	String browser = p.getProperty("browsername");
	return browser;

	
}
public static String geturl() {
	String url = p.getProperty("url");
	return url;
	
}
public static String getUserName()
{
String user = p.getProperty("username");
return user;
}
public static String name() {
	String passs = p.getProperty("password");
	return passs;
}
}