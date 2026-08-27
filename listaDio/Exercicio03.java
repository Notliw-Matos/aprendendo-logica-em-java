package listaDio;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Digite o primeiro numero: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = sc.nextInt();

        if(a == b){
            c = a + b;
        }
        else{
            c = a * b;
        }
        System.out.println("Resultado: " + c);
    }
    
}
