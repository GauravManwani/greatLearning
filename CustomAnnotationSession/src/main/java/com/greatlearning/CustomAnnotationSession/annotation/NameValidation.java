package com.greatlearning.CustomAnnotationSession.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NameValidator.class)
public @interface NameValidation {

	//error message
	public String message() default "Invalid Name: Valid Names are: \"Gaurav\",\"Karan\",\"Shivam\"";
	
	public Class<?>[] groups() default {};
	
	//additional information about annotation
	public Class<? extends Payload>[] payload() default {};
}
