public class L3Q15 {
    public static void main(String[] args) {
        
        for (int i = 1; i <+10; i++){
            if (i % 2 != 0) {
                int fatorial = 1;

                for (int j = 1; j <= i; j++){
                    fatorial *= j;
                }

                System.out.println("o fatorial de " + i + " é igual a " + fatorial);
            }
        }
    }
}