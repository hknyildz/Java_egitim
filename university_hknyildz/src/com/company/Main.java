package com.company;

public class Main {

    public static void main(String[] args) {
        Department department1 = new Department("Software Engineering");
        Department department2 = new Department("Philosophy");


        Professor professor1 = new Professor("Ahmet Arslan",department1);
        Professor professor2 = new Professor("Hakan Yıldız",department1);
        Professor professor3 = new Professor("Didar Demir",department2);

        Department department3 = new Department("Civil Engineering", professor1);


        Course course1 = new Course("Int. to Software Engineering",department1,professor1);
        Course course2= new Course("Ethics",department2,professor3);
        Course course3 = new Course("Onthologhy",department2,professor3);


        Student student1 = new Student("Akin Kaldiroglu", department1);
        Student student2= new Student("Onur Batın Gursoy",department2);
        Student student3 = new Student("Beril Su Oner",department2);

        // Head of Software Engineering department is Ahmet Arslan and consequently his department is Software Engineering.
        department1.setHead(professor2);
        department2.setHead(professor3);



        department1.courses = new Course[100];
        department1.courses[0] = course1;


        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;

        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;
        student1.setAdvisor(professor1);

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;

        course1.students = new Student[100];
        course1.students[0] = student1;




        department2.courses=new Course[100];
        department2.courses[0]=course2;
        department2.courses[1]=course3;



        professor3.coursesGiven=new Course[3];
        professor3.coursesGiven[0]=course2;
        professor3.coursesGiven[1]=course3;

        professor3.advisee=new Student[20];
        professor3.advisee[0]= student2;
        professor3.advisee[0]= student3;
        student2.setAdvisor(professor3);
        student3.setAdvisor(professor3);

        student2.coursesTaken = new Course[5];
        student2.coursesTaken[0]=course2;
        student2.coursesTaken[1]=course3;

        student3.coursesTaken= new Course[3];
        student3.coursesTaken[0]=course3;


        System.out.println(" ");
        System.out.println("Name of student "+student1.getName()+"'s first course is " + student1.coursesTaken[0].getName());
        System.out.println("Name of student "+student1.getName()+"'s first course's professor is " + student1.coursesTaken[0].getTeacher().getName());
        System.out.println("Name of student "+student1.getName()+"'s first course's professor's department is " + student1.coursesTaken[0].getTeacher().getDepartment().getName());
        System.out.println(" ");
        System.out.println("Name of student "+student2.getName()+"'s first course is " + student2.coursesTaken[0].getName());
        System.out.println("Name of student "+student2.getName()+"'s second course is " + student2.coursesTaken[1].getName());
        System.out.println("Name of student "+student2.getName()+"'s first course's professor is " + student2.coursesTaken[0].getTeacher().getName());
        System.out.println("Name of student "+student2.getName()+"'s second course's professor is " + student2.coursesTaken[1].getTeacher().getName());
        System.out.println("Name of student "+student2.getName()+"'s first course's professor's department is " + student2.coursesTaken[0].getTeacher().getDepartment().getName());
        System.out.println("Name of student "+student2.getName()+"'s second course's professor's department is " + student2.coursesTaken[1].getTeacher().getDepartment().getName());
        System.out.println();
        System.out.println("Name of student "+student3.getName()+"'s first course is " + student3.coursesTaken[0].getName());
        System.out.println("Name of student "+student3.getName()+"'s first course's professor is " + student3.coursesTaken[0].getTeacher().getName());
        System.out.println("Name of student "+student3.getName()+"'s first course's professor's department is " + student3.coursesTaken[0].getTeacher().getDepartment().getName());
    }
}
