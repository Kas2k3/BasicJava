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
public class Bai22_BangCuuChuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println("------");
        }
    }
    
}
