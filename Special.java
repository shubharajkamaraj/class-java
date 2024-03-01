import java.util.Scanner;

class Check {
    public static void Prime(int num) {
        if (num <= 1) {
            System.out.println(num + " is not a Prime number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a Prime number");
                return;
            }
        }
        System.out.println(num + " is a Prime number");
    }

    public static void Armstrong(int num) {
        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is not an Armstrong number");
        }
    }

    public static void Palindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        if (reversedNum == originalNum) {
            System.out.println(originalNum + " is a Palindrome number");
        } else {
            System.out.println(originalNum + " is not a Palindrome number");
        }
    }

    public static void Krishnamurthy(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Krishnamurthy number");
        } else {
            System.out.println(originalNum + " is not a Krishnamurthy number");
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

class UserInput {
    public static int Input() {
        Scanner scin = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scin.nextInt();
    }
}

public class Special {
    public static void main(String args[]) {
        int num = UserInput.Input();

        Check.Prime(num);
        Check.Armstrong(num);
        Check.Palindrome(num);
        Check.Krishnamurthy(num);
    }
}


/*

C:\Users\User1\Desktop\java programs\classroom>java Special
Enter a number: 121
121 is not a Prime number
121 is not an Armstrong number
121 is a Palindrome number
121 is not a Krishnamurthy number

*/
