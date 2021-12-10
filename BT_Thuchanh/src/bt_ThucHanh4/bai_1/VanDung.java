/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_ThucHanh4.bai_1;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class VanDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào n: ");
        int n=sc.nextInt();
        boolean a = ToanHoc.kiemtraNguyenTo(n);
        if (a==true) {
            System.out.println("SNT");
        }else
            System.out.println("ko phải SNT");
        
        ToanHoc.kiemtraHoanHao(n);
        ToanHoc.kiemtraSoChinhPhuong(n);
        ToanHoc.tinhTong(n);
    }
}
