package listaDio;
import java.util.Scanner;
public class Exercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ano de nascimento: ");
        int ano = sc.nextInt();

        int anosVividos = 2026 - ano;
        int mesesVividos = anosVividos * 12;
        int diasVividos = anosVividos * 365;

        System.out.println("Anos vividos: " + anosVividos);
        System.out.println("Meses vividos: " + mesesVividos);
        System.out.println("Dias vividos: " + diasVividos);

        
    }
    
}
