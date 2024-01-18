import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 0) {
            if(number %2 == 0) {
                String frase = number + " é par e positivo";
                System.out.println(frase);
            } else {
                String frase = number + " é impar e positivo";
                 System.out.println(frase);
            }
        } else if (number < 0) {
             if(number %2 == 0) {
                String frase = number + " é par e negativo";
                System.out.println(frase);
            } else {
                String frase = number + " é impar e negativo";
                 System.out.println(frase);
            }
        }
    }
}
