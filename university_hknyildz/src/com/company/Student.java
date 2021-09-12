package com.company;

import com.company.Course;
import com.company.Department;
import com.company.Professor;

public class Student {
    private String no;
    private String name;
    private String dob;
    private Department department;
    private Professor advisor;
    Course[] coursesTaken;

    public Student(String name,Department department,Professor advisor){
        this.name=name;
        this.department=department;
        this.advisor=advisor;
    }

    public Student(String name,Department department){
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Professor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Professor advisor) {
        this.advisor = advisor;
    }
}
