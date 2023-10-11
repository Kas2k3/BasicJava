/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaBasic;

/**
 *
 * @author Phuoc
 */
public class Bai26_3_Return {

    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++){
            for (int j = 1; j <= 10; j++) {
                if (j > 5)
                    return;
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println("------");
        }
        System.out.println("ACB");
    }
    
}
