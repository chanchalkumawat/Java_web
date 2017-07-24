package com.DI;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test4 {

	public static void main(String[] args) {
		 FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("main.xml");
		 Ebook ebook = (Ebook)context.getBean("ebook");
		 System.out.println(ebook.toString());
		// TODO Auto-generated method stub

	}

}
