/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_thucHanh5;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class NhanSu extends Nguoi {

    String maNhanSu;
    double heSoChucVu;
    double heSoLuong;
    double luongCoBan;
    double luong;

    public NhanSu() {
        super();
    }

    public NhanSu(String maNhanSu, double heSoChucVu, double heSoLuong, double luongCoBan, double luong) {
        this.maNhanSu = maNhanSu;
        this.heSoChucVu = heSoChucVu;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
        this.luong = luong;
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhap ma nhan su: ");
        maNhanSu = sc.nextLine();
        System.out.println("Nhap he so chuc vu: ");
        heSoChucVu = sc.nextDouble();
        System.out.println("Nhap he so luong: ");
        heSoLuong = sc.nextDouble();
        System.out.println("Nhap luong co ban: ");
        luongCoBan = sc.nextDouble();
        
    }

    public  double tinhLuong() {
        return (heSoChucVu + heSoLuong) * luongCoBan - heSoLuong * luongCoBan * 0.05;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Ma nhan su: " + maNhanSu);
        System.out.println("He so chuc vu: " + heSoChucVu);
        System.out.println("He so Luong: " + heSoLuong);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.printf("lương: %1f " , tinhLuong());
    }

}
