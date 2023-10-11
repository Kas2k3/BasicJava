package JavaBasic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

public class Bai18_PtBacHai {
    public static void main(String[] args) {
        //Phuong trinh bac 2: ax^2 + bx + c = 0
        //Cac bien can co: a, b, c, x1, x2, delta
        /* Neu a == 0 thi bao loi
        B1. delta = b^2 - 4ac
        B2. Kiem tra delta
        2.1. delta < 0 => pt vo nghiem
        2.2. delta == 0 => py co nghiem kep x1 = x2 = -b/3s
        x1 = (-b-sqrt(delta))/(2a)
        x2 = (-b+sqrt(delta))/(2a)
        */
        
        double a, b, c, x1, x2 = 0, delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a = ");
        a = sc.nextDouble();
        System.out.println("Nhap vao b = ");
        b = sc.nextDouble();
        System.out.println("Nhap vao c = ");
        c = sc.nextDouble();
        
        delta = Math.pow(b, 2) - 4*a*c;
        
        if (a == 0) {
            System.out.println("Nhap du lieu sai");
        }
        else {
            if(delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
            }
            else if(delta == 0) {
                x1 = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = "+x1);
            }
            else {
            x1 = ((-b-Math.sqrt(delta))/(2*a));
            x2 = ((-b+Math.sqrt(delta))/(2*a));
            System.out.println("Phuong trinh co nghiem");
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
            }
        }
    }
    
}
