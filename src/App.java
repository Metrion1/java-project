import java.util.InputMismatchException;
import java.util.Scanner;

import parts.Engine;
import parts.Wheel;

public class App {
    public static void Edgecases() {
        // --- Edge Case: null array ---
        int[] caseNull = null;
        System.out.println("Null array " + Utils.countOccurrences(caseNull, 5));

        // --- Edge Case: empty array ---
        int[] caseEmpty = new int[0];
        System.out.println("Empty array " + Utils.countOccurrences(caseEmpty, 5));

        // --- Edge Case: single element (match) ---
        int[] caseSingleMatch = { 5 };
        System.out.println("Single element (match) " + Utils.countOccurrences(caseSingleMatch, 5));

        // --- Edge Case: single element (no match) ---
        int[] caseSingleNoMatch = { 3 };
        System.out.println("Single element (no match) " + Utils.countOccurrences(caseSingleNoMatch, 5));

        // --- Edge Case: negative numbers ---
        int[] caseNegative = { -1, -5, -5, -2 };
        System.out.println("Negative numbers " + Utils.countOccurrences(caseNegative, -5));

        // --- Edge Case: all equal elements (match) ---
        int[] caseAllEqualMatch = { 7, 7, 7, 7 };
        System.out.println("All equal (match) " + Utils.countOccurrences(caseAllEqualMatch, 7));

        // --- Edge Case: all equal elements (no match) ---
        int[] caseAllEqualNoMatch = { 7, 7, 7, 7 };
        System.out.println("All equal (no match) " + Utils.countOccurrences(caseAllEqualNoMatch, 5));

        // --- Edge Case: mixed values ---
        int[] caseMixed = { 1, 5, 3, 5, 2, 5 };
        System.out.println("Mixed values " + Utils.countOccurrences(caseMixed, 5));
        // sumOfEvens, CountOccurrences.

        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        int sum = Utils.sumOfEvens(numbers);

        System.out.println("Hello, Java in VS Code!");
        System.out.println("Sum of even numbers: " + sum);

    }

    public static void StudentTest() {
        Student ana = new Student("Ana", 1, 3.8);
        Student bob = new Student("Bob", 2, 3.5);
        Student anaj = new Student("Ana Jones", 1, 3.8);

        System.out.println(ana.toString()); // Output: Ana (ID: 1, GPA: 3.8)
        System.out.println(bob.toString()); // Output: Bob (ID: 2, GPA: 3.5)

        System.out.println(ana.equals(bob)); // Output: false
        System.out.println(ana.equals(anaj)); // Output: true
    }

    public static void CarTestCase() {
        Scanner scanner = new Scanner(System.in);
        try {System.out.print("Enter engine type (diesel, gasoline, electric, hybrid): ");
        String engineType = scanner.nextLine();
        System.out.println("Enter engine horsepower: ");
        int horsepower = scanner.nextInt();

        Engine engine = new Engine(engineType, horsepower);

        System.out.print("Enter number of wheels: ");
        int numWheels = Integer.parseInt(scanner.nextLine());
        Wheel[] wheels = new Wheel[numWheels];

        for (int i = 0; i < numWheels; i++) {
            System.out.println("Enter size and pressure for wheel " + (i + 1) + ": ");
            double size = scanner.nextDouble();
            double pressure = scanner.nextDouble();
            wheels[i] = new Wheel(size, pressure);

            Car car = new Car();
            car.Engine(engine);
            car.setWheels(wheels);
        }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter the correct data type.");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }

    public static void main(String[] args) throws Exception {
        // Edgecases();
        // StudentTest();
        CarTestCase();
    }
}
