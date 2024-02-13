package ca.sait.crs.services;

import java.util.ArrayList;

import ca.sait.crs.contracts.*;
import ca.sait.crs.exceptions.CannotCreateRegistrationException;

public class ProxyRegistrationService implements RegistrationService {

    private final RegistrationService realRegistrationService;

    public ProxyRegistrationService(RegistrationService realRegistrationService) {
        this.realRegistrationService = realRegistrationService;
    }

    @Override
    public Registration register(Student student, Course course) throws CannotCreateRegistrationException {
        // Verify if the student can be registered
        if (student.getGpa() >= 2.0) {
            // Pass the registration to the RealRegistrationService
            return realRegistrationService.register(student, course);
        } else {
            throw new CannotCreateRegistrationException("Students GPA does not meet the requirements to be registered");
        }
    }

    @Override
    public ArrayList<Registration> getRegistrations() {
        return realRegistrationService.getRegistrations();
    }
}