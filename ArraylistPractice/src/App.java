import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        try {
            // Part 1: prompt user to enter numbers, which will be stored in arraylist
            // conditional value (when to stop) is 0
            System.out.println("Enter in one number at a time and press enter.\n" +
                "Type in 0 and press enter when done.");
            do {
                inputNum = scanner.nextInt();
                if (inputNum != 0) {
                    numbers.add(inputNum);
                }
                System.out.println("Your current arraylist: " + numbers.toString());
            } while (inputNum != 0);
        // use specific exception types in multiple catch blocks to customize error messages & processing
        } catch (InputMismatchException e) {
            System.out.println("Error: Attempted to add non-integer value to arraylist");
        // default exception used if above catch block(s) don't match the caught error
        } catch (Exception e) {
            e.printStackTrace();
        }
        // finally block allows us to automatically 
        finally {
            scanner.close();
        }
    }
}
