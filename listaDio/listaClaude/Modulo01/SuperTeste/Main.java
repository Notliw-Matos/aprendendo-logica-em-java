package Modulo01.SuperTeste;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        listaFuncionarios.add(new Gerente("Daniela Q. Mundim", "702.245.181-81",10000.00,200.00));
        listaFuncionarios.add(new Vendedor("Notliw Camilo F. de Matos", "710.624.530-81",5000.00,100,500));

        // for (Funcionario f : listaFuncionarios){
        //     System.out.println(f);
        // }
        listaFuncionarios.get(0).exibirDados();
        listaFuncionarios.get(1).exibirDados();


    }
    
}
