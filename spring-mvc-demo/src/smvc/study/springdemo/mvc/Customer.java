package smvc.study.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import smvc.study.springdemo.mvc.validation.CourseCode;

public class Customer {
	// Fields
	private String firstName;
	
	// Annotations rules to validation
	@NotNull(message="is required") @Size(min=1, message="is required")
	private String lastName;
	
	// The message from not null will appear only with Integer class because with primitive integer
	// fails to parse to string
	@NotNull(message="passes Required")
	@Min(value=0, message="greater than or equal to zero")
	@Max(value=10, message="less than or equal to 10")
	private Integer freePasses;
	
	// this pattern means that you can add a-z or A-Z or 0-9 with length 5.
	// if you want only digits it just write 0-9 with the desire length.
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	// The default value is LUV that is defined in annotation, but the other values can be 
	// defined here
	@CourseCode(value= {"MPS", "VER"},message="must start with MPS and VER!")
	private String courseCode;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
}
