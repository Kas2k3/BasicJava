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
public class Bai23_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1;
        Scanner sc  = new Scanner(System.in);
        while(x!=0){
            System.out.println("Nhap x = 0 de thoat; Nhap so khac de tiep tuc");
            x = sc.nextInt();
        }
        
        int i = 0;
        while(true) {
            System.out.println(i);
            i++;
            if(i == 10) break;
        }
    }
    
}
