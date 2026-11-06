package listaDio;
import java.util.Scanner;


public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 valores, um abaixo do outro:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            if(num2 > num3)
                System.out.printf("%d, %d, %d",num1, num2, num3);
            else
                System.out.printf("%d, %d, %d",num1, num3, num2);
        }else if(num2 > num1 && num2 > num3){
            if(num1 > num3)
                System.out.printf("%d, %d, %d",num2, num1, num3);
            else
                System.out.printf("%d, %d, %d",num2, num3, num1);
        }
        else{
            if(num2 > num1)
                System.out.printf("%d, %d, %d",num3, num2, num1);
            else
                System.out.printf("%d, %d, %d",num3, num1, num3); 
        }
            
    }
}

// Necessario melhorias futuras
