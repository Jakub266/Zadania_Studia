import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wybor = "tak";

        while(wybor.equals("tak")) {
            System.out.println("1.Normalny,");
            System.out.println("2.Ulgowy,");
            System.out.println("3.Miesięczny,");
            System.out.println("Podaj numer bileru:");

            int bilet = scanner.nextInt();
            scanner.nextLine();

            switch (bilet) {
                case 1:
                    System.out.println("Wybrałeś bilet normalny");
                    break;
                case 2:
                    System.out.println("Wybrałeś bilet ulgowy");
                    break;
                case 3:
                    System.out.println("Wybrałeś bilet miesięczny");
                    break;
                default:
                    System.out.println("Brak danych");
            }
            System.out.print("Czy chcesz kupić drugi bilet tak/nie");
            wybor = scanner.nextLine();
        }
        System.out.println("Dziękujemy za zakupy");
        scanner.close();
    }

}