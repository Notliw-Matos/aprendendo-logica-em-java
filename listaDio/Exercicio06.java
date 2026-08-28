package listaDio;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = sc.nextDouble();

        double resultado = num * 0.05;
        resultado = num + resultado;

        System.out.println("Valor ajustado com 5%.: " + resultado);
    }
}
