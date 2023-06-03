package org.example;

import org.example.model.entities.Department;
import org.example.model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department objDepartment = new Department(1, "books");

        Seller objSeller = new Seller(20, "Bob", "bob@gmail.com", new Date(), 3000.0, objDepartment);


        System.out.println(objSeller);
    }
}