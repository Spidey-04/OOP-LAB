package com.mycompany.labsheet6;

public class ProductBill {   
        private double priceText;
        private int quantityText;
        
        public ProductBill(double priceText, int quantityText){
            this.priceText = priceText;
            this.quantityText = quantityText;
        }
        
        public double calculateTotal() {
            return priceText*quantityText;
        }
} 
