package ca.sait.crs.models;

import ca.sait.crs.contracts.Course;
import ca.sait.crs.contracts.Student;
import ca.sait.crs.exceptions.CannotCreateRegistrationException;

/**
 * Represents a registration.
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public final class Registration implements ca.sait.crs.contracts.Registration {
    /**
     * Associated course
     */
    private final Course course;

    /**
     * Associated student
     */
    private final Student student;

    /**
     * Initializes instance.
     * @param course Course instance
     * @param student Student instance
     * @throws CannotCreateRegistrationException if the registration cannot be created
     */
    public Registration(Course course, Student student) throws CannotCreateRegistrationException {
        if (course == null || student == null) {
            throw new CannotCreateRegistrationException("Course and student must not be null");
        }
        this.course = course;
        this.student = student;
    }

    /**
     * Gets the course.
     * @return Course
     */
    @Override
    public Course getCourse() {
        return course;
    }

    /**
     * Gets the student
     * @return Student
     */
    @Override
    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.getCourse(), this.getStudent());
    }
}