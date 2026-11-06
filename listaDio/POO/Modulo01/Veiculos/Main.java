package Modulo01.Veiculos;

import java.util.ArrayList;

public class Main {

   public static void main(String[] args){
        ArrayList<Veiculo> listaVeiculo = new ArrayList<>();

        listaVeiculo.add(new Veiculo("Bacanudo", "Blazer Bacanal", 2040));
        listaVeiculo.add(new Carro("Volvo", "X40", 2024, 4));
        listaVeiculo.add(new CarroEletrico("BYD", "Seal", 2026, 4, 500));

        // for(Veiculo f : listaVeiculo){
        //     f.get().
        // }

        System.out.println( listaVeiculo.get(0).toString());
        System.out.println( listaVeiculo.get(0).CalcularImposto());

        System.out.println(listaVeiculo.get(1).toString());
        System.out.println( listaVeiculo.get(1).CalcularImposto());

        System.out.println( listaVeiculo.get(2).toString());
        System.out.println( listaVeiculo.get(2).CalcularImposto());


    }
}
