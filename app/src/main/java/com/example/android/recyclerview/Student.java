package com.example.android.recyclerview;

/**
 * Created by lenovo on 6/15/2017.
 */

public class Student {
    String name;
    String course;

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public Student(String name, String course) {

        this.name = name;
        this.course = course;
    }
}
