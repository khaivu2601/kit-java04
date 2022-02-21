/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khaivu
 */
public class HoaDon {
    protected String tenKH,tenSP;
    protected int soLuong;
    protected double thanhTien;

    public HoaDon(String tenKH, String tenSP, int soLuong, double thanhTien) {
        this.tenKH = tenKH;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }
    

    public HoaDon() {
      
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "tenKH=" + tenKH + ", tenSP=" + tenSP + ", soLuong=" + soLuong + ", thanhTien=" + thanhTien + '}';
    }

    
    
    public void inHD(){
        System.out.println(""+toString());
    }
}
