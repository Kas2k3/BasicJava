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
public class Bai24_DecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen n > 0");
        n = sc.nextInt();
        
        String nhiPhan = "";
        while(n > 0) {
            nhiPhan = (n%2) + nhiPhan;
            n = n/2;
        }
        System.out.println("He nhi phan cua so n la: "+nhiPhan);
        
        //Chia lien tuc cho 2 lay phan du
        //Dao nguoc chuoi => ket qua
    }
    
}
