package listaDio.Exercicio12;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        double valorPago;
        double valorDesconto;

        Exercicio12TelaPagamento exer = new Exercicio12TelaPagamento();
        Exercicio12InserirPagamento exerc = new Exercicio12InserirPagamento();
        Exercicio12Calculos exerci = new Exercicio12Calculos();
        opcao = exer.telaPagamento(0, sc);
        valorPago = exerc.valorPago(0,sc);
        valorDesconto = exerci.valorPago(valorPago,opcao);
        exer.resultadoPagamento(valorPago,valorDesconto,opcao);
    }
}
