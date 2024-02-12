package ca.sait.crs.factories;

import ca.sait.crs.contracts.Course;
import ca.sait.crs.contracts.Student;
import ca.sait.crs.exceptions.CannotCreateRegistrationException;
import ca.sait.crs.models.Registration;

/**
 * Creates Registration instances.
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public class RegistrationFactory {

    public RegistrationFactory() {
    }

    /**
     * Builds a Registration instance.
     * @param student Student
     * @param course Course
     * @return Registration instance
     * @throws CannotCreateRegistrationException Thrown if parameters are invalid.
     */
    public static Registration build(Student student, Course course) throws CannotCreateRegistrationException {
        // Do not check if students is eligible for registration here.

        if (!this.validateCourse(course)) {
            throw new CannotCreateRegistrationException("Course is invalid.");
        }

        if (!this.validateStudent(student)) {
            throw new CannotCreateRegistrationException("Student is invalid.");
        }

        return null;
    }

    /**
     * Validates a course.
     * @param course Course
     * @return True if course is valid.
     */
    private boolean validateCourse(Course course) {
        // TODO: Add logic to test course is valid.
    	return course != null && 
    	course.getCode() != null && 
    	!course.getCode().isEmpty() && 
    	course.getCode().length() <= 10 && 
    	course.getName() != null && 
    	!course.getName().isEmpty() && 
    	course.getName().length() <= 50;
    }

    /**
     * Validates a student.
     * @param student Student
     * @return True if student is valid.
     */
    private boolean validateStudent(Student student) {
        // TODO: Add logic to test student is valid.
    	return student != null && 
    	student.getName() != null && 
    	!student.getName().isEmpty() && 
    	student.getName().length() <= 50 && 
    	student.getGpa() >= 0.00 && student.getGpa() <= 4.00;
    }
}
