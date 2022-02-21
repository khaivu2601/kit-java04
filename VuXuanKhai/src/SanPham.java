
import java.time.DateTimeException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Khaivu
 */
public class SanPham {

    protected String maSP, tenSP;
    protected double donGia;
    protected String ngaySX;
    protected int soLuong;

    public SanPham() {

    }

    public SanPham(String maSP, String tenSP, double donGia, String ngaySX, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public void nhapTTSP() {
        Scanner sc = new Scanner(System.in);
   
        System.out.println("nhập tên sản phẩm: ");
        tenSP = sc.nextLine();
        System.out.println("nhập ngày sản xuất: ");
        ngaySX = sc.nextLine();
        System.out.println("nhập đơn giá: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.println("nhập số lượng hàng: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", donGia=" + donGia + ", ngaySX=" + ngaySX + ", soLuong=" + soLuong + '}';
    }

    public void inTTSP() {
        System.out.println("" + toString());
    }
    
    public void changeSoLuong(int soLuong){
        this.soLuong += soLuong;
    }
}
