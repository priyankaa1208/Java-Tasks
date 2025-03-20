package Tasks;

import java.util.Scanner;

public class Task_006_FabonacciSequence
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           int n = scan.nextInt();                                           //int number = 10;   // Number of terms to display in the Fibonacci sequence
        int firstNumber = 0, secondNumber = 1;
        System.out.println("Enter a Fibonacci Sequence is" + n );
        for (int i = 1; i <= n; i++) {
            System.out.print( firstNumber+ " ");

            // Generate the next Fibonacci number
           int next = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = next;
        }
    }
}
