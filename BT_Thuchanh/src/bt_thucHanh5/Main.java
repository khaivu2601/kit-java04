/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_thucHanh5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class Main {
    public static void main(String args[]) {
        ArrayList<NhanSu> arrNS = new ArrayList<>();
        int n;
        NhanSu NS;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nhan vien: ");
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++){
            System.out.println("Nhap nhan vien thu " + (i+1) +": ");
            NS = new NhanSu();
            NS.nhapThongTin();
            arrNS.add(NS);
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        }   
        for (int i = 0; i < arrNS.size(); i++){
            System.out.println("\nNhan vien thu " + (i+1) +": ");
            arrNS.get(i).inThongTin();
        }
        }
}
