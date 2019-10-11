package com.sagar.test.web;

import com.sagar.test.dao.StudentDAO;

public class Hello {
    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();
        studentDAO.setName("Sagar");
        System.out.println(studentDAO);
    }
}
