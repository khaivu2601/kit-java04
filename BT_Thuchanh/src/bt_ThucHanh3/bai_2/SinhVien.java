/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_ThucHanh3.bai_2;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class SinhVien {
     private String hoTen;
    private String lop;
    private int namSinh;

    public SinhVien(String hoTen, String lop, int namSinh) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public SinhVien(){
        
    }
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập hoTen : ");
        hoTen = sc.nextLine();
        System.out.println("nhập địa chỉ : ");
        lop = sc.nextLine();
        System.out.println("nhập năm sinh: ");
        namSinh = sc.nextInt();
    }
    
    public void xuatTT() {
        System.out.println("họ và tên : "+hoTen);
        System.out.println("địa chỉ: "+lop);
        System.out.println("năm sinh : "+namSinh);
    }
}
