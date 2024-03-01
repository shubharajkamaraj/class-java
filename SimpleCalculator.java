import java.util.Scanner;

class SimpleCalculator {

    public static void main(String args[]) {
        Scanner scin = new Scanner(System.in);
        double num1, num2;
        System.out.print("Enter first number: ");
        num1 = scin.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scin.nextDouble();
	System.out.print("Enter Operator: ");

        char choice = scin.next().charAt(0);

        if (choice == '+') {
            addition(num1, num2);
        } else if (choice == '-') {
            subtraction(num1, num2);
        } else if (choice == '*') {
            multiplication(num1, num2);
        } else if (choice == '/') {
            division(num1, num2);
        } else {
            System.out.println("Invalid choice");
            return;
        }

    }

    public static void addition(double num1, double num2) {
        double result = num1 + num2;
	System.out.println("Result: " + result);
    }

    public static void subtraction(double num1, double num2) {
        double result = num1 - num2;
	System.out.println("Result: " + result);
    }

    public static void multiplication(double num1, double num2) {
        double result = num1 * num2;
	System.out.println("Result: " + result);
    }

    public static void division(double num1, double num2) {
        if (num2 != 0) {
           double result = num1 / num2;
	   System.out.println("Result: " + result);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

/*

C:\Users\User1\Desktop\java programs\classroom>java SimpleCalculator
Enter first number: 4
Enter second number: 5
Enter Operator: *
Result: 20.0

*/
