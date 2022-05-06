package com.soisson.apreview;
import java.util.Arrays;
import com.soisson.apreview.model.Course;
import java.lang.Math;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
//find a way to reset the values below to zero when a new class is made
public class AverageCourse {
    private String courseId;
    private static int ap = 0;
    private static int teacher = 0;
    private static int grade = 0;
    private static int hw = 0;
    private static int diff = 0;
    private static int counter = 0;
    private static Course updater;
    private static int[] courses=new int[27];

    public AverageCourse(String courseId, Course updater) {
        this.courseId = courseId;
        this.updater = updater;
//        newClass();
    }

//    public void newClass()
//    {
////        if (updater.counter==0)
////        {
////            ap = 0;
////            teacher = 0;
////            grade = 0;
////            hw = 0;
////            diff = 0;
////            counter = 0;
////        }
////            updater.counter++;
//    }

    public static Course update() {
        counter++;
        updater.ap = updateAverage(updater.ap, 1);
        updater.grade = updateAverage(updater.grade, 2);
        updater.hw = updateAverage(updater.hw, 3);
        updater.diff = updateAverage(updater.diff, 4);
        updater.teacher = updateAverage(updater.teacher, 5);
        return updater;
    }

    public static String updateAverage(String update, int param) {
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        String e = "";
        String f = "";
        if (param == 1) {
            a = "1";
            b = "2";
            c = "3";
            d = "4";
            e = "5";
            f = "6";
        }
        if (param == 2) {
            a = "A (95-100)";
            b = "A- (90-94)";
            c = "B (85-89)";
            d = "B- (80-84)";
            e = "C (70-79)";
            f = "F (0-69)";
        }
        if (param == 3) {
            a = "~0 hours";
            b = "less than 1 hour";
            c = "1-2 hours";
            d = "more than 2 hours";
            e = "nothing";
            f = "nothing";
        }
        if (param == 4) {
            a = "Easy";
            b = "Intermediate";
            c = "Hard";
            d = "Hardest class";
            e = "nothing";
            f = "nothing";
        }
        if (param == 5) {
            a = "They teach every day and do it well!";
            b = "They teach every day but do so poorly.";
            c = "They teach half the time and do it well!";
            d = "They teach half the time and do so poorly.";
            e = "They don't usually teach, but the class is self-teachable.";
            f = "They don't usually teach, and the class is difficult because of this!";
        }
        return getPoints(update, a, b, c, d, e, f, param);
    }

    public static String getPoints(String update, String a, String b, String c, String d, String e, String f, int param) {
        int majority = 0;
        int ff = 0;
        int ee = 0;
        int dd = 0;
        int cc = 0;
        int bb = 0;
        int aa = 0;
        int total = 0;
        if (param !=5) {
            if (update.equals(a))
                aa++;
            else if (update.equals(b))
                bb += 2;
            else if (update.equals(c))
                cc += 3;
            else if (update.equals(d))
                dd += 4;
            else if (update.equals(e))
                ee += 5;
            else if (update.equals(f))
                ff += 6;
        } else {
            if (update.equals(a))
                aa++;
            else if (update.equals(b))
                bb++;
            else if (update.equals(c))
                cc++;
            else if (update.equals(d))
                dd++;
            else if (update.equals(e))
                ee++;
            else if (update.equals(f))
                ff++;
        }
        int[] points = {aa, bb, cc, dd, ee, ff};
        String[] strings = {a, b, c, d, e, f};
        if (param == 5) {
            for (int i = 0; i < points.length; i++) {
                if (majority < points[i])
                    majority = i;
            }
            return strings[majority];//todo add tie-breaker
        }
        for (int i = 0; i < points.length; i++) {
            total += points[i];
        }
//        if(param==1)
//            return ""+((double)(ap+total)/1);
        return strings[keepTotals(param, total) - 1];
    }

    public static int keepTotals(int param, int total) {
        if (param == 1) {
            ap += total;
            return (int) Math.round((double)ap / counter);
        }
        if (param == 2) {
            grade += total;
            return (int) Math.round((double)grade / counter);
        }
        if (param == 3) {
            hw += total;
            return (int) Math.round((double)hw / counter);
        }
        if (param == 4) {
            diff += total;
            return (int) Math.round((double)diff / counter);
        } else {
            return 0;
        }
    }
}