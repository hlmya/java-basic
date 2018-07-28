package models;

interface PaymentCheck{
    // returning the gross salary 
    double getGrossWage();

    // returning the discounts and descriptions double 
    String getDiscounts();

    //returning the net wage.
    double calculateNetWage();
}