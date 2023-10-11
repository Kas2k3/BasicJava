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
public class Bai26_2_Continue {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        int max = 100;
//        for (int i = 0; i < max; i++) {
//            if (i < 50)
//                continue;
//            System.out.println(i);
//        }
//    }
//    
//}

    public static void main(String[] args) {
        outer: for (int i = 2; i <= 9; i++){
            for (int j = 1; j <= 10; j++) {
                if (j > 5)
                    continue outer;
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println("------");
        }
    }
    
}

