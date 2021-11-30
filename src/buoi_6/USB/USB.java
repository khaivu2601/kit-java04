/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_6.USB;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class USB {
    protected String maHang;
    protected double gia;
    protected int soLuong;

    public USB(String maHang, double gia, int soLuong) {
        this.maHang = maHang;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public USB() {
        
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public void addInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã hàng :");
        maHang=sc.nextLine();
        System.out.println("nhập đơn giá : ");
        gia=Double.parseDouble(sc.nextLine());
        System.out.println("nhập số lượng : ");
        soLuong=Integer.parseInt(sc.nextLine());
    }
    
    public double tinhTien() {
        return gia*soLuong;
    }

    @Override
    public String toString() {
        return "USB{" + "maHang=" + maHang + ", gia=" + gia + ", soLuong=" + soLuong + ", tổng tiền =" + tinhTien()+ '}';
    }
    
    public void showInfor() {
        System.out.println("USB{" + "maHang=" + maHang + ", gia=" + gia + ", soLuong=" + soLuong + ", tổng tiền =" + tinhTien()+ '}');
    }
}
