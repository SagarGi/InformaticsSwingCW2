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
     private String distributorName;
    private String fuelType;
    private String numberOfSeats;
    private String mileage;
    private String bookedDate;
    private String purchaseDate;
    private String transmissionType;
    private boolean isPurchased = false;
    
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
    
    public void setDistributerName(String distributorName){
        this.distributorName = distributorName;
    }
    
    public void setTransmissionType(String transmissionType){
        this.transmissionType = transmissionType;
    }
    
    public void setPurchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }
    
    public void setBookedDate(String bookedDate){
        this.bookedDate = bookedDate;
    }
    
    
    public String purchaseFuelCar(String purchaseDate, String bookedDate, String transmissionType, String distributorName){
        if(isPurchased == false){
            this.setDistributerName(distributorName);
            this.setBookedDate(bookedDate);
            this.setPurchaseDate(purchaseDate);
            this.setTransmissionType(transmissionType);
            this.isPurchased = true;
            return "Purchased Successfull!!!";
        }
        return "Already Been Purchased !!";
    }
    
    public void display(){
        super.display();
        if(isPurchased == true)
        { 
            System.out.println("DistributorName is:"+distributorName);
            System.out.println("FuelType is:"+fuelType);
            System.out.println("PurchaseDate is:"+purchaseDate);
            System.out.println("BookedDate is:"+bookedDate);
            System.out.println("Mileage is:"+mileage);
            System.out.println("NumberOfSeats is:"+numberOfSeats);
            System.out.println("TransmissionType is:"+transmissionType);
        }
    }
}
