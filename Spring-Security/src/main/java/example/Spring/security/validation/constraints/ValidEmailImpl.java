package example.Spring.security.validation.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.validator.routines.EmailValidator;

//first argument = Required annotation second argument = Type
public class ValidEmailImpl implements ConstraintValidator<ValidEmail, String> {

	private int minimumLength;
	
	@Override
	public void initialize(ValidEmail constraintAnnotation) {
		minimumLength = constraintAnnotation.min();
	}

	@Override
	public boolean isValid(String emailAddress, ConstraintValidatorContext paramConstraintValidatorContext) {
		
		if(emailAddress.length() >= minimumLength ) {
			return true;
		}
		
		EmailValidator validator = EmailValidator.getInstance(false);
		
		if(validator.isValid(emailAddress)) {
			return true;
		}
		
		return false;
	}

}
