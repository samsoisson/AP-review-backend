package com.soisson.apreview.model;

public class Course {
    public String name,diff,teacher,grade,hw;
    public double ap;

    public Course(String name,String diff,String teacher,double ap,String grade,String hw)
    {
        this.name=name;
        this.diff=diff;
        this.teacher=teacher;
        this.ap=ap;
        this.grade=grade;
        this.hw=hw;
    }
}
