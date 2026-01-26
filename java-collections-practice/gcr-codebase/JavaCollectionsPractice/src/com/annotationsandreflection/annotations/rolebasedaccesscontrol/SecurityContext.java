package com.annotationsandreflection.annotations.rolebasedaccesscontrol;

class SecurityContext {
    private static String currentUserRole;

    public static void setRole(String role) {
        currentUserRole = role;
    }

    public static String getRole() {
        return currentUserRole;
    }
}
