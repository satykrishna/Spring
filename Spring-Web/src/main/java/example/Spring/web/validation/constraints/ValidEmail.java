package example.Spring.web.validation.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD,
		java.lang.annotation.ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {example.Spring.web.validation.constraints.ValidEmailImpl.class})
public @interface ValidEmail {
	public abstract String message() default "This is not a valid email address, please enter it properly";

	public abstract Class<?>[] groups() default {};

	public abstract Class<? extends Payload>[] payload() default {};

	public abstract int min() default 4;

}