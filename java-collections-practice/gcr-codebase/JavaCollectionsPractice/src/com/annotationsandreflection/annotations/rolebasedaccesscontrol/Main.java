package com.annotationsandreflection.annotations.rolebasedaccesscontrol;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();

        SecurityContext.setRole("USER");  

        Method method = AdminService.class.getMethod("deleteUser");

        if (method.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            String requiredRole = roleAllowed.value();
            String currentRole = SecurityContext.getRole();

            if (requiredRole.equals(currentRole)) {
                method.invoke(service);
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}
