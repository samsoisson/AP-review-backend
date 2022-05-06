package com.soisson.apreview.model;

import java.util.ArrayList;

public class CourseTotals
{
    private int diff,teacher,grade,hw, ap, counter,name;
    private int teacher1,teacher2,teacher3,teacher4,teacher5,teacher6;
    public static Course updater;
    public CourseTotals()
    {
        this.diff=0;
        this.teacher=0;
        this.grade=0;
        this.hw=0;
        this.ap=0;
        this.counter=0;
    }

    public int averageDiff()
    {
        return diff/counter;
    }

    public int averageAp()
    {
        return ap/counter;
    }

    public int averageTeacher()
    {
        int choice = teacher;
        switch (choice) {
            case 1:
                teacher1++;break;
            case 2:
                teacher2++;break;
            case 3:
                teacher3++;break;
            case 4:
                teacher4++;break;
            case 5:
                teacher5++;break;
            default:
                teacher6++;break;
        }
        int[] teachers = {teacher1,teacher2,teacher3,teacher4,teacher5,teacher6};
        int majority=0;
        for (int i = 0; i < teachers.length; i++) {
            if (majority < teachers[i])
                majority = i;
        }
        return majority;
    }

    public int averageGrade()
    {
        return grade/counter;
    }

    public int averageHw()
    {
        return hw/counter;
    }

    public Course getCourse()
    {
        Course myCourse=new Course("",
                PointToChoiceMapper.MapDifficulty(averageDiff()),
                PointToChoiceMapper.MapTeacher(averageTeacher()),
                PointToChoiceMapper.MapGrade(averageGrade()),
                PointToChoiceMapper.MapHomework(averageHw()),
                "",
                PointToChoiceMapper.MapAp(averageAp()),
                counter);
        return myCourse;
    }

    public Course addCourse(Course newCourse)
    {
        this.counter++;
        this.diff+=ChoiceToPointMapper.MapDifficulty(newCourse.diff);
        this.ap+=ChoiceToPointMapper.MapAp(newCourse.ap);
        this.grade+=ChoiceToPointMapper.MapGrade(newCourse.grade);
        this.hw+=ChoiceToPointMapper.MapHomework(newCourse.hw);
        this.teacher=ChoiceToPointMapper.MapTeacher(newCourse.teacher);
        return newCourse;
    }

    public int getDiff()
    {
        return diff;
    }

    public int getTeacher()
    {
        return teacher;
    }

    public int getAp()
    {
        return ap;
    }

    public int getGrade()
    {
        return grade;
    }

    public int getHw()
    {
        return hw;
    }

}
