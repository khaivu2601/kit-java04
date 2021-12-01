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
public class bai6 {
    //S=1!+2!+3!+......+n!
   public static void tinhTong(int n) {
       int s=0 ;
       int x=1 ;
       for (int i = 1; i <= n; i++) {
               x = x*i;
               s = s+x;
       }
       System.out.println("tổng s = "+s);
    } 
    //Nhập n, nếu n lẻ: tính tổng các sốlẻ<n, nếu n chẵn: tính tổng các sốchẵn<n
   
    public static void tinhTong2(int n) {
        int s=0;
        if(n % 2 == 0){
            for (int i = 0; i < n; i++) {
                if(i % 2 == 0)
                    s = s + i ;
            }
        }else{
            for (int i = 0; i < n; i++) {
                if(i % 2 != 0)
                    s = s + i ;
            }
        }
        System.out.println("tổng s = "+s);
    }
    //tổng dãy
    
    public static void tinhTong3(int n) {
        double s=0 ;
        for (int i = 1; i <= n; i++) {
            s = s + (double)( i / (i+1) );
        }
        System.out.println("tổng s = " +String.valueOf(s));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào n = ");
        int n = sc.nextInt();
        tinhTong(n);
        tinhTong2(n);
        tinhTong3(n);
    }
}
