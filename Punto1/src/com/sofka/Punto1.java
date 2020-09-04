package com.sofka;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cost;

        System.out.print("Enter the distance to travel in kilometers: ");
        int distance = sc.nextInt();

        System.out.print("Enter the number of days of stay: ");
        int stay = sc.nextInt();
        if ( distance >1000 && stay >7){
            cost = ((distance*35.00)-0.3*(distance*35.00));
            System.out.println("The cost of the ticket is: " +cost);
        }else {
            cost = distance*35.00;
            System.out.println("The cost of the ticket is: " +cost);
        }
    }
}
