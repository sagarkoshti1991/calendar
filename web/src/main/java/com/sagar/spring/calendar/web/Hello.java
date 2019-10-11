package com.sagar.spring.calendar.web;

import com.sagar.spring.calendar.dao.StudentDAO;

public class Hello {
    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();
        studentDAO.setName("Sagar");
        System.out.println(studentDAO);
    }
}
