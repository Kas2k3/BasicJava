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
public class Bai25_DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao n > 0: ");
            n = sc.nextInt();
        }while(n <= 0);
    }
    
}
