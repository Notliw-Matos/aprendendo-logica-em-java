package Modulo01.SuperTeste;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome + " | CPF: " + cpf + " | Salario: " + calcularSalario());
    }

    public double calcularSalario() {
        return salario;
    }
}
