package ca.sait.crs.services;

import ca.sait.crs.contracts.Course;
import ca.sait.crs.contracts.Registration;
import ca.sait.crs.contracts.RegistrationService;
import ca.sait.crs.exceptions.CannotCreateRegistrationException;
import ca.sait.crs.models.Student;

import java.util.ArrayList;
import java.util.Objects;

// TODO: Define the ProxyRegistrationService
// TODO: Implement the RegistrationService interface
// TODO: Check student can be registered before passing to RealRegistrationService
// TODO: Make this class immutable.
public class ProxyRegistrationService implements RegistrationService {

    private final RegistrationService realRegistrationService;

    public ProxyRegistrationService(RegistrationService realRegistrationService) {
        this.realRegistrationService = Objects.requireNonNull(realRegistrationService, "RealRegistrationService cannot be null.");
    }

    @Override
    public void registerStudent(Student student) {
        if (canRegisterStudent(student)) {
            realRegistrationService.registerStudent(student);
        } else {
            System.out.println("Student cannot be registered.");
        }1
    }

    private boolean canRegisterStudent(Student student) {
        // Add logic to check if student can be registered
        return true; // For now, allow all students to be registered
    }

    @Override
    public Registration register(ca.sait.crs.contracts.Student student, Course course)
            throws CannotCreateRegistrationException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'register'");
    }

    @Override
    public ArrayList<Registration> getRegistrations() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRegistrations'");
    }
}
