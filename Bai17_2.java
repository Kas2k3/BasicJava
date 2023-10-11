/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaBasic;
import java.util.Scanner;
/**
 *
 * @author Phuoc
 */
public class Bai17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PTBN: ax + b = 0
        /*
        Neu a = 0
            Neu b = 0 => pt vo so nghiem
            Neu b != 0 => pt vo nghiem
        Neu a != 0
            Co nghiem x = -b/a
        */
    double a, b, x;
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a = ");
        a = sc.nextDouble();
        System.out.println("Nhap b = ");
        b = sc.nextDouble();
        
        if(a == 0) {
            if(b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else {
            x = -b/a;
                System.out.println("Con nghiem x = "+x);
        }
    
    }
    
}
