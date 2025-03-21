import java.util.Random;
import java.util.Scanner;

public class Zadanie3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pozycję w ciągu Fibonacciego: ");
        int fibPos = scanner.nextInt();
        System.out.println("Fibonacci (dla pozycji " + fibPos + ") wynosi: " + fibonacci(fibPos));

        System.out.println("Fibonacci dla losowej pozycji: " + fibonacciLosowy());

        scanner.close();
    }
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciLosowy() {
        Random random = new Random();
        int losowaPozycja = random.nextInt(10) + 1;
        System.out.println("Losowa pozycja: " + losowaPozycja);
        return fibonacci(losowaPozycja);
    }
}