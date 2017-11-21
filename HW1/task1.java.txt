package com.edu;

import java.util.Scanner;
public class CircleProgram {
   static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.print("¬вед≥ть рад≥ус: ");
      double radius = sc.nextDouble();
      double area = Math.PI * (radius * radius);
      System.out.println("ѕлоща круга = " + area);
      double circlePerumetr= Math.PI * 2*radius;
      System.out.println("–ериметр круга = " + circlePerumetr) ;
   }
}