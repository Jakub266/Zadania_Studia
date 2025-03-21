//W Javie switch działa na:
//•	Typach całkowitych (byte, short, int, char i ich klasy opakowujące)
//•	Typie String (od Java 7)
//•	Typie enum (od Java 5)
//W C++ switch działa tylko na:
//•	Typach całkowitych (int, char, unsigned int, itp.)
//•	Typach enum
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dzień tygodnia od pon do czw: ");
        String dzien = scanner.nextLine();

        switch (dzien.toLowerCase()) {
            case "pon":
                System.out.println("Dzisiaj jest poniedziałek");
                break;
            case "wto":
                System.out.println("Dzisiaj jest wtorek");
                break;
            case "sob":
            case "czw":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Brak danych");
        }

        scanner.close();
    }
}