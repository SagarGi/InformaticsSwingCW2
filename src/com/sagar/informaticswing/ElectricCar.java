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
    private boolean isBought;
    private boolean isSold;
    
    public ElectricCar(String carID,String carColor,String carName,String carBrand,String carPrice,String batteryCapacity)
    {
        super(carID,carName,carBrand,carPrice,carColor);//Calling the constructor of parent class Car
        this.batteryCapacity = batteryCapacity;
        this.customerName = "";
        this.batteryWarranty = "0";
        this.purchaseDate = "";
        this.range = "";
        this.rechargeTime = "0";
        this.isBought = false;
        this.isSold = false;
        
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
    public boolean getIsBought()
    {
        return isBought;
    }
    
    public boolean getIsSold()
    {
        return isSold;
    }
    public String buyElectricCar(){
        return "Congratulation !!! You have successfully bought an Electric Car.";
    }
}
