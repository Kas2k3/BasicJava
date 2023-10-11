package JavaBasic;
import java.util.Scanner;

public class Bai9_NhapDuLieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho va ten");
        String hoVaTen = sc.nextLine();
        
        System.out.println("Nhap ma so sinh vien");
        long maSinhVien = sc.nextLong();
        
        System.out.println("Nhap vao diem thi");
        float diemThi = sc.nextFloat();
        
        System.out.println("-----");
        System.out.println("Ho va Ten: "+hoVaTen);
        System.out.println("Masinhvien: "+maSinhVien);
        System.out.println("Diem thi: "+diemThi);             
    }
    
}
