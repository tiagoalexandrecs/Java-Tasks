import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String sequence="0 1 1";
        if ( number == 1) {
            System.out.println(0);
        } else if (number == 2) {
            System.out.println("0 1");
        } else if (number == 3) {
            System.out.println("0 1 1");
        } else {
            int previous1 = 1;
            int previous2 = 1;
            int next;
            for (int i=3; i < number; i++) {
                next = previous1 + previous2;
                sequence= sequence + " " + next;
                previous1= previous2;
                previous2= next;
            }
            System.out.println(sequence);
        }
    }
}
