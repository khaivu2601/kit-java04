/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_1;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class khachSan {

    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;
    private Person nguoi;    
    public khachSan() {
        super();
    }
    public khachSan(int soNgayTro, String loaiPhong, double giaPhong, Person nguoi) {
        super();
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.nguoi = nguoi;
    }
     
    public Person getNguoi() {
        return nguoi;
    }
    public void setNguoi(Person nguoi) {
        this.nguoi = nguoi;
    }
    public void nhapThongTinCanQuanLy() {
        Scanner scanner = new Scanner(System.in);
         
        // nhập thông tin khách trọ
        nguoi = new Person();
        nguoi.nhapThongTinKhachTro();
         
        System.out.print("Nhập số ngày trọ: ");
        soNgayTro = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập loại phòng: ");
        loaiPhong = scanner.nextLine();
        System.out.print("Nhập giá phòng: ");
        giaPhong = scanner.nextDouble();
    }
     
    public void hienThiThongTinCanQuanLy() {
        nguoi.hienThiThongTinKhachTro();
        System.out.println("Số ngày trọ: " + soNgayTro);
        System.out.println("Loại phòng: " + loaiPhong);
        System.out.println("Giá phòng: " + giaPhong);
    }
    public double tinhTien() {
        return soNgayTro * giaPhong;
    }
}
