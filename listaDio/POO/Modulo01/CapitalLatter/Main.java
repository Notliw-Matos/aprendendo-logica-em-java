package Modulo01.CapitalLatter;

import java.util.ArrayList;
import java.util.Scanner;

import Modulo01.NomesListas.People;

public class Main {
    public static void main(String[] args){
        ArrayList <Guys> Guyslist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        Guyslist.add(new Guys("Notliw", 21, 1.71));
        Guyslist.add(new Guys("Daniela", 21, 1.65));
        Guyslist.add(new Guys("Natlia", 15, 1.60));
        Guyslist.add(new Guys("Daniel", 27, 1.80));
        Guyslist.add(new Guys("Jefferson", 33, 1.54));
        Guyslist.add(new Guys("Maria", 23, 1.90));
        Guyslist.add(new Guys("Ana", 45, 1.64));
        Guyslist.add(new Guys("Jose", 2, 1.40));
        Guyslist.add(new Guys("Kenya", 24, 1.64));
        Guyslist.add(new Guys("Talita", 61, 1.67));
        Guyslist.add(new Guys("Robert", 67, 1.82));
        Guyslist.add(new Guys("Maicon", 79, 1.85));
        Guyslist.add(new Guys("Fernanda", 80, 1.20));
        Guyslist.add(new Guys("Notliw", 21, 1.71));

        for(Guys p : Guyslist){
            System.out.println(p);
        }

        System.out.println("\n\n total people in the list: " + Guyslist.size());

        Guyslist.remove(13);

        for(int i = 0; i < Guyslist.size(); i++){
            Guyslist.get(i).setName(Guyslist.get(i).getName().toUpperCase());
        }

        for(Guys p : Guyslist){
            System.out.println(p);
        }

    }   
}
