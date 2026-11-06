package Modulo01.NomesListas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList <People> peoplesList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        peoplesList.add(new People("Notliw", 21, 1.71));
        peoplesList.add(new People("Daniela", 21, 1.65));
        peoplesList.add(new People("Natlia", 15, 1.60));
        peoplesList.add(new People("Daniel", 27, 1.80));
        peoplesList.add(new People("Jefferson", 33, 1.54));
        peoplesList.add(new People("Maria", 23, 1.90));
        peoplesList.add(new People("Ana", 45, 1.64));
        peoplesList.add(new People("Jose", 2, 1.40));
        peoplesList.add(new People("Kenya", 24, 1.64));
        peoplesList.add(new People("Talita", 61, 1.67));
        peoplesList.add(new People("Robert", 67, 1.82));
        peoplesList.add(new People("Maicon", 79, 1.85));
        peoplesList.add(new People("Fernanda", 80, 1.20));
        peoplesList.add(new People("Notliw", 21, 1.71));

        for(People p : peoplesList){
            System.out.println(p);
        }

        System.out.println("\n\n total people in the list: " + peoplesList.size());
        System.out.println(peoplesList.get(0));
        System.out.println(peoplesList.get(13));

        peoplesList.remove(13);

        for(People p : peoplesList){
            System.out.println(p);
        }
        System.out.println("\n\n total people in the list now: " + peoplesList.size());
        System.out.println(peoplesList.get(0));
        System.out.println(peoplesList.get(12));

    }   
}
