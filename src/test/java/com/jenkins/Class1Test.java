package com.jenkins;

import org.testng.annotations.Test;

public class Class1Test {

@Test
public void demo1() {
	
	String browser = System.getProperty("BROWSER");
    String url = System.getProperty("URL");
	
	System.out.println(browser+"======"+url);
	System.out.println("hello junkins");
}
	
}
