package listaDio;
import java.util.Scanner;

public class Exercico04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        System.out.printf("Antecessor: %d, numero int: %d, sucessor: %d ", num -1 ,num, num+1);
    }
}
