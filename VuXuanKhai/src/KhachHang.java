
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khaivu
 */
public class KhachHang {
    protected String maKH,tenKH,diaChi;
    protected int namSinh;

    public KhachHang(String maKH, String tenKH, String diaChi, int namSinh) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public KhachHang(){
        
    }
    
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public void nhapKH(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã khách hàng: ");
        maKH = sc.nextLine();
        System.out.println("nhập tên khách hàng: ");
        tenKH = sc.nextLine();
        System.out.println("nhập năm sinh: ");
        namSinh = Integer.parseInt(sc.nextLine());
        System.out.println("nhập địa chỉ: ");
        diaChi = sc.nextLine();
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", tenKH=" + tenKH + ", diaChi=" + diaChi + ", namSinh=" + namSinh + '}';
    }
    
    public void inKH(){
        System.out.println(""+toString());
    }
}
