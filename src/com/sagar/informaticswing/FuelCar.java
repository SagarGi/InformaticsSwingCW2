/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.informaticswing;

/**
 *
 * @author sagar
 */
public class FuelCar extends Car {
    private String fuelType;
    private String numberOfSeats;
    private String mileage;
    
    public FuelCar(String carID,String carName,String carBrand, String carColor,String carPrice,String fuelType,String numberOfSeats,String mileage)
    {
        super(carID,carName,carBrand,carPrice,carColor);
        this.fuelType = fuelType;
        this.numberOfSeats = numberOfSeats;
        this.mileage = mileage;
    }
    
    public String getFuelType()
    {
        return fuelType;
    }
    
    public String getNumberOfSeats()
    {
        return numberOfSeats;
    }
    
    public String getMileage()
    {
        return mileage;
    }
    
    public String purchaseFuelCar(){
        return "Congratulation !! You have Successfully purchased a Fuel Car.";
    }
}
