package Modulo01.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> listStudent = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String name;
        double grade;
        double geralMedia = 0;

        for(int i = 0; i < 3; i++){
            System.out.println("== Write grade of students ==");
            System.out.println("== Student  " + i);
            System.out.println("Student name: ");
            name = sc.nextLine();

            System.out.println("Student grade: ");
            grade = sc.nextDouble();
            sc.nextLine();
            
            System.out.println("Student "+ i + " finished.");

            listStudent.add(new Student(name, grade));
            geralMedia = (geralMedia + listStudent.get(i).getGrade());
        }

        System.out.println("\n\n..........................................................");
        System.out.println("Media: " + geralMedia / 3);

        listStudent.sort(Comparator.comparingDouble(Student::getGrade).reversed());
        for(Student s : listStudent){
            System.out.println(s);
        }
        sc.close();
    }   
}