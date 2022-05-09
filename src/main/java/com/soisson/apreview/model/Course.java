package com.soisson.apreview.model;

import com.soisson.apreview.AverageCourse;

public class Course {
    public String name,diff,teacher,grade,hw;
    public String teacher1,teacher2,teacher3,teacher4,teacher5,teacher6;
    public String ap;
    public String id;
//    public Course(String name, String diff, String teacher,String teacher1, String teacher2,String teacher3,String teacher4,String teacher5,String teacher6,String grade, String hw, String id, String ap)
public Course(String name, String diff, String teacher,String grade, String hw, String id, String ap)
    {
        this.name=name;
        this.diff=diff;
        this.teacher=teacher;
//        this.teacher1=teacher1;
//        this.teacher2=teacher2;
//        this.teacher3=teacher3;
//        this.teacher4=teacher4;
//        this.teacher5=teacher5;
//        this.teacher6=teacher6;
        this.ap=ap;
        this.grade=grade;
        this.hw=hw;
        this.id=id;
    }
}
