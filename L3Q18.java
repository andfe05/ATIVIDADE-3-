import java.util.Scanner;
public class L3Q18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE UM VALOR:");

        int valor = input.nextInt();
        int maior = valor;
        int menor = valor;

        while (true) {
            valor = input.nextInt();

            if (valor < 0){
                break;
            }
            if (valor > maior){
                maior = valor;
            }
            if (valor < menor){
                menor = valor;
            }
        }
        System.out.println("MAIOR: " + maior);
        System.out.println("MENOR: " + menor);

        input.close();

        }
    }
    
