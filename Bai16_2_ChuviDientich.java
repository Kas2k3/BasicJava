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
public class Bai16_2_ChuviDientich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r, dienTich, chuVi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh r: ");
        r = sc.nextDouble();
        
        //Tinh chu vi
        chuVi = 2*Math.PI*r;
        System.out.println("Chu vi = "+chuVi);
        System.out.println("Chu vi = "+Math.round(chuVi)); //Lam tron
        System.out.println("Chu vi = "+Math.round(chuVi*100.0)/100.0);//Lam tron 2 chu so sau dau phay
        
        //Tinh dien tich
        dienTich = Math.PI * Math.pow(r, 2);
        System.out.println("Dien tich = "+dienTich);
        System.out.println("Dien tich = "+Math.round(dienTich));
    }
    
}
