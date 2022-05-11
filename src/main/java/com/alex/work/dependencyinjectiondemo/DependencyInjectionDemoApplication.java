package com.alex.work.dependencyinjectiondemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication
{

    public static void main(String[] args)
    {
//        SpringApplication.run(DependencyInjectionDemoApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.showPhone());

    }

}
