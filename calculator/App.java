package calculator;

import operation.ComplexNumber;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ComplexNumber num1 = new ComplexNumber(8.0, 3.0); 
        ComplexNumber num2 = new ComplexNumber(2.0, 1.0); 

        Calculator calculator = new Calculator();

        Logger.log("Select an operation:");
        Logger.log("1 - Addition");
        Logger.log("2 - Subtraction");
        Logger.log("3 - Multiplication");
        Logger.log("4 - Division");

        int choice = input.nextInt();

        switch (choice) { 
            case 1 -> calculator.setOperation(new ComplexOperation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.addition(num2);
                }
            });
            case 2 -> calculator.setOperation(new ComplexOperation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.subtraction(num2);
                }
            });
            case 3 -> calculator.setOperation(new ComplexOperation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.multiplication(num2);
                }
            });
            case 4 -> calculator.setOperation(new ComplexOperation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.division(num2);
                }
            });
            default -> Logger.log("Wrong choice of operation. Try again.");
        }
        calculator.executeOperation(num1, num2);
    }

}