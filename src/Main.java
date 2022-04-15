import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;

        while (true) {
            System.out.println("Введите год и нажмите Enter.");
            year = new Scanner(System.in).nextInt();

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Это високосный год.");
                System.out.println("-------------------");
            } else {
                System.out.println("Это не високосный год.");
                System.out.println("-------------------");
            }
        }

    }
}
