/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/



	public class Main {
    public static void main(String[] args) {

        System.out.println("==== Smart Utility Calculator ====");
        System.out.println("1. Check if a number is Even or Odd");
        System.out.println("2. Find the largest of three numbers");
        System.out.println("3. Grade Calculator");
        System.out.println("4. Simple Calculator (+, -, *, /)");
        System.out.println("5. Exit");

     
        int choice = 4;
        System.out.println("Enter your choice: " + choice);

        switch (choice) {

           
            case 1: {
                int n = 9; 
                System.out.println("Number: " + n);
                if (n % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
                break;
            }

           
            case 2: {
                int a = 25, b = 12, c = 37;
                System.out.println("Numbers: " + a + ", " + b + ", " + c);
                int largest;

                if (a >= b) {
                    if (a >= c)
                        largest = a;
                    else
                        largest = c;
                } else {
                    if (b >= c)
                        largest = b;
                    else
                        largest = c;
                }

                System.out.println("Largest number is: " + largest);
                break;
            }

            
            case 3: {
                int score = 85; 
                System.out.println("Enter your score: " + score);

                if (score >= 90 && score <= 100)
                    System.out.println("Grade: A");
                else if (score >= 80 && score <= 89)
                    System.out.println("Grade: B");
                else if (score >= 70 && score <= 79)
                    System.out.println("Grade: C");
                else if (score >= 60 && score <= 69)
                    System.out.println("Grade: D");
                else if (score >= 0 && score < 60)
                    System.out.println("Grade: F");
                else
                    System.out.println("Invalid score. Must be 0–100.");
                break;
            }

            
            case 4: {
                double num1 = 20, num2 = 4;
                char operator = '/'; 
                System.out.println("Operation: " + num1 + " " + operator + " " + num2);

                switch (operator) {
                    case '+':
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case '*':
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case '/':
                        if (num2 != 0)
                            System.out.println("Result: " + (num1 / num2));
                        else
                            System.out.println("Error: Division by zero not allowed.");
                        break;
                    default:
                        System.out.println("Invalid operator.");
                }
                break;
            }

          
            case 5: {
                System.out.println("Goodbye!");
                break;
            }

            
            default:
                System.out.println("Invalid menu option.");
        }
    }
}
	
