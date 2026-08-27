package listaDio;

public class Exercicio01Soma {

    public static void main(String[] args){

        int a = 11; 
        int b = 20;
        int c = 40;

        int resultadoAB = a + b;

        if(resultadoAB < c){
            System.out.println("A soma de A + B é " + resultadoAB + " e é menor que C.");
        }else if(resultadoAB > c){
            System.out.println("A soma de A + B é " + resultadoAB + " e é maior que C.");
        }else{
            System.out.println("A soma de A + B é " + resultadoAB + " e é igual há C.");
        }
    }

}
