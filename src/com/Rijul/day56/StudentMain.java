package com.Rijul.day56;

class Student{
    String name;
    int rollNumber;
    int marks;
    static  int totalStudents = 0;
    int totalMarks = 0;
    Student(){
        System.out.println("This is the default constructor!");
    }
    Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        totalMarks = totalMarks + this.marks;
        totalStudents++;
    }
    public void display(){
        System.out.println("The name is: " + name);
        System.out.println("RollNo. is: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
    public char calculateGrade(){
        if(totalMarks >= 90){
            return 'A';
        }
        else if(totalMarks < 90 && totalMarks >=75){
            return 'B';
        }
        else{
            return 'F';
        }
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("Tanvi",721,100);
        System.out.println(s.calculateGrade());
        s.display();
        Student s2 = new Student("Rijul",688,90);
        System.out.println(s2.calculateGrade());
        s2.display();
        Student s3 = new Student("Sidhu",713,7);
        System.out.println(s3.calculateGrade());
        s3.display();
        Student s4 = new Student("Pulkit",663,60);
        System.out.println(s4.calculateGrade());
        s4.display();
        System.out.println("Total Number of students : " + Student.totalStudents);

    }
}
