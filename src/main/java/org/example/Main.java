package org.example;

import org.example.model.entities.Department;

public class Main {
    public static void main(String[] args) {
        Department objDepartment = new Department(1, "books");

        System.out.println(objDepartment);
    }
}