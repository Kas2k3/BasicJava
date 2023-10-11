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
public class Bai27_TryCatchFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("Nhap vao so nguyen n: ");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Nhap du lieu khong dung");
        } finally { //Co the co hoac khong
            System.out.println("Finally!");
        }
        System.out.println("Gia tri nhap la: "+n);
        System.out.println("Ket thuc chuong trinh");     
    }  
}
