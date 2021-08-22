package com.company;

public class Main {

    public static void main(String[] args) {
        Department department1 = new Department();
        department1.name = "Software Engineering";

        Department department2 = new Department();
        department2.name="Philosophy";


        Professor professor1 = new Professor();
        professor1.name = "Ahmet Arslan";

        Professor professor2 = new Professor();
        professor2.name = "Hakan Yıldız";

        Professor professor3 = new Professor();
        professor3.name="Didar demir";

        Course course1 = new Course();
        course1.name = "Int. to Software Engineering";

        Course course2= new Course();
        course2.name="Ethics";

        Course course3 = new Course();
        course3.name="Onthologhy";

        Student student1 = new Student();
        student1.name = "Akin Kaldiroglu";

        Student student2= new Student();
        student2.name="Onur Batın Gursoy";
        student2.department=department2;

        Student student3 = new Student();
        student3.name="Beril Su Oner";

        // Head of Software Engineering department is Ahmet Arslan and consequently his department is Software Engineering.
        department1.head = professor1;
        professor1.department = department1;

        department2.head = professor3;
        professor3.department=department2;


        // com.company.Department of Int. to Software Engineering course is Software Engineering and consequently the course
        // Int. to Software Engineering belongs to Software Engineering department.
        course1.department = department1;
        department1.courses = new Course[100];
        department1.courses[0] = course1;

        course1.teacher = professor1;
        professor1.coursesGiven = new Course[5];
        professor1.coursesGiven[0] = course1;

        professor1.advisee = new Student[10];
        professor1.advisee[0] = student1;
        student1.advisor = professor1;

        student1.coursesTaken = new Course[7];
        student1.coursesTaken[0] = course1;

        course1.students = new Student[100];
        course1.students[0] = student1;

        course2.department=department2;
        course3.department=department2;

        department2.courses=new Course[100];
        department2.courses[0]=course2;
        department2.courses[1]=course3;

        course2.teacher=professor3;
        course3.teacher=professor3;
        professor3.coursesGiven=new Course[3];
        professor3.coursesGiven[0]=course2;
        professor3.coursesGiven[1]=course3;

        professor3.advisee=new Student[20];
        professor3.advisee[0]= student2;
        professor3.advisee[0]= student3;
        student2.advisor=professor3;
        student3.advisor=professor3;

        student2.coursesTaken = new Course[5];
        student2.coursesTaken[0]=course2;
        student2.coursesTaken[1]=course3;

        student3.coursesTaken= new Course[3];
        student3.coursesTaken[0]=course3;



        System.out.println("Name of student "+student1.name+"'s first course is " + student1.coursesTaken[0].name);

        System.out.println("Name of student "+student1.name+"'s first course's professor is " + student1.coursesTaken[0].teacher.name);
        System.out.println("Name of student "+student1.name+"'s first course's professor's department is " + student1.coursesTaken[0].teacher.department.name);

        System.out.println();
        System.out.println("Name of student "+student2.name+"'s first course is " + student2.coursesTaken[0].name);
        System.out.println("Name of student "+student2.name+"'s second course is " + student2.coursesTaken[1].name);
        System.out.println("Name of student "+student2.name+"'s first course's professor is " + student2.coursesTaken[0].teacher.name);
        System.out.println("Name of student "+student2.name+"'s second course's professor is " + student2.coursesTaken[1].teacher.name);
        System.out.println("Name of student "+student2.name+"'s first course's professor's department is " + student2.coursesTaken[0].teacher.department.name);
        System.out.println("Name of student "+student2.name+"'s second course's professor's department is " + student2.coursesTaken[1].teacher.department.name);
        System.out.println();
        System.out.println("Name of student "+student3.name+"'s first course is " + student3.coursesTaken[0].name);
        System.out.println("Name of student "+student3.name+"'s first course's professor is " + student3.coursesTaken[0].teacher.name);
        System.out.println("Name of student "+student3.name+"'s first course's professor's department is " + student3.coursesTaken[0].teacher.department.name);
    }
}
