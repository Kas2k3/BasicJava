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
public class Bai14_CompareCondition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap a = ");
        a = sc.nextInt();
        System.out.println("Nhap b = ");
        b = sc.nextInt();
        
        //Xuat ket qua so sanh
        System.out.println(a+" == "+b+" : "+(a==b));
        System.out.println(a+" != "+b+" : "+(a!=b));
        System.out.println(a+" < "+b+" : "+(a<b));
        System.out.println(a+" <= "+b+" : "+(a<=b));
        System.out.println(a+" > "+b+" : "+(a>b));
        System.out.println(a+" >= "+b+" : "+(a>=b));
        System.out.println("-----");
        System.out.println("Ca hai so la so chan: "+ (a%2==0 && b%2==0));
        System.out.println("Co it nhat 1 so chan:"+ (a%2==0 || b%2==0));
        
    }
    
}
