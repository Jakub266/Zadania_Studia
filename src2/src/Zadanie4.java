import java.util.Scanner;

public class Zadanie4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę do wypisania liczb nieparzystych: ");
        int a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę do wypisania liczb nieparzystych: ");
        int b = scanner.nextInt();

        wypiszNieparzyste(a,b);

        scanner.close();
    }
    public static void wypiszNieparzyste(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
}