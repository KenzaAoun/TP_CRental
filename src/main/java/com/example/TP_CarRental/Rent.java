package com.example.TP_CarRental;
/**RENT class**/

import java.util.Date;

public class Rent {

    private String plateNumber;
    private Date beginRent;
    private Date endRent;
    private boolean isRented;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Date getBeginRent() {
        return beginRent;
    }

    public void setBeginRent(Date beginRent) {
        this.beginRent = beginRent;
    }

    public Date getEndRent() {
        return endRent;
    }

    public void setEndRent(Date endRent) {
        this.endRent = endRent;
    }
    public Object getRented(boolean b) {return isRented;}
    public void setRented(boolean rented) { this.isRented = isRented; }

    public Rent(String plateNumber, Date endRent, Date beginRent, boolean b) {
        this.plateNumber=plateNumber;
        this.beginRent = beginRent;
        this.endRent = endRent;
        this.isRented = isRented;
    }
    //To display a car's information
    @Override
    public String toString() {
        return "{ begin : " + beginRent+  " ,  end :" + endRent +"}" + "\n PlateNumber ="+ plateNumber + " Rent : "+ isRented;
    }
}

