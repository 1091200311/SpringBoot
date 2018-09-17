package com.example.demo.dao;

import com.example.demo.entity.Course;

import java.util.Arrays;
import java.util.List;

public class CourseDao {
    public List<Course> getCourses(){
        Course[] courses={
                new Course("1.jpg","超凡羽毛球队欢迎你"),
                new Course("2.jpg","NRS面向神经元定向康复体系"),
                new Course("3.jpg","行业报告"),
//                new Course("4.jpg","福利"),
//                new Course("5.png","乔丹篮球会招新了")
        };
        List<Course> courseList= Arrays.asList(courses);
        return courseList;
    }
}
