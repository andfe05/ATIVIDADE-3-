import java.util.Scanner;
public class L3QUE13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º valor real: ");
            double valor = sc.nextDouble();
            soma += valor;
        }

        double media = soma / 10;

        System.out.println("\nSomatório dos valores: " + soma);
        System.out.println("Média dos valores: " + media);
        sc.close();
    }
}
