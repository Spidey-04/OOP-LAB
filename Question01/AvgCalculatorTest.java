/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labsheet6;

/**
 *
 * @author sahan
 */
public class AvgCalculatorTest {
    public static void main(String[] args) {
        AvgCalculator calculator = new AvgCalculator(500,0);
        
        try {
            calculator.calculate_average();
        } catch(ArithmeticException e) {
            // When no of students is zero, dividing integer by zero is undefined.
            System.out.println("Error, No of students cannot be zero.");
        } finally {
            System.out.println("Average calculation completed.");
        }
        
        System.out.println("Program continues.....");
    }
}
