import java.util.Scanner;

public class L3QUE12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long somaFatoriais = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o " + i + "º valor inteiro: ");
            int valor = sc.nextInt();

            long fatorial = 1;
            for (int j = 1; j <= valor; j++) {
                fatorial *= j;
            }

            somaFatoriais += fatorial;
        }

        System.out.println("\nSomatório dos fatoriais: " + somaFatoriais);
        sc.close();
    }
}
