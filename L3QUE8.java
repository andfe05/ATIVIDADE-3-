import java.util.Scanner;

public class L3QUE8 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base : ");
        int base = input.nextInt();

        System.out.print("Digite o expoente : ");
        int expoente = input.nextInt();

        int resultado = 1; 
        for (int i = 1; i <= expoente; i++) {
            resultado = resultado*base;
        }

        System.out.println(resultado);

        input.close();
    }
}
