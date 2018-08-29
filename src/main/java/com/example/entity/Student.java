package com.example.entity;

/*
 *
 * @program: demo
 *
 * @Date: 2018/8/28 15:35
 *
 * @Author: MR.YAN
 *
 * @Description:
 *
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {

    private int id;
    private String name;
    private int age;
    private String address;


    public int stringtoint(String str){
        return 0;
    }

}
