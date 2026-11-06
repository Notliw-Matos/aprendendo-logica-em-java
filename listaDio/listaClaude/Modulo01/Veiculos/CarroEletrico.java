package Modulo01.Veiculos;

public class CarroEletrico extends Carro{
    private double autonomiaKm;

    public CarroEletrico(String marca, String modelo, int ano, int numeroPortas, double autonomiaKm){
        super(marca,modelo,ano,numeroPortas);
        this.autonomiaKm = autonomiaKm;
        System.out.println("Construtor de Carro Eletrico");
    }

    @Override 
    public double CalcularImposto(){
        return super.CalcularImposto() * 0.5;
    }

    @Override 
    public String toString(){
        return super.toString() + "- Autonomia: " + autonomiaKm;
    }

    
}
