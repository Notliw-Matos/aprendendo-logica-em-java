package listaDio;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome e sua idade:");
        String nome = sc.nextLine();
        int idade = sc.nextInt();

        if(idade <18)
            System.out.println(nome + "vocé é menor de idade.");
        else
            System.out.println(nome + "vocé é maior de idade.");

    }
}
