package listaDio.Exercicio12;
import java.util.Scanner;

public class Exercicio12TelaPagamento {    
    // contrutor
    public Exercicio12TelaPagamento(){
    }

    public int telaPagamento(int opcao, Scanner sc){
        System.out.println("Selecione uma das formas de pagamento abaixo:");
        System.out.println("1- À Vista em Dinheiro ou Pix, recebe 15% de desconto ");
        System.out.println("2- À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3- Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4- Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        opcao = sc.nextInt();
        return opcao;
    }   


    public void resultadoPagamento(double valorTotal, double valorDesconto, int opcaoPagamento){
        switch (opcaoPagamento) {
            case 1:
                System.out.println("Opção de pagamento escolhida:");
                System.out.println("À Vista em Dinheiro ou Pix, com 15% de desconto");

                break;
            case 2:
                System.out.println("Opção de pagamento escolhida:");
                System.out.println("À Vista no cartão de crédito, com 10% de desconto");
                break;
            case 3:
                System.out.println("Opção de pagamento escolhida:");
                System.out.println("Parcelado no cartão em duas vezes, preço normal do produto sem juros");
                break;
            case 4:
                System.out.println("Opção de pagamento escolhida:");
                System.out.println("Parcelado no cartão em três vezes ou mais, com juros de 10%");
                break;
        }

        System.out.println("Valor total: " + valorTotal);
        System.out.println("Valor pago: "+ valorDesconto);
    }
}
