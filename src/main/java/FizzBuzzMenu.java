import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu {
    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            //Prompt user to enter menu options
            System.out.println("\n\nMenu Options:");
            System.out.println("Option 1: Display Fizz numbers (multiples of 3)");
            System.out.println("Option 2: Display Buzz numbers (multiples of 5)");
            System.out.println("Option 3: Display FizzBuzz numbers (multiples of both 3 and 5)");
            System.out.println("Option 4: Exit the program");
            System.out.print("\nEnter your option: ");

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