package de.empulse.springbootin10steps.StudentController;

import de.empulse.springbootin10steps.StudentService.StudentService;
import de.empulse.springbootin10steps.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: Add class description
 *
 * @author Tycho Schottelius, empulse GmbH, 2020-04-01
 */
@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

}
