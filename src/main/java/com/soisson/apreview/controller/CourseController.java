package com.soisson.apreview.controller;

import com.soisson.apreview.AverageCourse;
import com.soisson.apreview.model.Course;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CourseController {
    static Map<String, Course> courseMap = new HashMap();
    static{
        courseMap.put("biology", new Course("Biology","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("calcab", new Course("Calculus AB","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("calcbc", new Course("Calculus BC","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("capstone", new Course("Capstone","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("chemistry", new Course("Chemistry","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("chinese", new Course("Chinese","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("csa", new Course("Computer Science A","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("csp", new Course("Computer Science Principles","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("englishlang", new Course("English Language and Composition","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("englishlit", new Course("English Literature and Composition","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("environmental", new Course("Environmental Science","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("french", new Course("French","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("german", new Course("German","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("humangeo", new Course("Human Geography","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("latin", new Course("Latin","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("macro", new Course("Macroeconomics","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("micro", new Course("Microeconomics","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("musictheory", new Course("Music Theory","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("physics1", new Course("Physics 1","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("physics2", new Course("Physics 2","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("physicsc", new Course("Physics C","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("psych", new Course("Psychology","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("spanish", new Course("Spanish","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("stats", new Course("Statistics","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("usgov", new Course("US Government","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("ushistory", new Course("US History","No data","No data",
                "No data","No data","No data","No data", 0));
        courseMap.put("world", new Course("World History","No data","No data",
                "No data","No data","No data","No data", 0));
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
            return courseMap.get(courseId);
    }

    @CrossOrigin
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course newCourse)
    {
        courseMap.putIfAbsent(newCourse.id, newCourse);
        return newCourse;
    }
    @CrossOrigin
    @PutMapping("/courses/{courseId}")
    public Course putCourse(@PathVariable String courseId, @RequestBody Course updater)
    {
        AverageCourse course = new AverageCourse(courseId,updater);
        courseMap.put(courseId,course.update());//change updater to course.update()
        return updater;
    }

}
