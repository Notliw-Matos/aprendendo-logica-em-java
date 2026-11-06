package listaDio;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Exercicio10 exer = new Exercicio10();
        int numNotas = 3;
        double[] notas = new double[numNotas];

        exer.enviarNotas(notas,numNotas);
        exer.exibirNotas(notas,numNotas);
    }
    
    public void enviarNotas(double notas[],int numNotas){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< notas.length; i++){
            System.out.printf("Digite a %d° nota: ", i+1);
            notas[i] = sc.nextDouble();
        }
    }
    
    public void exibirNotas(double notas[],int numNotas){
        for(int i = 0; i< notas.length; i++){
            System.out.printf("Nota %d° %.2f \n",i+1,notas[i]);
        }
    }
}