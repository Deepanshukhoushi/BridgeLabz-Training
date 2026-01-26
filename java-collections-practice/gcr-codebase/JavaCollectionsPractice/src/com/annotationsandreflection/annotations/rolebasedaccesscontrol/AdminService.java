package com.annotationsandreflection.annotations.rolebasedaccesscontrol;

class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully!");
    }

    public void viewUser() {
        System.out.println("Viewing user details");
    }
}
