/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sagar.informaticswing;

/**
 *
 * @author sagar
 */
public class Car {
    private String carID;
    private String carName;
    private String carBrand;
    private String carColor;
    private String carPrice;
    
    public Car(String carID, String carName,String carBrand, String carPrice, String carColor) 
    {
        this.carID = carID;
        this.carName = carName;
        this.carBrand = carBrand;
        this.carPrice = carPrice;
        this.carColor = carColor;
    }
    
    public String getcarID()
    {
        return carID;
    }
    public String getCarName() 
    {
        return carName;
    }
    public String getCarBrand() 
    {
        return carBrand;
    }
    public String getCarPrice() 
    {
        return carPrice;
    }
    public String getCarColor()
    {
        return carColor;
    }
    
    public void setCarColor(String carColor) 
    {
        this.carColor = carColor;
    }
    
    public void setCarId(String carId){
        this.carID = carId;
    }
     public void setCarBrand(String carBrand) 
    {
        this.carBrand = carBrand;
    }
    
    public void setCarPrice(String carPrice){
        this.carPrice = carPrice;
    }
    
    public void setCarName(String carName){
        this.carName = carName;
    }
    
}
