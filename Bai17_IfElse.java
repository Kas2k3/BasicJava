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
public class Bai17_IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        n = sc.nextInt();
        
        //Kiem tra tinh chan le
        if(n%2 == 0) {
            System.out.println(n + " la so chan");
        }
        else {
            System.out.println(n+" la so le");
        }
    }
    
}
