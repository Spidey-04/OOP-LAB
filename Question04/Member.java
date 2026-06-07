package com.mycompany.labsheet6;

public class Member {
    // Private attributes
    private String memberName;
    private String membershipType;
    private boolean newsletterSelected;
    private int numberOfMonths;

    // Constructor
    public Member(String memberName, String membershipType, boolean newsletterSelected, int numberOfMonths) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.newsletterSelected = newsletterSelected;
        this.numberOfMonths = numberOfMonths;
    }

    // Getter methods
    public String getMemberName() {
        return memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public boolean isNewsletterSelected() {
        return newsletterSelected;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    // Determine monthly fee based on type
    public double getMonthlyFee() {
        if (membershipType.equals("Premium")) {
            return 2500.0;
        } else {
            return 1000.0; // Regular
        }
    }

    // Calculate total final fee
    public double getMembershipFee() {
        double total = getMonthlyFee() * numberOfMonths;
        
        // Add flat newsletter charge if selected
        if (newsletterSelected) {
            total += 200.0;
        }
        
        return total;
    }

    // Return friendly text for the newsletter status
    public String getNewsletterText() {
        if (newsletterSelected) {
            return "Yes";
        } else {
            return "No";
        }
    }
}