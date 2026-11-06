package Modulo01.Veiculos;

public class Carro extends Veiculo {
    private int numeroPortas;
    
    public Carro(String marca, String modelo, int ano, int numeroPortas){
        super(marca,modelo,ano);
        this.numeroPortas = numeroPortas;
        System.out.println("Construtor de Carro");
    }

    @Override 
    public double CalcularImposto(){
        return super.CalcularImposto() + 300;
    }

    @Override 
    public String toString(){
        return super.toString() + 4 + " portas";
    }

}
