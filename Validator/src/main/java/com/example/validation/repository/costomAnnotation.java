package com.example.validation.repository;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class costomAnnotation implements ConstraintValidator<checkvalidpassword, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		String password_pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()%–[{}]:;',?/*~$^+=<>]).{8,24}$";
		Pattern pattern = Pattern.compile(password_pattern);
		Matcher match = pattern.matcher(value);
		return match.matches() ? true : false;
		

	}

}
