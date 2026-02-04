package com.regexandjunit.junit.passwordstrengthvalidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    private PasswordValidator validator;

    @BeforeEach
    void setUp() {
        validator = new PasswordValidator();
    }

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("StrongP4ss"));
    }

    @Test
    void testPasswordTooShort() {
        assertFalse(validator.isValid("Ab3"));
    }

    @Test
    void testPasswordWithoutUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testPasswordWithoutDigit() {
        assertFalse(validator.isValid("Password"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}
