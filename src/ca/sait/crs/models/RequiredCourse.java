package ca.sait.crs.models;

import ca.sait.crs.contracts.Course;

/**
 * Represents a required (for credit) course.
 * @author Nick Hamnett <nick.hamnett@sait.ca>
 * @since June 1, 2023
 */
public final class RequiredCourse implements Course {
    /**
     * Course code
     */
    private final String code;

    /**
     * Course name
     */
    private final String name;

    /**
     * Course credits
     */
    private final int credits;

    /**
     * Initializes instance
     * @param code Course code
     * @param name Course name
     * @param credits Course credits (cannot be zero or negative)
     */
    public RequiredCourse(String code, String name, int credits) {
        if (credits <= 0) {
            throw new IllegalArgumentException("Credits must be greater than zero");
        }
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    /**
     * Gets course code
     * @return Course code
     */
    @Override
    public String getCode() {
        return code;
    }

    /**
     * Gets course name
     * @return Course name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets course credits
     * @return Credits
     */
    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.getName(), this.getCode());
    }
}