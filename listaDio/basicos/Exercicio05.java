package listaDio;
import java.nio.file.SecureDirectoryStream;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioMinimo = 1293.20;
        int count = 1;

        System.out.println("Digite seu salario: ");
        double salarioUser = sc.nextDouble();

        if(salarioMinimo > salarioUser){
            System.out.println("Voce ganha menos que um salario minimo.");
        }else{
            while(salarioMinimo < salarioUser){
                salarioMinimo += 1293.20;
                count++;
            }
            System.out.println("Você ganha " + count + " salarios minimos");
        }
    }
}

// esse codigo pode ser melhorado, pois podemos adicionar um numero flutuante para contar quantos salarios minimos o user ganha, como por exemplo 5000 = 3.8 salarios minimos.
