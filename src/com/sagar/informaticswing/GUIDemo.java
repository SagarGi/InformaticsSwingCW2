package com.sagar.informaticswing;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.Color;

/**
 *
 * @author sagar
 */
public class GUIDemo extends javax.swing.JFrame {
//    Array list of type Car class
    ArrayList<Car> cars = new ArrayList<Car>();
    
    public GUIDemo() {
        initComponents();
       setLocationRelativeTo(this); // bringing the main JFrame to the center of the screen
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        carID = new javax.swing.JTextField();
        carName = new javax.swing.JTextField();
        carBrand = new javax.swing.JTextField();
        fuelType = new javax.swing.JTextField();
        distributorName = new javax.swing.JTextField();
        carPrice = new javax.swing.JTextField();
        carColor = new javax.swing.JTextField();
        mileage = new javax.swing.JTextField();
        noOfSeats = new javax.swing.JTextField();
        transmissionType = new javax.swing.JTextField();
        cusName = new javax.swing.JTextField();
        batteryCapacity = new javax.swing.JTextField();
        rechargeTime = new javax.swing.JTextField();
        batteryWarrenty = new javax.swing.JTextField();
        range = new javax.swing.JTextField();
        purchaseDate = new javax.swing.JComboBox<>();
        bookedDate = new javax.swing.JComboBox<>();
        addFuelCar = new javax.swing.JButton();
        purchaseFuelCar = new javax.swing.JButton();
        addElectricCar = new javax.swing.JButton();
        sellElectricCar = new javax.swing.JButton();
        displayInfo = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        buyElectricCar = new javax.swing.JButton();
        carid = new javax.swing.JLabel();
        carname = new javax.swing.JLabel();
        carbrand = new javax.swing.JLabel();
        carcolor = new javax.swing.JLabel();
        carprice = new javax.swing.JLabel();
        distributorname = new javax.swing.JLabel();
        fueltype = new javax.swing.JLabel();
        noofseats = new javax.swing.JLabel();
        mile_age = new javax.swing.JLabel();
        transmissiontype = new javax.swing.JLabel();
        customername = new javax.swing.JLabel();
        batterycapacity = new javax.swing.JLabel();
        batterywarrenty = new javax.swing.JLabel();
        ran_ge = new javax.swing.JLabel();
        rechargetime = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Station Frame");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO CAR STATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        purchaseDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\"\"", "2021-11-11", "2022-02-02" }));

        bookedDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addFuelCar.setText("Add Fuel Car");
        addFuelCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuelCarActionPerformed(evt);
            }
        });

        purchaseFuelCar.setText("Buy Fuel Car");
        purchaseFuelCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseFuelCarActionPerformed(evt);
            }
        });

        addElectricCar.setText("Add Electric Car");
        addElectricCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addElectricCarActionPerformed(evt);
            }
        });

        sellElectricCar.setText("Sell Electric Car");
        sellElectricCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellElectricCarActionPerformed(evt);
            }
        });

        displayInfo.setText("Display");
        displayInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayInfoActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        buyElectricCar.setText("Buy Electric Car");
        buyElectricCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyElectricCarActionPerformed(evt);
            }
        });

        carid.setText("carID:");

        carname.setText("Car Name:");

        carbrand.setText("Car Brand:");

        carcolor.setText("Car Color:");

        carprice.setText("Car Price:");

        distributorname.setText("Distributor Name:");

        fueltype.setText("Fuel Type:");

        noofseats.setText("Number of Seats:");

        mile_age.setText("Mileage:");

        transmissiontype.setText("Transmission Type:");

        customername.setText("Customer Name:");

        batterycapacity.setText("Battery Capacity:");

        batterywarrenty.setText("Battery Warranty:");

        ran_ge.setText("Range:");

        rechargetime.setText("Recharge Time:");

        jLabel17.setText("Purchase date:");

        jLabel18.setText("Booked Date:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(carID)
                        .addComponent(fuelType)
                        .addComponent(carColor)
                        .addComponent(transmissionType)
                        .addComponent(batteryWarrenty, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(purchaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addFuelCar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellElectricCar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carid)
                    .addComponent(carcolor)
                    .addComponent(fueltype)
                    .addComponent(transmissiontype)
                    .addComponent(batterywarrenty)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(carName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(carPrice, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(noOfSeats, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cusName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(range, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bookedDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addElectricCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buyElectricCar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carname)
                    .addComponent(carprice)
                    .addComponent(noofseats)
                    .addComponent(customername)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ran_ge))
                    .addComponent(jLabel18))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rechargetime)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(batterycapacity))
                    .addComponent(mile_age)
                    .addComponent(distributorname)
                    .addComponent(carbrand)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(carBrand)
                        .addComponent(distributorName)
                        .addComponent(mileage)
                        .addComponent(batteryCapacity)
                        .addComponent(rechargeTime)
                        .addComponent(purchaseFuelCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(displayInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carcolor)
                        .addGap(3, 3, 3)
                        .addComponent(carColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fueltype)
                        .addGap(5, 5, 5)
                        .addComponent(fuelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(transmissiontype)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transmissionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(batterywarrenty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batteryWarrenty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(purchaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(addFuelCar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellElectricCar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carbrand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(distributorname)
                        .addGap(3, 3, 3)
                        .addComponent(distributorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(mile_age)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mileage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(batterycapacity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batteryCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(rechargetime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rechargeTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(purchaseFuelCar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayInfo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carprice)
                        .addGap(3, 3, 3)
                        .addComponent(carPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(noofseats)
                        .addGap(5, 5, 5)
                        .addComponent(noOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(ran_ge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(range, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(addElectricCar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buyElectricCar)
                        .addGap(18, 18, 18)
                        .addComponent(clear)))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buyElectricCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyElectricCarActionPerformed

        if(buyElectricCarValidation()){
            JOptionPane.showMessageDialog(null, "Fileds cannot be left Empty!!!");
        }else {
            if(cars.isEmpty()){
                JOptionPane.showMessageDialog(null, "No Cars Available at the moment !!");
                return;
            }
            for(Car car : cars){
                if(car.getcarID().equals(getCarId())){
                    JOptionPane.showMessageDialog(null,((ElectricCar)car).buyElectricCar(getCustomerName(), getBatteryWarranty(), getPurchaseDate(), getRange(), getRechargeTime()));
                    break;
                }
            }
        }
        
    }//GEN-LAST:event_buyElectricCarActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        resetAllFields();
    }//GEN-LAST:event_clearActionPerformed

    private void displayInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayInfoActionPerformed
 
    }//GEN-LAST:event_displayInfoActionPerformed

    private void sellElectricCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellElectricCarActionPerformed
        if(sellElectricCarValidation()){
            JOptionPane.showMessageDialog(null, "Fileds cannot be left Empty!!!");
        }else {
            if(cars.isEmpty()){
                JOptionPane.showMessageDialog(null, "No Cars Available at the moment !!");
                return;
            }
            for(Car car : cars){
                if(car.getcarID().equals(getCarId())){
                    JOptionPane.showMessageDialog(null,((ElectricCar)car).sellElectricCar(getCustomerName()));
                    break;
                }
            }
        }
    }//GEN-LAST:event_sellElectricCarActionPerformed

    private void addElectricCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addElectricCarActionPerformed
        if(addElectricCarValidation()){
            JOptionPane.showMessageDialog(null, "Fileds cannot be left Empty!!!");
        }else{
            //creating a ElectricCar obj and adding to the arraylist of Car Type
            ElectricCar electricCar = new ElectricCar(getCarId(), getCarColor(), getCarName(), getCarBrand(), getCarPrice(), getBatteryCapacity());
            cars.add(electricCar);
            resetAllFields();
            JOptionPane.showMessageDialog(null, "Electric car added successfull!!!");

        }
    }//GEN-LAST:event_addElectricCarActionPerformed

    private void purchaseFuelCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseFuelCarActionPerformed
        if(buyElectricCarValidation()){
            JOptionPane.showMessageDialog(null, "Fileds cannot be left Empty!!!");
        }else{
            if(cars.isEmpty()){
                JOptionPane.showMessageDialog(null, "No Cars Available at the moment !!");
                return;
            }
            for(Car car : cars){
                if(car.getcarID().equals(getCarId())){
                    JOptionPane.showMessageDialog(null, ((FuelCar)car).purchaseFuelCar(getPurchaseDate(), getBookedDate(), getTranmissionType(), getDistributerName()));
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Sorry !! The Fule car you are buying is out of stock !!");
        }
    }//GEN-LAST:event_purchaseFuelCarActionPerformed

    private void addFuelCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuelCarActionPerformed
        
        if(addFuelCarValidation()){
            JOptionPane.showMessageDialog(null, "Fileds cannot be left Empty!!!");
        }else{
            //creating a FuelCar obj and adding to the arraylist of Car Type
            FuelCar fuelCar = new FuelCar(getCarId(), getCarName(), getCarBrand(), getCarColor(), getCarPrice(), getFuelType(), getSeatNo(), getMileage());
            cars.add(fuelCar);
            resetAllFields();
            JOptionPane.showMessageDialog(null, "Fuel car added successfull!!!");
        }

    }//GEN-LAST:event_addFuelCarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIDemo().setVisible(true);
            }
        });
    }
    
    public String getCarId(){
        String carId = carID.getText();
        return carId;
    }
    
    public String getCarName(){
        String carname = carName.getText();
        return carname;
    }
    
    public String getCarBrand(){
        String carbrand = carBrand.getText();
        return carbrand;
    }
    public String getCarColor(){
        String carColor = fuelType.getText();
        return carColor;
    }
    
    public String getCarPrice(){
        String carprice = carPrice.getText();
        return carprice;
    }
    public String getDistributerName(){
        String disName = distributorName.getText();
        return disName;
    }
    public String getFuelType(){
        String fueltype = fuelType.getText();
        return fueltype;
    }
    public String getSeatNo(){
        String seatNo = noOfSeats.getText();
        return seatNo;
    }
    public String getMileage(){
        String mileageCar = mileage.getText();
        return mileageCar;
    }
    public String getTranmissionType(){
        String transmissiontype = transmissionType.getText();
        return transmissiontype;
    }
    public String getCustomerName(){
        String cusname = cusName.getText();
        return cusname;
    }
    public String getBatteryCapacity(){
        String batterycapacity = batteryCapacity.getText();
        return batterycapacity;
    }
    public String getBatteryWarranty(){
        String batteryWarranty = rechargeTime.getText();
        return batteryWarranty;
    }
    public String getRange(){
        String rangee = range.getText();
        return rangee;
    }
    public String getRechargeTime(){
        String rechargetime = rechargeTime.getText();
        return rechargetime;
    }
    
    public String getPurchaseDate(){
        String purchasedate = purchaseDate.getSelectedItem().toString();
        return purchasedate;
    }
    
    public String getBookedDate(){
        String bookeddate = bookedDate.getSelectedItem().toString();
        return bookeddate;
    }
    
    public boolean addFuelCarValidation(){
        if(getCarId().equals("") || getCarBrand().equals("") || getCarName().equals("") || getCarPrice().equals("") || getFuelType().equals("") || getSeatNo().equals("") || getMileage().equals("")){
            if(!getCarId().equals("")){
                carid.setForeground(Color.black);
            }else {
                carid.setForeground(Color.red);
            }
            if(!getCarBrand().equals("")){
                carbrand.setForeground(Color.black);
            }else{
                carbrand.setForeground(Color.red);
            }
            if(!getCarName().equals("")){
                carname.setForeground(Color.black);
            }else{
                carname.setForeground(Color.red);
            }
            if(!getCarPrice().equals("")){
                carprice.setForeground(Color.black);
            }else{
                carprice.setForeground(Color.red);
            }
            if(!getFuelType().equals("")){
                fueltype.setForeground(Color.black);
            }else{
                fueltype.setForeground(Color.red);
            }
            if(!getSeatNo().equals("")){
                noofseats.setForeground(Color.black);
            }else{
                noofseats.setForeground(Color.red);
            }
            if(!getMileage().equals("")){
                mile_age.setForeground(Color.black);
            }else{
                mile_age.setForeground(Color.red);
            }
            return true;
        }
        
        return false;
    }
    
    public boolean addElectricCarValidation(){
        if(getCarId().equals("") || getCarBrand().equals("") || getCarName().equals("") || getCarPrice().equals("") || getBatteryCapacity().equals("")){
            if(!getCarId().equals("")){
                carid.setForeground(Color.black);
            }else {
                carid.setForeground(Color.red);
            }
            if(!getCarBrand().equals("")){
                carbrand.setForeground(Color.black);
            }else{
                carbrand.setForeground(Color.red);
            }
            if(!getCarName().equals("")){
                carname.setForeground(Color.black);
            }else{
                carname.setForeground(Color.red);
            }
            if(!getCarPrice().equals("")){
                carprice.setForeground(Color.black);
            }else{
                carprice.setForeground(Color.red);
            }
            if(!getBatteryCapacity().equals("")){
                batterycapacity.setForeground(Color.black);
            }else{
                batterycapacity.setForeground(Color.red);
            }
            return true;
        }
        return false;
    }
    
    public boolean purchaseFuelCarValidation(){
        if(getCarId().equals("") || getCarBrand().equals("") || getCarName().equals("") || getCarColor().equals("") || getTranmissionType().equals("") || getDistributerName().equals("") || getPurchaseDate().equals("") || getBookedDate().equals("")){
            if(!getCarId().equals("")){
                carid.setForeground(Color.black);
            }else {
                carid.setForeground(Color.red);
            }
            if(!getCarBrand().equals("")){
                carbrand.setForeground(Color.black);
            }else{
                carbrand.setForeground(Color.red);
            }
            if(!getCarName().equals("")){
                carname.setForeground(Color.black);
            }else{
                carname.setForeground(Color.red);
            }
            if(!getCarColor().equals("")){
                carcolor.setForeground(Color.black);
            }else{
                carcolor.setForeground(Color.red);
            }
            if(!getTranmissionType().equals("")){
                transmissiontype.setForeground(Color.black);
            }else{
                transmissiontype.setForeground(Color.red);
            }
            if(!getDistributerName().equals("")){
                distributorname.setForeground(Color.black);
            }else{
                distributorname.setForeground(Color.red);
            }
            return true;
        }
        return false;
    }
    
    public boolean buyElectricCarValidation(){
        if(getCarId().equals("") || getCarBrand().equals("") || getCarName().equals("") || getCarPrice().equals("") || getCarColor().equals("") || getCustomerName().equals("") || getBatteryWarranty().equals("") || getRange().equals("") || getRechargeTime().equals("") || getBookedDate().equals("")){
            if(!getCarId().equals("")){
                carid.setForeground(Color.black);
            }else {
                carid.setForeground(Color.red);
            }
            if(!getCarBrand().equals("")){
                carbrand.setForeground(Color.black);
            }else{
                carbrand.setForeground(Color.red);
            }
            if(!getCarName().equals("")){
                carname.setForeground(Color.black);
            }else{
                carname.setForeground(Color.red);
            }
            if(!getCarColor().equals("")){
                carcolor.setForeground(Color.black);
            }else{
                carcolor.setForeground(Color.red);
            }
            if(!getCarPrice().equals("")){
                carprice.setForeground(Color.black);
            }else{
                carprice.setForeground(Color.red);
            }
            if(!getCustomerName().equals("")){
                customername.setForeground(Color.black);
            }else{
                customername.setForeground(Color.red);
            }
               if(!getBatteryWarranty().equals("")){
                batterywarrenty.setForeground(Color.black);
            }else{
                batterywarrenty.setForeground(Color.red);
            }
            if(!getBatteryCapacity().equals("")){
                batterycapacity.setForeground(Color.black);
            }else{
                batterycapacity.setForeground(Color.red);
            }
            if(!getRange().equals("")){
                ran_ge.setForeground(Color.black);
            }else{
                ran_ge.setForeground(Color.red);
            }
            return true;
        }
        return false;
        
    }
    
    public boolean sellElectricCarValidation(){
        if(getCarId().equals("") || getCustomerName().equals("")){
            if(!getCarId().equals("")){
                carid.setForeground(Color.black);
            }else {
                carid.setForeground(Color.red);
            }
            if(!getCustomerName().equals("")){
                customername.setForeground(Color.black);
            }else{
                customername.setForeground(Color.red);
            }
            return true;
        }
        return false;
    }
    
    public void resetAllFields(){
        carID.setText("");
        carid.setForeground(Color.black);
        carName.setText("");
        carname.setForeground(Color.black);
        carBrand.setText("");
        carbrand.setForeground(Color.black);
        carColor.setText("");
        carcolor.setForeground(Color.black);
        carPrice.setText("");
        carprice.setForeground(Color.black);
        distributorName.setText("");
        distributorname.setForeground(Color.black);
        fuelType.setText("");
        fueltype.setForeground(Color.black);
        noOfSeats.setText("");
        noofseats.setForeground(Color.black);
        mileage.setText("");
        mile_age.setForeground(Color.black);
        transmissionType.setText("");
        transmissiontype.setForeground(Color.black);
        cusName.setText("");
        customername.setForeground(Color.black);
        batteryCapacity.setText("");
        batterycapacity.setForeground(Color.black);
        batteryWarrenty.setText("");
        batterywarrenty.setForeground(Color.black);
        range.setText("");
        ran_ge.setForeground(Color.black);
        rechargeTime.setText("");
        rechargetime.setForeground(Color.black);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addElectricCar;
    private javax.swing.JButton addFuelCar;
    private javax.swing.JTextField batteryCapacity;
    private javax.swing.JTextField batteryWarrenty;
    private javax.swing.JLabel batterycapacity;
    private javax.swing.JLabel batterywarrenty;
    private javax.swing.JComboBox<String> bookedDate;
    private javax.swing.JButton buyElectricCar;
    private javax.swing.JTextField carBrand;
    private javax.swing.JTextField carColor;
    private javax.swing.JTextField carID;
    private javax.swing.JTextField carName;
    private javax.swing.JTextField carPrice;
    private javax.swing.JLabel carbrand;
    private javax.swing.JLabel carcolor;
    private javax.swing.JLabel carid;
    private javax.swing.JLabel carname;
    private javax.swing.JLabel carprice;
    private javax.swing.JButton clear;
    private javax.swing.JTextField cusName;
    private javax.swing.JLabel customername;
    private javax.swing.JButton displayInfo;
    private javax.swing.JTextField distributorName;
    private javax.swing.JLabel distributorname;
    private javax.swing.JTextField fuelType;
    private javax.swing.JLabel fueltype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mile_age;
    private javax.swing.JTextField mileage;
    private javax.swing.JTextField noOfSeats;
    private javax.swing.JLabel noofseats;
    private javax.swing.JComboBox<String> purchaseDate;
    private javax.swing.JButton purchaseFuelCar;
    private javax.swing.JLabel ran_ge;
    private javax.swing.JTextField range;
    private javax.swing.JTextField rechargeTime;
    private javax.swing.JLabel rechargetime;
    private javax.swing.JButton sellElectricCar;
    private javax.swing.JTextField transmissionType;
    private javax.swing.JLabel transmissiontype;
    // End of variables declaration//GEN-END:variables
}
