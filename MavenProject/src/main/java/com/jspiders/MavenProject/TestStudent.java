package com.jspiders.MavenProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent 
{
    public static void main(String[] args)
    {
    	ClassPathXmlApplicationContext context= 
    			new ClassPathXmlApplicationContext("com/jspiders/MavenProject/config.xml");
		
    	Student std=(Student) context.getBean("ABCD");
    	
    	System.out.println(std);
	}

}
