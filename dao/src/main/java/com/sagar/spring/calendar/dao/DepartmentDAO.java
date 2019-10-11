package com.sagar.spring.calendar.dao;

import java.util.List;

public class DepartmentDAO {
    private String name;
    private List<StudentDAO> students;
    private List<String> subjects;

    public DepartmentDAO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentDAO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDAO> students) {
        this.students = students;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "DepartmentDAO{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", subjects=" + subjects +
                '}';
    }
}
