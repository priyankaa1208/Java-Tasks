package Tasks;

import java.util.Scanner;

public class Task_005_Triangle

{
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine
        // if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
        // or scalene (no sides are equal). Use an if-else statement to classify the triangle.
        Scanner scan  = new Scanner(System.in);
        int num1= scan.nextInt();
        System.out.println("Print the lenght of the first triangle");
        int num2 = scan.nextInt();
        System.out.println("print the length of second triangle");
        int num3 = scan.nextInt();
        System.out.println("print the length of third triangle");
        scan.close();
        if(num1==num2 && num1==num3 &&  num2==num3 )
        {
            System.out.println("the triangle is equilateral");
        }else if(num1==num2 || num1==num2 || num2==num3)
        {
            System.out.println("The angle is isoleace two sides");

        }else{
            System.out.println("The angle is scalene ");
        }
    }
}
