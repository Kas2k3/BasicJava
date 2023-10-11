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
public class Bai26_Break {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        int out, in = 0;
//        for (out = 0; out < 10; out++) {
//            for (in = 0; in < 10; in++) {
//                if (in > 10) break;
//            }
//            System.out.println("Ben trong vong lap out: out = "+out+" in = "+in);
//        }
//        System.out.println("Ben ngoai vong lap out: out = "+out+" in = "+in);
//    }

    public static void main(String[] args) {
        int out, in = 0;
        outer: for (out = 0; out < 10; out++) {
            for (in = 0; in < 20; in++ ) {
                if (in > 10)
                    break outer;
            }
            System.out.println("Ben trong vong lap: out = "+out+" in = "+in);
        }
        System.out.println("Ben ngoai vong lap: out = "+out+" in = "+in);
    }
}