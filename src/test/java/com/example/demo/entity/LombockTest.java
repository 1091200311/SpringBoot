package com.example.demo.entity;

import lombok.extern.java.Log;

@Log
public class LombockTest {
    public static void main(String[] args) {
        Student student=new Student();
        student.setAge(19);
        student.setMale("male");
        student.setName("sheng");
        student.setStudentNo("1602753109");
        System.out.println(student.toString());
        log.info("lombock test");
    }
}
