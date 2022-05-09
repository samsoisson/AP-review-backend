package com.soisson.apreview.controller;

import com.soisson.apreview.model.Course;
import com.soisson.apreview.model.CourseTotals;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CourseController {
    static Map<String, CourseTotals> courseMap = new HashMap();
    static{
//        Course bio = new Course("Biology","Easy","They teach every day and do it well!",
//                "A (95-100)","1-2 hours","biology","4");
//        CourseTotals bioTotals = new CourseTotals();
//        bioTotals.addCourse(bio);
//        courseMap.put("biology", bioTotals);
//        courseMap.put("calcab", new Course("Calculus AB","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("calcbc", new Course("Calculus BC","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("capstone", new Course("Capstone","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("chemistry", new Course("Chemistry","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("chinese", new Course("Chinese","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("csa", new Course("Computer Science A","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("csp", new Course("Computer Science Principles","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("englishlang", new Course("English Language and Composition","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("englishlit", new Course("English Literature and Composition","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("environmental", new Course("Environmental Science","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("french", new Course("French","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("german", new Course("German","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("humangeo", new Course("Human Geography","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("latin", new Course("Latin","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("macro", new Course("Macroeconomics","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("micro", new Course("Microeconomics","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("musictheory", new Course("Music Theory","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("physics1", new Course("Physics 1","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("physics2", new Course("Physics 2","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("physicsc", new Course("Physics C","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("psych", new Course("Psychology","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("spanish", new Course("Spanish","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("stats", new Course("Statistics","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("usgov", new Course("US Government","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("ushistory", new Course("US History","No data","No data",
//                "No data","No data","No data","No data", 0));
//        courseMap.put("world", new Course("World History","No data","No data",
//                "No data","No data","No data","No data", 0));
        //getCourse("compsci");
        //System.out.println(courseMap.get("compsci"));
        //add more courses

    }


    //List<Course> courses = Arrays.asList(new Course("Computer Science A",4.0,5.1,3.7,93.3,0.5));
//    @GetMapping("/chemistry")
//    public Course getChemistry()
//    {
//        Course chemistry = new Course("chemistry","123abc",3.5);
//        return chemistry;
//    }
    @CrossOrigin
    @GetMapping("/courses/{courseId}")
    public static Course getCourse(@PathVariable String courseId)
    {
            CourseTotals totalsForCourse = courseMap.get(courseId);
            System.out.println("Found CourseTotals for "+courseId+". AP total is "+totalsForCourse.getAp()+" and counter is at "+totalsForCourse.getCounter());
            System.out.println("Average AP value of "+totalsForCourse.calculateAverages().ap);
            return totalsForCourse.calculateAverages();
    }

    @CrossOrigin
    @PostMapping("/courses")
    public void addCourse(@RequestBody Course newCourse)
    {
        CourseTotals totalsForCourse = courseMap.get(newCourse.id);
        if (totalsForCourse==null)
        {
//            System.out.println("No course found with id "+newCourse.id+". Creating new CourseTotals in map.");
            totalsForCourse = new CourseTotals();
        }
        totalsForCourse.addCourse(newCourse);
//        System.out.println("Added new course to CourseTotals with ap value of "+newCourse.ap);
//        System.out.println("New ap total for course is "+totalsForCourse.getAp());
        courseMap.put(newCourse.id,totalsForCourse);
    }
}