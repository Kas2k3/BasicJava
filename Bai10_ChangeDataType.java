/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package JavaBasic;

/**
 *
 * @author Phuoc
 */
public class Bai10_ChangeDataType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 100;
        int b = 2;
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        //Ep kieu ngam dinh
        float c = a;
        float d = b;
        
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        
        //Ep kieu tuong minh
        float e = 3.5f;
        float f = 9.5f;
        
        System.out.println("e = "+e);
        System.out.println("f = "+f);
        
        int g = (int)e;
        int h = (int)f;
        
        System.out.println("g = "+g);
        System.out.println("h = "+h);
        
        //Ep kieu giưa bien nguyen thuy va doi tuong
        int x = new Integer(32);
        System.out.println("x = "+x);
    }
    
}
