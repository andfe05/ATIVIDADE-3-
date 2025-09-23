import java.util.Scanner;

public class L3QUE14 {
    
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double soma = 0;

        System.out.println("Digite valores positivos (um número negativo encerra):");

        while (true) {
            double valor = sc.nextDouble();

            if (valor < 0) {
                break; // encerra o loop
            }

            soma += valor;
            contador++;
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("\nTotal de valores lidos: " + contador);
            System.out.println("Somatório: " + soma);
            System.out.println("Média: " + media);
        } else {
            System.out.println("\nNenhum valor positivo foi lido.");
        }

        sc.close();
    }
}}
