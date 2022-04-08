package springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Null;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
//        ConstraintValidator.super.initialize(constraintAnnotation);
          coursePrefix=constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if (theCode!= null){
            result = theCode.startsWith(coursePrefix);
        }
        else{
            result = false;
        }

        return result;
    }
}