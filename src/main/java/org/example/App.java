package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        double item1, item2, item3;
        int qty1, qty2, qty3;
        double subtotal, tax, taxRate=.055, total;
        System.out.printf("Enter the price of item 1: ");
        item1 = sc.nextDouble();
        System.out.printf("Enter the quantity of item 1: ");
        qty1 = sc.nextInt();
        System.out.printf("Enter the price of item 2: ");
        item2 = sc.nextDouble();
        System.out.printf("Enter the quantity of item 2: ");
        qty2 = sc.nextInt();
        System.out.printf("Enter the price of item 3: ");
        item3 = sc.nextDouble();
        System.out.printf("Enter the quantity of item 3: ");
        qty3 = sc.nextInt();

        subtotal = (item1 * qty1) + (item2 * qty2) + (item3 * qty3);
        tax = subtotal * taxRate;
        total = tax + subtotal;
        System.out.printf("Subtotal: $%f\nTax: $%f\nTotal: $%f",subtotal,tax,total);


    }
}
