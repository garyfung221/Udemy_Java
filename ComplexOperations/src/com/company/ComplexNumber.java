package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real ,double imaginary ){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }
    public void add(double real ,double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;

    }
    public void add(ComplexNumber ComplexNumber){
        System.out.println("TEST"+ComplexNumber.getReal());
        this.real+=ComplexNumber.getReal();
        this.imaginary+=ComplexNumber.getImaginary();
    }
    public void subtract(double real , double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public void subtract(ComplexNumber ComplexNumber){
        this.real-=ComplexNumber.getReal();
        this.imaginary-=ComplexNumber.getImaginary();
    }
}
