package com.company;

import java.util.Date;

public class Course {
    private String code;
    private String name;
    private Department department;
    private Professor teacher;
    Student[] students;
    private String[] days;
    private Date time;

    public Course(String name, Department department){
        this.name=name;
        this.department=department;

        System.out.println("new course initialized! \nCourse name: "+name+"\nCourse Department: "+department.getName()+"\n ");
        System.out.println(" ");
    }

    public Course(String name,Department department,Professor teacher){
        this.name=name;
        this.department=department;
        this.teacher=teacher;


        System.out.println("new course initialized! \nCourse name: "+name+"\nCourse Department: "+department.getName()+"\nCourse Teacher: "+teacher.getName());
        System.out.println(" ");
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Professor getTeacher() {
        return teacher;
    }

    public void setTeacher(Professor teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String[] getDays() {
        return days;
    }

    public void setDays(String[] days) {
        this.days = days;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }



}
