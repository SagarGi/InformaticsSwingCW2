package com.sagar.informaticswing;
import javax.swing.JOptionPane;
import java.util.ArrayList;

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
        buyElectricCar = new javax.swing.JButton();
        addElectricCar = new javax.swing.JButton();
        sellElectricCar = new javax.swing.JButton();
        displayInfo = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));
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

        purchaseDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bookedDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addFuelCar.setText("Add Fuel Car");
        addFuelCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFuelCarActionPerformed(evt);
            }
        });

        buyElectricCar.setText("Buy Electric Car");
        buyElectricCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyElectricCarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(purchaseDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(carID)
                            .addComponent(fuelType, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(carColor, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(transmissionType, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(batteryWarrenty, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(carName, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(carPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(noOfSeats)
                            .addComponent(cusName, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(range, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(bookedDate, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(distributorName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mileage, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batteryCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rechargeTime, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addFuelCar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addElectricCar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buyElectricCar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(sellElectricCar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distributorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mileage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transmissionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batteryCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechargeTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batteryWarrenty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(range, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookedDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFuelCar)
                    .addComponent(buyElectricCar)
                    .addComponent(addElectricCar)
                    .addComponent(sellElectricCar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayInfo)
                    .addComponent(clear))
                .addGap(0, 226, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addFuelCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFuelCarActionPerformed
        // TODO add your handling code here:
        if(addFuelCarValidation()){
            JOptionPane.showMessageDialog(null, "Fileds cannot be left Empty!!!");
        }
        
        
    }//GEN-LAST:event_addFuelCarActionPerformed

    private void buyElectricCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyElectricCarActionPerformed
        if(buyElectricCarValidation()){
            JOptionPane.showMessageDialog(null, "Fileds cannot be left Empty!!!");
        }

    }//GEN-LAST:event_buyElectricCarActionPerformed

    private void addElectricCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addElectricCarActionPerformed
        if(addElectricCarValidation()){
            JOptionPane.showMessageDialog(null, "Fileds cannot be left Empty!!!");
        }
    }//GEN-LAST:event_addElectricCarActionPerformed

    private void sellElectricCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellElectricCarActionPerformed
        if(sellElectricCarValidation()){
            JOptionPane.showMessageDialog(null, "Fileds cannot be left Empty!!!");
        }
    }//GEN-LAST:event_sellElectricCarActionPerformed

    private void displayInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayInfoActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        resetAllFields();
    }//GEN-LAST:event_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
        if(getCarId().equals("") || getCarBrand().equals("") || getCarName().equals("") || getCarPrice().equals("") || getFuelType().equals("")|| getSeatNo().equals("") || getMileage().equals("")){
            return true;
        }
        return false;
    }
    
    public boolean addElectricCarValidation(){
        if(getCarId().equals("") || getCarBrand().equals("") || getCarName().equals("") || getCarPrice().equals("") || getBatteryCapacity().equals("")){
            return true;
        }
        return false;
    }
    
    public boolean purchaseFuelCarValidation(){
        if(getCarId().equals("") || getCarBrand().equals("") || getCarName().equals("") || getCarColor().equals("") || getTranmissionType().equals("") || getDistributerName().equals("") || getPurchaseDate().equals("") || getBookedDate().equals("")){
            return true;
        }
        return false;
    }
    
    public boolean buyElectricCarValidation(){
        if(getCarId().equals("") || getCarBrand().equals("") || getCarName().equals("") || getCarPrice().equals("") || getCarColor().equals("") || getCustomerName().equals("") || getBatteryWarranty().equals("") || getRange().equals("") || getRechargeTime().equals("") || getBookedDate().equals("")){
            return true;
        }
        return false;
        
    }
    
    public boolean sellElectricCarValidation(){
        if(getCarId().equals("") || getCustomerName().equals("")){
            return true;
        }
        return false;
    }
    
    public void resetAllFields(){
        
    }
    
    public void loopCarObjects(ArrayList<Car> cars){
        
        for(Car car : cars){
            System.out.println(car.getCarName());
            System.out.println(car.getCarColor());
            System.err.println(((FuelCar)car).getFuelType());
        }
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addElectricCar;
    private javax.swing.JButton addFuelCar;
    private javax.swing.JTextField batteryCapacity;
    private javax.swing.JTextField batteryWarrenty;
    private javax.swing.JComboBox<String> bookedDate;
    private javax.swing.JButton buyElectricCar;
    private javax.swing.JTextField carBrand;
    private javax.swing.JTextField carColor;
    private javax.swing.JTextField carID;
    private javax.swing.JTextField carName;
    private javax.swing.JTextField carPrice;
    private javax.swing.JButton clear;
    private javax.swing.JTextField cusName;
    private javax.swing.JButton displayInfo;
    private javax.swing.JTextField distributorName;
    private javax.swing.JTextField fuelType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mileage;
    private javax.swing.JTextField noOfSeats;
    private javax.swing.JComboBox<String> purchaseDate;
    private javax.swing.JTextField range;
    private javax.swing.JTextField rechargeTime;
    private javax.swing.JButton sellElectricCar;
    private javax.swing.JTextField transmissionType;
    // End of variables declaration//GEN-END:variables
}
