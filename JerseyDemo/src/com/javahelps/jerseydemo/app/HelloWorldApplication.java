package com.javahelps.jerseydemo.app;

import org.glassfish.jersey.server.ResourceConfig;

public class HelloWorldApplication extends ResourceConfig{
	public HelloWorldApplication() {
		//package which contains the service class. 
		packages("com.javahelps.jerseydemo.services");
	}
}
