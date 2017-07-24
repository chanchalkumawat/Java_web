package com.DI;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext c = new FileSystemXmlApplicationContext("beansannotation.xml");
		StudentAnnote s1 = (StudentAnnote)c.getBean("student1");
		StudentAnnote s2 = (StudentAnnote)c.getBean("student2");
		System.out.println(s1);
		System.out.println(s2);
		


	}

}
