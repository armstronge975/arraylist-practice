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
            processUserInput(scanner); // step 1 from instructions
            processUserInteractSelection(scanner); // step 2 from instructions
        } catch (InputMismatchException e) { // Use multiple catch blocks to customize error messages
            // Using System.err for errors
            System.err.println("Error: Attempted to add non-integer value to arraylist or make invalid selection");
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Processes user input and adds valid numbers to the list
     * @param scanner Scanner object for reading user input
     */
    private static void processUserInput(Scanner scanner) {
        final int EXIT_VALUE = 0;
        int inputNum;

        System.out.println("Step 1: Enter in one number at a time and press enter.\n" +
        "Type in 0 and press enter when done.");     
        do {
            inputNum = scanner.nextInt();
            if (inputNum != EXIT_VALUE) {
                numbers.add(inputNum);
                printArrayList();
            }
        } while (inputNum != EXIT_VALUE);
    }

    /**
     * Processes user input and process valid option
     * @param scanner Scanner object for reading user input
     */
    private static void processUserInteractSelection(Scanner scanner) {
        final int EXIT_VALUE = 8;
        int inputNum;

        System.out.println("Step 2: Select the following options to interact with your arraylist:\n" +
                "1. Print arraylist\n" +
                "2. Edit arraylist by replacing value at specified index\n" +
                "3. Delete value from arraylist at specified index\n" +
                "4. Add a new value to the end of the arraylist\n" +
                "5. Add a new value at a specified index\n" + 
                "6. Find the location (index) of a given value\n" + 
                "7. Find the value at a given location (index)\n" +
                "8. Quit program");
        do {
            inputNum = scanner.nextInt();
            switch (inputNum) {
                case 1:
                    printArrayList();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8: // exit case so do nothing
                    break;
                default: // invalid selection
                    System.out.println("Please select a value between 1 and 8.");
            }
        } while (inputNum != EXIT_VALUE);
    }

    // print arraylist contents
    private static void printArrayList() {
        // numbers automatically toString() from ArrayList class
        System.out.println("Your current arraylist: " + numbers);
    }
}
