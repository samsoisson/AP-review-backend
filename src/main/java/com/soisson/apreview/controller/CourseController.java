package com.soisson.apreview.controller;

import com.soisson.apreview.model.Course;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CourseController {
    static Map<String, Course> courseMap = new HashMap();
    static{
        courseMap.put("biology", new Course("Biology","No data","No data",
                "No data","No data","No data"));
        courseMap.put("calcab", new Course("Calculus AB","No data","No data",
                "No data","No data","No data"));
        courseMap.put("calcbc", new Course("Calculus BC","No data","No data",
                "No data","No data","No data"));
        courseMap.put("capstone", new Course("Capstone","No data","No data",
                "No data","No data","No data"));
        courseMap.put("chemistry", new Course("Chemistry","No data","No data",
                "No data","No data","No data"));
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

}
