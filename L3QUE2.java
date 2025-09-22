import java.util.Scanner;

public class L3QUE2 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("digite o número da tabuada: ");
        int numero = input.nextInt();

        for (int i = 0; i <= 10; i++) {  
            int tabuada = numero * i;
            System.out.println(tabuada);
        }

        input.close();
    }
}
