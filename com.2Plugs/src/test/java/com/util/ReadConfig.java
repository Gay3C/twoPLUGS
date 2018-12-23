package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/Config.properties");
		
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername1()
	{
	String username=pro.getProperty("username");
	return username;
	}
	public String getUsername2()
	{
	String username2=pro.getProperty("username2");
	return username2;
	}
	public String getUsername3()
	{
	String username3=pro.getProperty("username3");
	return username3;
	}
	
	
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getPageTitle()
	{
		String pageTitle=pro.getProperty("pageTitle");
		return pageTitle;
	}


}
