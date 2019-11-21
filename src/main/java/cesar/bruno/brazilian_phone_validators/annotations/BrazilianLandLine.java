package cesar.bruno.brazilian_phone_validators.annotations;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;

import cesar.bruno.brazilian_phone_validators.validators.BrazilianLandLineValidator;

@Constraint(validatedBy = { BrazilianLandLineValidator.class })
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@ReportAsSingleViolation
public @interface BrazilianLandLine {

	String message() default "invalid brazilian land line number";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
