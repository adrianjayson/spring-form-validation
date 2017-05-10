package com.adrianjayson.demo;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by adrianjayson on 5/6/17.
 */
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    public String value() default "OMG";

    public String message() default "must start with OMG";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
