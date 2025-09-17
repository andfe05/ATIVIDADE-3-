public class L3Q16 {
    public static void main(String[] args) {
        int soma = 0;
        int quantidade = 0;

        for (int i = 50; i <= 70;i++){
            if(i % 2 == 0){
                soma += i;
                quantidade++;

            }
        }

        double media = (double) soma/quantidade;

        System.out.println("SOMA:" + soma);
        System.out.println("MEDIA: "+ media);

    }
}
