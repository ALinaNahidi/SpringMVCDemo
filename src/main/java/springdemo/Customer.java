package springdemo;


import lombok.Data;
import springdemo.validation.CourseCode;

import javax.validation.constraints.*;

public @Data class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1,message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0,message = ">=0")
    @Max(value = 10,message = "<=10")
    private Integer freePasses;

    @Pattern(regexp = "^[0-9]{5}", message = "Only 5 digits/chars")
    private String pinCode;

    @CourseCode()
    private String courseCode;



}
