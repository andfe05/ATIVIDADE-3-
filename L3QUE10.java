public class L3QUE10 {
     public static void main(String[] args) {
    
        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.println(celsius + " °C   =   " + fahrenheit + " °F");
        }
    }
}
