package com.adrianjayson.demo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by adrianjayson on 5/6/17.
 */
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    public String coursePrefix;

    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefix = courseCode.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if (s != null) {
            result = s.startsWith(coursePrefix);
        } else {
            result = true;
        }

        return result;
    }
}
