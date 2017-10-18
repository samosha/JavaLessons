package com.company;

/**
 * Created by LM14 on 18.10.2017.
 */
public class Student extends Person{
    int course;

    public Student(int height, float weight, int course){
        super(height, weight);
        this.course = course;
    }
}
