package Modulo01.Aluno;

import java.sql.Struct;

public class Student implements Comparable<Student>{
    private double grade;
    private String name;

    public Student(){
    }

    public Student(String name, double grade){
        this.name = name;
        this.grade = grade;

        System.out.println("Student registered.");
    }

    public String getName(){
        return name;
    }
    public double getGrade(){
        return grade;
    }

    @Override 
    public int compareTo(Student other) {
        return Double.compare(this.grade, other.grade);
    }
    @Override 
    public String toString(){
        return name + " | " + grade;
    }

}
