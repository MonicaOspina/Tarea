package com.sofka;

import java.util.*;

public class Punto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        int weight, cost;
        int flightReminingCapacity = 18000;
        int maxWeight = 0;
        int minWeight = flightReminingCapacity;
        int amountOfPackages = 0;
        int totalCost = 0;
        int totalWeight = 0;
        int dollarPrice = 3500;

        while (option != 3) {
            mostrarOpciones();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the weight for the package number: " + (amountOfPackages + 1));
                    weight = sc.nextInt();
                    if (weight > flightReminingCapacity) {
                        System.out.print("This package can´t be added as this would exceed the capacity of the plane");
                    }
                    if (weight > 500) {
                        System.out.print("This package exceeds the maximum weight for one single package, please try with another weight.");
                    } else {
                        //Sum the amount of packages loaded
                        amountOfPackages++;
                        totalWeight += weight;

                        //Compare if current package qualifies as max or min weight
                        if (weight > maxWeight) {
                            maxWeight = weight;
                        }
                        if (weight < minWeight) {
                            minWeight = weight;
                        }

                        //Calculate package cost
                        if (weight >= 0 && weight <= 25) {
                            cost = 0;
                            System.out.println("This package is cover free as it does not exceeds 25 Kg");
                            totalCost = totalCost + cost;
                        } else if (weight >= 26 && weight <= 300) {
                            cost = weight * 1500;
                            System.out.println("The cost for this package is: " + cost);
                            totalCost = totalCost + cost;

                        } else if (weight >= 301 && weight <= 500) {
                            cost = weight * 2500;
                            System.out.println("The cost for this package is: " + cost);
                            totalCost = totalCost + cost;
                        }
                        System.out.println("The total weight is: " + totalWeight);
                    }
                    break;

                case 2:
                    System.out.println("The total weight is: " + totalWeight);
                    System.out.println("The flight has a total of: " + amountOfPackages + " packages.");
                    System.out.println("The heaviest package is " + maxWeight + " kilos.");
                    System.out.println("The lightweight package is " + minWeight + " kilos.");
                    System.out.println("The amount collected from packages is:");
                    System.out.println("            $" + totalCost + " pesos.");
                    System.out.println("         or $" + totalCost / dollarPrice + " dollars.");
                    System.out.println("Averge weight per package: " + totalWeight / amountOfPackages);

                    option = 3;
                    System.out.println("Good Bye!");
                    break;
                case 3:
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println(option + " is not an avalible option, please try again.");
            }
        }

    }
    private static void mostrarOpciones(){
        System.out.println("Enter the desired option:");
        System.out.println("1. Add new Package");
        System.out.println("2. Make calculations for the flight");
        System.out.println("3. Cancel");
    }
}
