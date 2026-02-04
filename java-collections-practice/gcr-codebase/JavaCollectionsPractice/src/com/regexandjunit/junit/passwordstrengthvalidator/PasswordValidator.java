package com.regexandjunit.junit.passwordstrengthvalidator;

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return password.length() >= 8 && hasUppercase && hasDigit;
    }
}
