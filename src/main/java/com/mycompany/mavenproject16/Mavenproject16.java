
package com.mycompany.mavenproject16;

public class Mavenproject16 {

    public static void main(String[] args) {
        Flight flight01 = new Flight(1111, 300, "Karachi", "Islamabad");
        flight01.reserve(5);
        flight01.shortAndCapital();
        flight01.ToString();
        Flight flight02 = new Flight(2345, 296, "Karachi", "Islamabad");
        flight02.reserve(5);
        flight02.shortAndCapital();
        flight02.ToString();
        System.out.println(flight01.equals(flight02));
    }
}
