package com.developia.bookstore.service.impl;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String usernameDto = sc.nextLine();
        System.out.println("Enter password: ");
        String passwordDto = sc.nextLine();
        boolean result = login(usernameDto, passwordDto);
        System.out.println("Result: " + result);

    }

    static boolean login(String usernameDto, String passwordDto) {
        String username = "nicat";
        String password = "12345";
        return username.equals(usernameDto) && password.equals(passwordDto);
    }
}
