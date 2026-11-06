package Modulo01.SuperTeste;

public class Gerente extends Funcionario{
    private double bonus = 2000;

    public Gerente(String nome, String cpf, double salario, double bonus){
        super(nome,cpf,salario);
        this.bonus = bonus;
    }

    @Override 
    public double calcularSalario(){
       double salarioGerente = bonus + super.calcularSalario();
       return salarioGerente;
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Bonus do Gerente: " + bonus);
    }
}
