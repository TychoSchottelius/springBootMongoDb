package de.empulse.springbootin10steps.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * TODO: Add class description
 *
 * @author Tycho Schottelius, empulse GmbH, 2020-04-01
 */
// ObjectRelationalMapping
// this class represents one collection in the MongoDB, here called "student"
@Document(collection = "student")
public class Student {

    // the attributes equal the fields in the collection of the MongoDB
    // when the attribute-names equal the field-names, you do not need the @Field annotation.
    // for the id we have the special @Id annotation and need not worry about the name.
    @Id
    private String id;
    private String name;
    @Field(name  = "mail")
    private String email;
    private Department department;
    private List<Subject> subjects;

    public Student(String id, String name, String email, Department department, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.subjects = subjects;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
