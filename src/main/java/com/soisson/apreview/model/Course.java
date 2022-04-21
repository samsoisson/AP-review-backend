package com.soisson.apreview.model;

import com.soisson.apreview.AverageCourse;

public class Course {
    public String name,diff,teacher,grade,hw;
    public String ap;
    public String id;
    public int counter;
    public Course(String name, String diff, String teacher, String grade, String hw, String id, String ap,int counter)
    {
        this.name=name;
        this.diff=diff;
        this.teacher=teacher;
        this.ap=ap;
        this.grade=grade;
        this.hw=hw;
        this.id=id;
        this.counter=counter;
    }
}
