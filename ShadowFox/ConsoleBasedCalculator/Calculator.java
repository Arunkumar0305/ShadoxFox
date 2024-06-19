import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        do {
            double num1 = 0, num2 = 0, ans = 0;
            try {
                System.err.println("Enter the first number: ");
                num1 = sc.nextDouble();
                sc.nextLine(); 
                System.err.println("Enter the second number: ");
                num2 = sc.nextDouble();
                sc.nextLine(); 
                System.err.println("Enter the operation:(eg:+,-,*,/) "+"\n"+"For coversion (celsius to fahrenheit use ( CtoF ), (fahrenheit to celsius use ( FtoC ) ");
                String operation = sc.nextLine();

                switch (operation) {
                    case "+":
                        ans = num1 + num2;
                        System.out.println("The Addition is: " + ans);
                        break;
                    case "-":
                        ans = num1 - num2;
                        System.out.println("The Subtraction is: " + ans);
                        break;
                    case "*":
                        ans = num1 * num2;
                        System.out.println("The Multiplication is: " + ans);
                        break;
                    case "/":
                        if (num2 != 0) {
                            ans = num1 / num2;
                            System.out.println("The Division is: " + ans);
                        } else {
                            System.out.println("Cannot divide by zero.");
                        }
                        break;
                    case "%":
                        ans = num1 % num2;
                        System.out.println("The Modulus is: " + ans);
                        break;
                    case "^":
                        ans = Math.pow(num1, num2);
                        System.out.println("The Power is: " + ans);
                        break;
                    case "sin":
                        ans = Math.sin(num1);
                        System.out.println("The Sine of " + num1 + " is: " + ans);
                        break;
                    case "cos":
                        ans = Math.cos(num1);
                        System.out.println("The Cosine of " + num1 + " is: " + ans);
                        break;
                    case "tan":
                        ans = Math.tan(num1);
                        System.out.println("The Tangent of " + num1 + " is: " + ans);
                        break;
                    case "log":
                        if (num1 > 0) {
                            ans = Math.log(num1);
                            System.out.println("The Natural Logarithm of " + num1 + " is: " + ans);
                        } else {
                            System.out.println("Logarithm is undefined for non-positive numbers.");
                        }
                        break;
                    case "exp":
                        ans = Math.exp(num1);
                        System.out.println("The Exponential of " + num1 + " is: " + ans);
                        break;
                    case "CtoF":
                        ans = (num1 * 9 / 5) + 32;
                        System.out.println(num1 + " Celsius is equal to " + ans + " Fahrenheit.");
                        break;
                    case "FtoC":
                        ans = (num1 - 32) * 5 / 9;
                        System.out.println(num1 + " Fahrenheit is equal to " + ans + " Celsius.");
                        break;
                    case "exit":
                        exit = true;
                        System.out.println("Exiting the calculator. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid operation!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine(); // This Clear input buffer
            } catch (ArithmeticException e) {
                System.out.println("An arithmetic error occurred: " + e.getMessage());
            }
        } while (!exit);
    }
}