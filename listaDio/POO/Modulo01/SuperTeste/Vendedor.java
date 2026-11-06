package Modulo01.SuperTeste;

public class Vendedor extends Funcionario{
    private int totalVendas;
    private double totalComissao;

    public Vendedor(String nome, String cpf, double salario, int totalVendas, double totalComissao){
        super(nome, cpf, salario);
        this.totalVendas = totalVendas;
        this.totalComissao = totalComissao;
    }
    
    @Override
    public double calcularSalario() {

        return super.calcularSalario() + (totalComissao * totalVendas) / 100;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }
}
