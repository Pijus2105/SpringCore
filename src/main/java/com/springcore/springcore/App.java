package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ap = new ClassPathXmlApplicationContext("com/springcore/springcore/config.xml");
        Student st = (Student) ap.getBean("student1");
        Student st2 =(Student) ap.getBean("student2");
        
        System.out.println(st);
        System.out.println(st2);
    }
}
