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
public class Bai13_GanDuLieu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a;
        a = sc.nextFloat();
        System.out.println("a = "+a);
        a += 3;
        System.out.println("a += 3 :"+a);
        a -= 2;
        System.out.println("a -= 2 :"+a);
        a *= 3;
        System.out.println("a *= 3 :"+a);
        a /= 3;
        System.out.println("a /= 3 :"+a);
        a %= 3;
        System.out.println("a %= 3 :"+a);
    }
    
}
