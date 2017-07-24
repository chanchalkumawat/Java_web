package com.DI;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		Student st = (Student)context.getBean("student");
		System.out.println(st);
		System.out.println(st.getHostel().toString());
		System.out.println(st.toString());

}
}