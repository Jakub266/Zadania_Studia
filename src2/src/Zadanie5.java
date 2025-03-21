import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double n1 = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double n2 = scanner.nextDouble();

        System.out.print("Podaj operację (+, -, *, /): ");
        char operacja = scanner.next().charAt(0);

        double wynik = kalkulator(n1, n2, operacja);
        System.out.println("Wynik: " + wynik);

        scanner.close();
    }

    public static double kalkulator(double n1, double n2, char operacja) {
        switch (operacja) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                if (n2 != 0) {
                    return n1 / n2;
                } else {
                    System.out.println("Błąd: Dzielenie przez zero");
                }
            default:
                System.out.println("Błąd: Nieznana operacja");
                return Double.NaN;
        }
    }
}
