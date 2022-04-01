package com.soisson.apreview.controller;

import com.soisson.apreview.model.Course;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CourseController {
    static Map<String, Course> courseMap = new HashMap();
    static{
        courseMap.put("compsci", new Course("Computer Science A","Easy","They don't usually teach, but the class is self-teachable.",
                3.7,"A","less than 1 hour.","0"));
        //add more courses
    }
//how to add more classes?

    //List<Course> courses = Arrays.asList(new Course("Computer Science A",4.0,5.1,3.7,93.3,0.5));
//    @GetMapping("/chemistry")
//    public Course getChemistry()
//    {
//        Course chemistry = new Course("chemistry","123abc",3.5);
//        return chemistry;
//    }
    @CrossOrigin
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
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
