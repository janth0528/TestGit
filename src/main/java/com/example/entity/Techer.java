package com.example.entity;


/**
 *
 * @program: demo
 *
 * @Date: 2018/8/28 15:54
 *
 * @Author: MR.YAN
 *
 * @Description:
 *
 */
public class Techer {

    private int id;
    private Student student;
    private String name;

    public Techer(Student student){
        student = new Student();
    }


}
