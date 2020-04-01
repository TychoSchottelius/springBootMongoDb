package de.empulse.springbootin10steps.entity;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * TODO: Add class description
 *
 * @author Tycho Schottelius, empulse GmbH, 2020-04-01
 */
// this is a sub-document in our MongoDB. so we do not need to mark this one with the @Document annotation.
public class Department {

    @Field(name = "department_name")
    private String departmentName;
    private String location;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
