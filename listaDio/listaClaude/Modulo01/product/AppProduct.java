package Modulo01.product;

import java.util.ArrayList;
import java.util.Scanner;


public class AppProduct{
    public static void main(String[] args){
        ArrayList<Produto> listaProduto = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in);


        int quantityMain = 0;
        int cont;
        double valueMax = 0;

        do{
            System.out.println("======================================");
            System.out.println("=======      APP PRODUCT       =======");
            System.out.println("======================================");
            System.out.println("\n\nWrite name of produtc: ");
            String name = sc.nextLine();

            System.out.println("Write price of produtc: ");
            double price = sc.nextDouble();


            System.out.println("Write quantity of produtct: ");
            quantityMain = sc.nextInt();

            listaProduto.add(new Produto(name,price,quantityMain));
            System.out.println("do you wish continue? (1 for continue or write -1 for exit): ");
            cont = sc.nextInt();
            sc.nextLine();

        }while(cont != -1);

        for(Produto lp : listaProduto){
            System.out.println("Name Product: " + lp.getName() + " | Price: " + lp.getPrice() + " | Quantity: " + lp.getQuantity());
            valueMax = valueMax + (lp.getPrice() * lp.getQuantity());
        }

        System.out.println("The value total of buy: " + valueMax);
        sc.close();
    }

}