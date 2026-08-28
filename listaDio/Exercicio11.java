package listaDio;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercicio11 exer = new Exercicio11();

        int tamanhoVet = 4;
        double[] notas = new double[tamanhoVet];

        System.out.printf("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        exer.notas(sc, notas);
        double result = exer.calculaNotas(notas);
        exer.exibeNotaNome(notas, result, nome);
    }

    public void notas(Scanner sc,double notas[]){
        for(int i = 0; i < notas.length;i++){
            System.out.printf("Digite a %d° nota: ", i+1);
            notas[i] = sc.nextDouble(); 
        }
    }

    public double calculaNotas(double notas[]){
        double resul = 0;
        for(int i = 0; i < notas.length;i++){
            resul +=  notas[i];
        }
        resul = resul / 4;
        return resul;
    }

    public void exibeNotaNome(double notas[], double result, String nome){
        System.out.println("Notas: ");
        for(int i = 0; i < notas.length;i++){
            System.out.printf("%d°- %.1f\n", i+1, notas[i]);
        }
        System.out.printf("Media\n %.1f",result);

        if(result >= 7.0)
            System.out.printf("\nO aluno %s foi aprovado.", nome);
        else
            System.out.printf("\nO aluno %s foi reprovado.", nome);
    }
}
