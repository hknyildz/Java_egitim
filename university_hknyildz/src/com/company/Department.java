package com.company;

public class Department {
     private String name;
     private Professor head;
     Course[] courses;
     Student[] students;

    public Department(String name,Professor professor){
        this.name=name;
        this.head=professor;
    }

    public Department(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getHead() {
        return head;
    }

    public void setHead(Professor professor) {
        this.head = professor;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
