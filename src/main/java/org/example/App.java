package org.example;


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
//        Dev obj=new Dev();
//        obj.build();
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
//        Dev obj=context.getBean(Dev.class);
//        Dev obj=(Dev)context.getBean("dev");
//        System.out.println( "Hello World!" );
//        obj.build();
    }
}
