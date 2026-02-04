package com.designpattern.librarymanagementsystem.factory;

import java.util.Scanner;


public class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter role: ");
        String role = sc.nextLine();

        User user = UserFactory.getUser(role);
        user.showPrivileges();
        sc.close();
    }
}
