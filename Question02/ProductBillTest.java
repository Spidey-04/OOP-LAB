/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labsheet6;

/**
 *
 * @author sahan
 */
public class ProductBillTest {
    public static void main(String[] args) {
        
        
        try {
            ProductBill calculator = new ProductBill(1500.0,Integer.parseInt("kk"));
            calculator.calculateTotal();
        } catch(Exception e) {
            // When quantity is given as a text, it can't be defined as double.
            System.out.println("Error, Quantity can't be a text.");
        } finally {
            System.out.println("Product bill calculation completed.");
        }
        
        System.out.println("Program continues.....");
    }
}
