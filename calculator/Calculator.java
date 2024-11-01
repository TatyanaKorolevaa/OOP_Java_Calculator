package calculator;

import operation.ComplexNumber;

class Calculator {
    private ComplexOperation operation;

    
    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
    }

    
    public void executeOperation(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = operation.operate(num1, num2);
        Logger.log("Result: " + result.getReal() + " + " + result.getImaginary());
    }
}