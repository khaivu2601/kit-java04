/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_ThucHanh3.bai_3;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class KhachHang {
    private String hoTen;
    private String soNha;
    private int maSo;

    public KhachHang(String hoTen, String soNha, int maSo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }
    
    public KhachHang( ) {
        
    }
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập hoTen : ");
        hoTen = sc.nextLine();
        System.out.println("nhập địa chỉ : ");
        soNha = sc.nextLine();
        System.out.println("nhập mã số : ");
        maSo = sc.nextInt();
        
    }
    
    public void xuatTT() {
        System.out.println("họ và tên : "+hoTen);
        System.out.println("địa chỉ: "+soNha);
        System.out.println("năm sinh : "+maSo);
    }
}
