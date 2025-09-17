import java.util.Scanner;
public class L3Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double areaTotal = 0.0;
        String continuar;

        do { 
            System.out.println("DIGITE O NOME DO COMODO:");
            String nome = input.next();

            System.out.println("DIGITE A LARGURA: ");
            double largura = input.nextDouble();

            System.out.println("DIGITE O COMPRIMENTO: ");
            double comprimento = input.nextDouble();

            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.println("A AREA DO COMODO " + nome + "É" + areaComodo + "metros quadrados");

            System.out.println("QUER CALCULAR MAIS COMODOS? (SIM OU NAO)");
            continuar = input.next();

        } while (continuar.equalsIgnoreCase("SIM"));
        System.out.println("AREA TOTAL DA RESIDENCIA FICOU EM " + areaTotal + "metros quadrados");

    }
}
