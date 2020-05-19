package com.filemon.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import com.filemon.restapi.TriggerFileMonitoring;

public class TestFileMonitoringApp {
	TriggerFileMonitoring app;
	@Before
	public void setUp(){
		System.out.println("Before");
		app = new TriggerFileMonitoring();
	}
	
	@Test
	public void testIfDirectoryExists(){	
	List<String> directories = new ArrayList();
	directories.add("E:/Dev/MonDirectory1");
	System.out.println("running");
		//Assert.assertNotNull(app.getFilesIndirectory(directories));
		Assert.assertNotNull("The Passed Directory does not exist", app.getFilesIndirectory(directories));
	}
	
	@Test
	public void testIfDirectoryHasFiles(){	
	List<String> directories = new ArrayList();
	directories.add("E:/Dev/MonDirectory");
	System.out.println("running");
		//Assert.assertNotNull(app.getFilesIndirectory(directories));
		Assert.assertNotNull("There are no files in directory", app.getFilesIndirectory(directories).size()>0);
	}
}
