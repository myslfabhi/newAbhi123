package com.testingjava;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest2 {

@Test	
public void createDemo1()
{
	Reporter.log("test demo1",true);
}
@Test
public void practiceTest1()
{
	String url = System.getProperty("url");
	String username = System.getProperty("USERNAME");
	String password = System.getProperty("PASSWORD");
	
	System.out.println(System.getProperty("url"));
	System.out.println(System.getProperty("USERNAME"));
	System.out.println(System.getProperty("PASSWORD"));


	System.out.println("poll scm");


	
}
{
	
}

	

}
