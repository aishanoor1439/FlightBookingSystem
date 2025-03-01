package com.mycompany.mavenproject16;

import java.util.Scanner;

//Class Definition
public class Flight {

    Scanner input = new Scanner(System.in);

//    Attributes
    int flightNo;
    String source;
    String destination;
    int availableSeats;

//  Methods
//  Constructors
    Flight() {
        flightNo = 000;
        source = "";
        destination = "";
        availableSeats = 0;
//        System.out.println("Flight No: " + flightNo);
//        System.out.println("Source: " + source);
//        System.out.println("Destination: " + destination);
//        System.out.println("Available Seats: " + availableSeats);
    }

    Flight(int flightNo, int availableSeats) {
        this.flightNo = flightNo;
        this.availableSeats = availableSeats;
        System.out.println("Updated Flight no: " + flightNo);
        System.out.println("Updated Available Seats: " + availableSeats);
    }

    Flight(int flightNo, int availableSeats, String source, String destination) {
        this.source = source;
        this.destination = destination;
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        this.flightNo = flightNo;
        this.availableSeats = availableSeats;
        System.out.println("Updated Flight no: " + flightNo);
        System.out.println("Updated Available Seats: " + availableSeats);
    }

    public void reserve(int numberOfSeats) {
        System.out.println("Enter the no of seats you want to reserve:");
        numberOfSeats = input.nextInt();
        if (numberOfSeats > availableSeats) {
            int unAvailableSeats = numberOfSeats - availableSeats;
            System.out.println("Sorry! " + unAvailableSeats + " are unavailable.");
        } else {
            System.out.println(numberOfSeats + " Seats resrved successfully out of" + availableSeats + ".");
            this.availableSeats = availableSeats - numberOfSeats;
            System.out.println("Enter the no of reservations you want to cancel: ");
            numberOfSeats = input.nextInt();
            cancel(numberOfSeats);
        }
    }

    public void cancel(int numberOfSeats) {
        this.availableSeats = availableSeats + numberOfSeats;
        System.out.println(numberOfSeats + " Reservations cancelled successfully!");
    }

    public void ToString() {
        System.out.println("Flight no: " + flightNo);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Flight flight = (Flight) obj;
        return this.flightNo == flight.flightNo;
    }

    public void shortAndCapital() {
        if (source.length() <= 3 || destination.length() <= 3) {
            String sr = source.toUpperCase();
            source = sr;
            String dn = destination.toUpperCase();
            destination = dn;
        } else {
            String sr = source.substring(0, 3).toUpperCase();
            source = sr;
            String dn = destination.substring(0, 3).toUpperCase();
            destination = dn;
        }
    }
}
