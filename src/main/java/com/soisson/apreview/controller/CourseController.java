package com.soisson.apreview.controller;

import com.soisson.apreview.model.Course;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    List<Course> courses = new ArrayList<>(Arrays.asList(new Course("Computer Science A","Easy","They don't usually teach, but the class is self-teachable.",
            3.7,"A","less than 1 hour.")));
//how to add more classes?

    //List<Course> courses = Arrays.asList(new Course("Computer Science A",4.0,5.1,3.7,93.3,0.5));
//    @GetMapping("/chemistry")
//    public Course getChemistry()
//    {
//        Course chemistry = new Course("chemistry","123abc",3.5);
//        return chemistry;
//    }
    @CrossOrigin
    @GetMapping("/courses/{index}")
    public Course getCourse(@PathVariable int index)
    {
        return courses.get(index);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course newCourse)
    {
        courses.add(newCourse);
        return newCourse;
    }

}
