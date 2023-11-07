package com.jpm.utils;

import java.io.IOException;

import com.jpm.pageObject.PageObjectManager;

public class TestContext {

	public PageObjectManager pom;
	public BaseClass driverclass;
	
	public TestContext() throws IOException
	{
		driverclass=new BaseClass();
		pom= new PageObjectManager(driverclass.implementBaseClass());
		
	}
	
	
}
