import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    // variables that will be available in all methods due to scope
    // final means this variable's value is constant and cannot change
    private static final int INITIAL_ARRAY_CAPACITY = 10;
    private static ArrayList<Integer> numbers = new ArrayList<>(INITIAL_ARRAY_CAPACITY);

    public static void main(String[] args) {
        // Using try-with-resources to automatically close scanner
        try (Scanner scanner = new Scanner(System.in)) {
            processUserInput(scanner); // instructions step 1
        } catch (InputMismatchException e) { // Use multiple catch blocks to customize error messages
            // Using System.err for errors
            System.err.println("Error: Attempted to add non-integer value to arraylist");
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Processes user input and adds valid numbers to the list
     * @param scanner Scanner object for reading user input
     * @param numbers List to store the input numbers
     */
    private static void processUserInput(Scanner scanner) {
        final int EXIT_VALUE = 0;
        int inputNum;

        System.out.println("Enter in one number at a time and press enter.\n" +
        "Type in 0 and press enter when done.");     
        do {
            inputNum = scanner.nextInt();
            if (inputNum != EXIT_VALUE) {
                numbers.add(inputNum);
                System.out.println("Your current arraylist: " + numbers);
            }
        } while (inputNum != EXIT_VALUE);
    }
}
