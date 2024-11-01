package operation;

public class ComplexNumber {
    private double real; 
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public ComplexNumber addition(ComplexNumber other) {
        return new ComplexNumber(this.real + other.getReal(), this.imaginary + other.getImaginary());
    }

    
    public ComplexNumber subtraction(ComplexNumber other) {
        return new ComplexNumber(this.real - other.getReal(), this.imaginary - other.getImaginary());
    }

    public ComplexNumber multiplication(ComplexNumber other) {
        double newReal = this.real * other.getReal() - this.imaginary * other.getImaginary();
        double newImaginary = this.real * other.getImaginary() + this.imaginary * other.getReal();
        return new ComplexNumber(newReal, newImaginary);
    }

   
    public ComplexNumber division(ComplexNumber other) {
        double denominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        double newReal = (this.real * other.getReal() + this.imaginary * other.getImaginary()) / denominator;
        double newImaginary = (this.imaginary * other.getReal() - this.real * other.getImaginary()) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}