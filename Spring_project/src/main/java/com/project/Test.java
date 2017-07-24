package com.project;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	 public static void main(String[] args) {
	
		 
		 FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("main.xml");
	      
	      HelloWorld obj = (HelloWorld) context.getBean("helloworld");
	      obj.getMessage();
	      context.close();
	   }
}
