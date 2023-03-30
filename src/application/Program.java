package application;

import entities.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Rent[] rents = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int occupantsQuantity = scn.nextInt();

        for (int i = 0; i < occupantsQuantity; i++) {
            System.out.println("\nRent #" + (i + 1) + ":");

            System.out.print("Name: ");
            scn.nextLine();
            String occupantName = scn.nextLine();

            System.out.print("Email: ");
            String occupantEmail = scn.nextLine();

            System.out.print("Room: ");
            int roomNumber = scn.nextInt();

            rents[roomNumber] = new Rent(occupantName, occupantEmail, roomNumber);
        }

        System.out.println("\nBusy rooms:");

        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.println(rents[i]);
            }
        }
    }
}
