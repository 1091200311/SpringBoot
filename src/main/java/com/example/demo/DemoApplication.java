package com.example.demo;

//import com.example.demo.bean.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

//        ApplicationContext ac=SpringApplication.run(DemoApplication.class, args);
//        Course course=(Course) ac.getBean("course");
//        System.out.println(course.toString());
          SpringApplication.run(DemoApplication.class, args);
    }
}
