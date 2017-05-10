package com.adrianjayson.demo;

import javax.validation.constraints.*;

/**
 * Created by adrianjayson on 5/5/17.
 */
public class Student {

    @NotNull(message="is required")
    @Size(min=1, message = "is required")
    private String firstName;

    @NotNull(message="is required")
    @Size(min=1, message = "is required")
    private String lastName;

    @NotNull(message="is required")
    @Min(value=10, message="too young for highschool")
    @Max(value=65, message="too old for highschool")
    private Integer age;

//    @Pattern(regexp = "^[a-zA-Z0-9]{4}", message = "only 4 chars/digits")
    @CourseCode(value = "OMG", message = "must begin with OMG")
    private String courseCode;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
