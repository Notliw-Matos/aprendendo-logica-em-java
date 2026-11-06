package listaDio;
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();
        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();

        double resultado = peso / Math.pow(altura,2);

        System.out.println("Resultado do calculo de IMC: " + resultado);

        if(resultado <=18.5){
            System.out.println("Abaixo do peso.");
        }else if(resultado >= 18.6 && resultado <=24.9){
            System.out.println("Peso ideal (parabéns).");
        }else if(resultado >=25.0 && resultado <= 29.9){
            System.out.println("Levemente acima do peso.");
        }else if(resultado >= 30 && resultado <= 34.9){
            System.out.println("Obesidade grau I.");
        }else if(resultado >= 35 && resultado <= 39.9){
            System.out.println("AObesidade grau II (severa).");
        }else if(resultado >= 40){
            System.out.println("Obesidade grau III (mórbida).");
        }
    }
}
