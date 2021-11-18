/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;  // số khách trọ
        khachSan khachSan;
         
        // tạo 1 ArrayList lưu thông tin khách trọ
       ArrayList<khachSan> arrKhachSan = new ArrayList<>();
         
        System.out.println("Nhập số lượng khách trọ: ");
        n = Integer.parseInt(scanner.nextLine());
         
        for (int i = 0; i < n; i++) {
            khachSan = new khachSan();
            System.out.println("Nhập thông tin khách hàng thứ " + (i+1) + ":");
            khachSan.nhapThongTinCanQuanLy();
            arrKhachSan.add(khachSan);
        }
         
        // hiển thị danh sách khách trọ
        for (int i = 0; i < arrKhachSan.size(); i++) {
            System.out.println("\nThông tin khách hàng thứ " + (i+1) + ": ");
            arrKhachSan.get(i).hienThiThongTinCanQuanLy();
        }
         
        // tính tiền phòng khi khách hàng trả phòng
        System.out.println("\nNhập số chứng minh nhân dân của khách trả phòng: ");
        String tim = scanner.nextLine();
        for (int i = 0; i < arrKhachSan.size(); i++) {
            if (arrKhachSan.get(i).getNguoi().getSoCMND().equalsIgnoreCase(tim)) {
                System.out.println("Số tiền phòng = " + arrKhachSan.get(i).tinhTien());
            }
        }
    }
}
