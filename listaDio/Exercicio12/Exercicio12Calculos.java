package listaDio.Exercicio12;

public class Exercicio12Calculos {

    public Exercicio12Calculos(){
    }

    public double valorPago(double valor, int opcao){
        double desconto;

        switch (opcao) {
            case 1:
                desconto = valor * 0.15;
                valor = valor - desconto;
                break;
            case 2:
                desconto = valor * 0.1;
                valor  = valor - desconto;
                break;
            case 3:
                break;
            case 4:
                desconto = valor * 0.1;
                valor = valor + desconto;
                break;
        }
        return valor;
    }

}
