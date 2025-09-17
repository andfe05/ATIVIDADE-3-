import java.util.Scanner;
public class L3Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE O DIVIDENDO: ");
        int dividendo = input.nextInt();

        System.out.println("DIGITE O DIVISOR MEU PATRAO: ");
        int divisor = input.nextInt();

        int quociente = 0;

        while (dividendo >= divisor){
            dividendo -= divisor;
            quociente++;

        }

        System.out.println("QUOCIENTE É : " + quociente);

        input.close();
    }
    
}
