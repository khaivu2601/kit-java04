/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_ThucHanh3.bai_1;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class Nguoi {

    private String hoTen;
    private String diaChi;
    private int namSinh;

    public Nguoi(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public Nguoi(){
        
    }

    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập hoTen : ");
        hoTen = sc.nextLine();
        System.out.println("nhập địa chỉ : ");
        diaChi = sc.nextLine();
        System.out.println("nhập năm sinh: ");
        namSinh = sc.nextInt();
    }
    
    public void xuatTT() {
        System.out.println("họ và tên : "+hoTen);
        System.out.println("địa chỉ: "+diaChi);
        System.out.println("năm sinh : "+namSinh);
    }
}
