package Modulo01.Veiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

        System.out.println("Construtor de Veiculos");
    }

    public double CalcularImposto(){
        double imposto = 500;
        return imposto;
    }

    @Override 
    public String toString(){
        return marca + " " + modelo + "(" + ano + ")";
    }
}
