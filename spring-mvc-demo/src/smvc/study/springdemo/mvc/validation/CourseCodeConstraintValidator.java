package smvc.study.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
	implements ConstraintValidator<CourseCode, String>{
	// Fields
	private String [] coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String code,
			ConstraintValidatorContext constraintValidatorContext) {
		// Analyze if the prefix exists
		boolean result = false;
		
		// Check null
		if (code != null) {
			for (String temp : coursePrefix) {
				result = code.startsWith(temp);
				if (result) {
					break;
				}
			}
		} else {
			result = true;
		}
		return result;
	}

}
