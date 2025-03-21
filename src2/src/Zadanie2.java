import java.util.Scanner;

public class Zadanie2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę do obliczenia silni: ");
        int n = scanner.nextInt();

        System.out.println("Silnia (iteracyjnie) z " + n + " wynosi: " + silniaIteracyjnie(n));
        System.out.println("Silnia (rekurencyjnie) z " + n + " wynosi: " + silniaRekurencyjnie(n));

        scanner.close();
    }
    public static long silniaIteracyjnie(int n) {
        long wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }
        public static long silniaRekurencyjnie(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * silniaRekurencyjnie(n - 1);
        }

    }