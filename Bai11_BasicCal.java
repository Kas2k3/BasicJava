/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaBasic;
import java.util  .Scanner;
/**
 *
 * @author Phuoc
 */
public class Bai11_BasicCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Khai bao bien
        int a, b;
        
        //Nhap du lieu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a = ");
        a = sc.nextInt();
        System.out.println("Nhap vao b = ");
        b = sc.nextInt();
        
        int tong = a + b;
        System.out.println(a+"+"+b+" = "+tong);
        
        int hieu = a - b;
        System.out.println(a+"-"+b+" = "+hieu);
        
        int thuong = a / b;
        System.out.println(a+"/"+b+" = "+thuong);
        
        int nhan = a * b;
        System.out.println(a+"*"+b+" = "+nhan);
    }
    
}
