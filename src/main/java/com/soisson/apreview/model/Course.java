package com.soisson.apreview.model;

public class Course {
    public String name,diff,teacher,grade,hw;
    public double ap;
    public String id;
    public Course(String name, String diff, String teacher, String grade, String hw, String id)
    {
        this.name=name;
        this.diff=diff;
        this.teacher=teacher;
        this.ap=ap;
        this.grade=grade;
        this.hw=hw;
        this.id=id;
    }
}
