package ca.sait.crs.models;

/**
 * Represents a student.
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public final class Student implements ca.sait.crs.contracts.Student {
    /**
     * Name of student
     */
    private final String name;

    /**
     * Students GPA (between 0.00 and 4.00)
     */
    private final double gpa;

    /**
     * Initializes instance.
     * @param name Name of student
     * @param gpa Student's GPA
     * @throws IllegalArgumentException if the GPA is less than 0.00 or greater than 4.00
     */
    public Student(String name, double gpa) {
        if (gpa < 0.00 || gpa > 4.00) {
            throw new IllegalArgumentException("GPA must be between 0.00 and 4.00");
        }
        this.name = name;
        this.gpa = gpa;
    }

    /**
     * Gets student's name
     * @return Name of student
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets students GPA
     * @return GPA
     */
    @Override
    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}