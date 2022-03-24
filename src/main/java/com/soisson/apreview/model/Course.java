package com.soisson.apreview.model;

public class Course {
    public String name;
    public double diff,teacher,ap,grade,hw;

    public Course(String name,double diff,double teacher,double ap,double grade,double hw)
    {
        this.name=name;
        this.diff=diff;
        this.teacher=teacher;
        this.ap=ap;
        this.grade=grade;
        this.hw=hw;
    }
}
