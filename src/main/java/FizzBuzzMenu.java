import java.util.Scanner;

public class FizzBuzzMenu {
    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("--- FizzBuzz Menu ---");
            System.out.println("1. Fizz (Multiples of 3)");
            System.out.println("2. Buzz (Multiples of 5)");
            System.out.println("3. FizzBuzz (Multiples of 3 and 5)");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            Scanner scanner = new Scanner(System.in);
            int numCase = scanner.nextInt();

            switch (numCase) {
                case 1:
                    for (int i = 1; i <= 100; i++) {
                        if (i % 3 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 100; i++) {
                        if (i % 5 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 100; i++) {
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }
}