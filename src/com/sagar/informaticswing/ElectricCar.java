/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.informaticswing;

/**
 *
 * @author sagar
 */
public class ElectricCar extends Car {
    private String customerName;
    private String batteryCapacity;
    private String batteryWarranty;
    private String purchaseDate;
    private String range;
    private String rechargeTime;
    private boolean isBought = false;
    private boolean isSold = false;
    
    public ElectricCar(String carID,String carColor,String carName,String carBrand,String carPrice,String batteryCapacity)
    {
        super(carID,carName,carBrand,carPrice,carColor);//Calling the constructor of parent class Car
        this.batteryCapacity = batteryCapacity;
        
    }
    
    public String getCustomerName()
    {
        return customerName;
    }
    public String getBatteryCapacity()
    {
        return batteryCapacity;
    }
    public String getBatteryWarranty()
    {
        return batteryWarranty;
    }
    public String getPurchaseDate()
    {
        return purchaseDate;
    }
    public String getRange()
    {
        return range;
    }
    public String getRechargeTime()
    {
        return rechargeTime;
    }
    
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public void setBatteryWarrenty(String batteryWarrenty){
        this.batteryWarranty = batteryWarrenty;
    }
    
    public void setPurchasedDate(String purchasedDate){
        this.purchaseDate = purchasedDate;
    }
    
    public void setRange(String range){
        this.range = range;
    }
    
    public void setRechargeTime(String rechargeTime){
        this.rechargeTime = rechargeTime; 
    }
    public String buyElectricCar(String customerName, String batteryWarrenty, String purchasedDate, String range, String rechargeTime){
        if(isBought == false){
            this.setCustomerName(customerName);
            this.setBatteryWarrenty(batteryWarrenty);
            this.setPurchasedDate(purchasedDate);
            this.setRange(range);
            this.setRechargeTime(rechargeTime);
            this.isBought = true;
            this.isSold = false;
        }
        else {
            return "Opps !!! This Electric car is already bought by someone else.";
        }
        return "Congratulation !!! You have successfully bought an Electric Car.";
    }
    
    public String sellElectricCar(String customerName){
        if(isSold == false){
            this.customerName = customerName;
            this.setBatteryWarrenty("");
            this.setPurchasedDate("");
            this.setRange("");
            this.setRechargeTime("");
            this.isBought = false;
            this.isSold = true;

        }else{
            return "The car was already sold!!";
        }
        return "Electric car is sold successfully !!";
    }
}
