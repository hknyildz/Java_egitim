package com.company;

import com.company.Course;
import com.company.Department;

public class Professor {
    private String no;
    private String name;
    private String dob;
    private String rank;
    private Department department;
    Student[] advisee;
    Course[] coursesGiven;

    public Professor(String name, Department department){
        this.name=name;
        this.department=department;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
