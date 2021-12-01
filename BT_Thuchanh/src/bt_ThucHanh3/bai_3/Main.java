/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_ThucHanh3.bai_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BienLai> BL = new ArrayList<>();
        System.out.println("nhập số lượng hóa đơn: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập hóa đơn số "+ (i+1));
            BienLai b1 = new BienLai();
            b1.nhapTT();
            BL.add(b1);
        }
        for (int i = 0; i < BL.size(); i++) {
            BL.get(i).xuatTT();
            
        }
    }
}
