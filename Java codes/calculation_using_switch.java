package com.company;
import java.util.Scanner;
public class calculation_using_switch {
    public static void main(String[] args) {
        System.out.println(" Please Enter 1 to calculate area of circle:  ");
        System.out.println(" Please Enter 2 to calculate area of square:  ");
        System.out.println(" Please Enter 3 to calculate volume of cylinder: ");
        System.out.println("Please note that some parameters:" +
                     "m --> meter:  -->  " +
                  "m2 --> meter square:  -->  " +
                  "m3 --> meter cube: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1 -> {
                System.out.println("Enter the radius of circle in m ");
                double r = sc.nextDouble();
                double area = 3.14 * (r * r);
                System.out.println("area of the circle is in m2:");
                System.out.println(area);
            }
            case 2 -> {
                System.out.println("Enter the  side of square in m ");
                double a = sc.nextDouble();
                double area = a * a;
                System.out.println("area of the square is m2:");
                System.out.println(area);
            }
            case 3 -> {
                System.out.println("Enter the  radius of cylinder in m  ");
                double r1 = sc.nextDouble();
                System.out.println("Enter the  height of cylinder in m  ");
                double h = sc.nextDouble();
                double volume = 3.14 * (r1 * r1) * h;
                System.out.println("Volume of cylinder in m3 is:");
                System.out.println(volume);
            }
            default -> {
                System.out.println("Please Enter the input only 1, 2, 3 ," +
                        "  show that you can use this java program:");
            }
        }

                  System.out.println("Thanks for using java program: " +
                          " Created by Uditya Narayan Tiwari :");

        System.out.println("Have a nice day! Enjoy the life:");

        }
    }

