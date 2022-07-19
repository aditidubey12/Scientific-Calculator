import java.util.Scanner;

public class SciCalculator {
    //The start of the program
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a =0; //variable for menu
            double result = 0; //variable for result
            int numCalc = 0; //variable for number of calculations
            boolean calc = true; //variable for loop
            System.out.println("Current Result: " + result);

            //the loop for the menu
            while (calc==true) {
                System.out.println("Calculator Menu ");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.print("Enter Menu Selection:");
                a = scanner.nextInt();
                //the options for 0,7,greater than 7, and less than 0
                if (a==7) {
                    if (numCalc == 0) {
                        System.out.println("Error: No calculations yet to average! ");
                        System.out.print("Enter Menu Selection:");
                        a = scanner.nextInt();
                        calc=false;
                    } else {
                        System.out.println("Sum of calculations: " + result);
                        System.out.println("Number of calculations: " + numCalc);
                        System.out.println("Average of calculations: " + Math.round(((result / numCalc)*100.0))/100.0);
                        System.out.print("Enter Menu Selection:");
                        a = scanner.nextInt();
                        calc = false;
                    }
                }
                if (a == 0) {
                    calc = false;
                    System.out.println("Thanks for using this calculator. Goodbye!");
                }
                if(a<0 || a>7){
                    System.out.println("Error: Invalid selection!");
                    System.out.print("Enter Menu Selection:");
                    a = scanner.nextInt();
                    calc=false;
                    if (a==0){
                        calc = false;
                        System.out.println("Thanks for using this calculator. Goodbye!");
                    }
                }
                //the options for 1-6
                while (a>=1 && a<=6) {
                    System.out.print("Enter first operand: ");
                    double first = scanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    double second = scanner.nextDouble();
                    //for addition
                    if (a == 1) {
                        calc=true;
                        System.out.println("Current Result: " + (first + second));
                        numCalc++;
                        result += first + second;
                        break;
                    //for subtraction
                    } else if (a == 2) {
                        calc=true;
                        System.out.println("Current Result: " + (first - second));
                        numCalc++;
                        result += first - second;
                        break;
                    //for multiplication
                    } else if (a == 3) {
                        calc=true;
                        System.out.println("Current Result: " + (first * second));
                        numCalc++;
                        result += first * second;
                        break;
                    //for division
                    } else if (a == 4) {
                        calc=true;
                        System.out.println("Current Result: " + (first / second));
                        numCalc++;
                        result += first / second;
                        break;
                    //for exponentiation
                    } else if (a == 5) {
                        calc=true;
                        System.out.println("Current Result: " + (Math.pow(first, second)));
                        numCalc++;
                        result += (Math.pow(first, second));
                        break;
                    //for logs
                    } else if (a == 6) {
                        calc=true;
                        System.out.println("Current Result: "+ (Math.log(second) / Math.log(first)));
                        numCalc++;
                        result += (Math.log(second) / Math.log(first));
                        break;
                    }

                }
            }
        }
    }



