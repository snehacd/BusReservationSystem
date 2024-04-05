package com.example.BusCurd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Bus {
    @Id
    private String bookingID;
    @Column
    private String passengerName;
    @Column
    private String sourceStop;
    @Column
    private String destinationStop;
    @Column
    private String busNumber;
    @Column
    private String travelDate;
    @Column
    private String seatNumber;

    public Bus() {
    }

    public Bus(String bookingID, String passengerName, String sourceStop, String destinationStop, String busNumber, String travelDate, String seatNumber) {
        this.bookingID = bookingID;
        this.passengerName = passengerName;
        this.sourceStop = sourceStop;
        this.destinationStop = destinationStop;
        this.busNumber = busNumber;
        this.travelDate = travelDate;
        this.seatNumber = seatNumber;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getSourceStop() {
        return sourceStop;
    }

    public void setSourceStop(String sourceStop) {
        this.sourceStop = sourceStop;
    }

    public String getDestinationStop() {
        return destinationStop;
    }

    public void setDestinationStop(String destinationStop) {
        this.destinationStop = destinationStop;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}

