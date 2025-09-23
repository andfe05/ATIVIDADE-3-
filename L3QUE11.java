public class L3QUE11 {
    public static void main(String[] args) {
        long total = 0;
        long graos = 1; 

        for (int i = 1; i <= 63; i++) { 
            System.out.println("Quadro " + i + ": " + graos + " grão(s)");
            total += graos;
            graos *= 2; 
        }

        System.out.println("\nTotal de grãos (até o 63º quadro): " + total);
    }
}


