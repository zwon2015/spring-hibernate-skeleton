package com.car.rental.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.car.rental.domain.UserLogin;

public class PasswordValidator implements Validator {
	private static final int MINIMUM_PASSWORD_LENGTH = 6;

	@Override
	public boolean supports(Class type) {
		return UserLogin.class.equals(type);
	}

	@Override
	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password",
				"field.required", "This field can't be blank");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "verification",
				"field.required", "This field can't be blank");
		UserLogin user = (UserLogin) object;
		if (user.getPassword() != null
				&& user.getPassword().length() < MINIMUM_PASSWORD_LENGTH)
			errors.rejectValue("password", "password.length",
					"Password must be more than 5 characters");
		}
}
