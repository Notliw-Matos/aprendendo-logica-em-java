package listaDio;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite dois valores: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("Valor de A %d\nValor de B %d\n",a,b);
        c = a;
        a = b;
        b = c;

        System.out.printf("Valor apos troca de A %d\nValor apos troca de B %d\n",a,b);

    }
}
