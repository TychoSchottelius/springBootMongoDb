package de.empulse.springbootin10steps.repository;

import de.empulse.springbootin10steps.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TODO: Add class description
 *
 * @author Tycho Schottelius, empulse GmbH, 2020-04-01
 */
// the repository for the class representing the collection. extends MongoRepository and provides
// the entity class and the data-type of the uniqueIdentifier.
// here we can create our own methods
@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    // due to method proxy, here we also need the correct name of the method
    List<Student> findByName(String name);

    // order of parameters needs to fit the order of method name
    Student findByNameAndEmail(String name, String email);

    List<Student> findByNameOrEmail(String name, String email);

    List<Student> findByDepartmentDepartmentName(String deptName);

    List<Student> findBySubjectsSubjectName(String subName);

    List<Student> findByEmailIsLike(String email);

    List<Student> findByNameStartsWith(String name);
}
