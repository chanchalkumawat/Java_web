package com.DI;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FileSystemXmlApplicationContext con =	new FileSystemXmlApplicationContext("beans.xml");
	User user = (User)con.getBean("user");
	System.out.println(user.getCar().toString());
	

	}

}
