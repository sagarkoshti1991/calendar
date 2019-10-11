package com.sagar.test.dao;

public class StudentDAO {
    private String name;
    private DepartmentDAO department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentDAO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDAO department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "StudentDAO{" +
                "name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
