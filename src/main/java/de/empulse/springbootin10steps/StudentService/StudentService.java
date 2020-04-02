package de.empulse.springbootin10steps.StudentService;

import de.empulse.springbootin10steps.entity.Student;
import de.empulse.springbootin10steps.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO: Add class description
 *
 * @author Tycho Schottelius, empulse GmbH, 2020-04-01
 */
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    // each instance of student will have its own id generated by MongoDB
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // save-method is creating if no id is delivered,
    // but updating if an id is delivered
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudent(String id) {
        studentRepository.deleteById(id);
        return "Student has been deleted.";
    }

    public List<Student> getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    public Student getStudentByNameAndMail(String name, String email) {
        return studentRepository.findByNameAndEmail(name, email);
    }

    public List<Student> getStudentByNameOrMail(String name, String email) {
        return studentRepository.findByNameOrEmail(name, email);
    }
}
