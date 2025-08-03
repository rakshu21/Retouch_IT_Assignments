package conditionalLoops;

import java.util.Scanner;

public class MiniCalculator_switch_looop {
    public static void main(String[] args) {

        //create a scanner object to read the input from keyborad/user
        Scanner scanner =new Scanner(System.in);

        int choice;  //to store the menu options selected
        double num1,num2,result; // to store two number and the result of the operation

        //start an infinite loop that break only when the user choose the break (option 5)
        while(true){
            System.out.println("\n -----Calculator Menu------");
            System.out.println("1. Add");
            System.out.println("2. subtract");
            System.out.println("3. multiplication");
            System.out.println("4. Division");
            System.out.println("5.Exit");

            //Prompt user to enter a menu option(1-5)
            System.out.print("Choose an option:   ");
            choice=scanner.nextInt();//Read Integer  input from user

            if(choice==5){
                System.out.println("exit Calculator,Goodbye");
                break;
            }

            //prompt user to enter two number for the calculation
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            // Switch for operations
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please select 1-5.");
            }



        }

        scanner.close(); // Close the scanner when done

    }
}
