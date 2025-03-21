public class Zadanie9 {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Wartość zmiennej: " + num);
        changeValue(num);
        System.out.println("Wartość zmiennej po funkcji: " + num); // num nadal wynosi 5

        IntegerWrapper number = new IntegerWrapper(5);
        System.out.println("Wartość przed funkcją: " + number.getValue());
        changeValue(number);
        System.out.println("Wartość po funkcji: " + number.getValue()); // number.getValue() zmienia się na 10

        change(number);
        System.out.println("Wartość po funkcji: " + number.getValue()); // number.getValue() nadal wynosi 10
    }

    public static void changeValue(IntegerWrapper num) {
        num.setValue(10); // Zmiana wartość
    }

    public static void change(IntegerWrapper num) {
        num = new IntegerWrapper(26); // Zmiania referencję lokalnie, nie wpływa na main
    }

    public static void changeValue(int num) {
        num = 10; // Zmiania referencję lokalnie, nie wpływa na main
        System.out.println("Wartość zmiennej wewnątrz funkcji: " + num);
    }
}

class IntegerWrapper {
    private int value;

    public IntegerWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}