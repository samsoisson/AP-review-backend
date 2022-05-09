package com.soisson.apreview.model;

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


    public int averageTeacher()
    {
        //TODO - might be an error here
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

    public int averageDiff()
    {
        return diff/counter;
    }

    public int averageAp()
    {
        return ap/counter;
    }

    public Course calculateAverages()
    {
        Course myCourse=new Course("",
                PointToChoiceMapper.MapDifficulty(averageDiff()),
                PointToChoiceMapper.MapTeacher(averageTeacher()),
                PointToChoiceMapper.MapGrade(averageGrade()),
                PointToChoiceMapper.MapHomework(averageHw()),
                "",
                PointToChoiceMapper.MapAp(averageAp()));
        return myCourse;
    }

    public Course addCourse(Course newCourse)
    {
        this.counter++;
        this.diff+=ChoiceToPointMapper.MapDifficulty(newCourse.diff);
        this.ap+=ChoiceToPointMapper.MapAp(newCourse.ap);
        this.grade+=ChoiceToPointMapper.MapGrade(newCourse.grade);
        this.hw+=ChoiceToPointMapper.MapHomework(newCourse.hw);

        int teacherPoint = ChoiceToPointMapper.MapTeacher(newCourse.teacher);
//        if(teacherPoint==1)


        return newCourse;
        //TODO - get number value of newCourse.teacher
        //TODO - pass the number value to the updateToUpperValue function
    }
    private void updateTeacherValue(int teacherValue)
    {
        //TODO - increment number of votes of the correct teacher rating
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

    public int getCounter(){return counter;}
}
