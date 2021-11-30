/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_thucHanh2;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
//Viết các chương trình nhập vào một sốnguyên n và in ra sốnhịphân 
//tương ứng với n.
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số muốn chuyển đổi : ");
        int n = sc.nextInt();
        System.out.printf("%d dưới dạng nhị phân là : %s \n ",n,Integer.toBinaryString(n));
    }
}
