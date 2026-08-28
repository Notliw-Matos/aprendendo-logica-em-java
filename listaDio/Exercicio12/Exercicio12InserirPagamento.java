package listaDio.Exercicio12;
import java.util.Scanner;
public class Exercicio12InserirPagamento {
    public Exercicio12InserirPagamento(){

    }

    public double valorPago(double valorPago, Scanner sc){

        System.out.println("Digite o valor há pagar: ");
        valorPago = sc.nextDouble();

        return valorPago;
    }
}
