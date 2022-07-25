package com.testingjava;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void createDemo1Test()
	{
	String browser = System.getProperty("browser");
		String url=System.getProperty("url");
		System.out.println("browser is "+ browser+ " url is "+ url);
		
		Reporter.log("Test Demo1",true);
	}
	@Test
	public void createDemo2Test()
	{
		Reporter.log("Test Demo2",true);
		
	}
	@Test
	public void createDemo3Test()
	{
		Reporter.log("Test Demo3",true);
	}
	@Test
	public void createDemo4Test()
	{
		Reporter.log("Test Demo4",true);
		//automatic   

	}

}
