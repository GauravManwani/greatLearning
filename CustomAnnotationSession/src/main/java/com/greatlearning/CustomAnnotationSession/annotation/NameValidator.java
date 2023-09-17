package com.greatlearning.CustomAnnotationSession.annotation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<NameValidation, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		List<String> list=Arrays.asList(new String[] {"Gaurav","Karan","Shivam"});
		return list.contains(value);
	}

}
