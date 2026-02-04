package com.regexandjunit.junit.userregistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    private UserRegistration registration;

    @BeforeEach
    void setUp() {
        registration = new UserRegistration();
    }

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> {
            registration.registerUser("john_doe", "john@example.com", "StrongPass1");
        });
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "john@example.com", "StrongPass1");
        });
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john", "johnexample.com", "StrongPass1");
        });
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john", "john@example.com", "short");
        });
    }
}
