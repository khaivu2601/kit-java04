/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_ThucHanh4.bai_1;

/**
 *
 * @author Khaivu
 */
public class ToanHoc {

    public static boolean kiemtraNguyenTo(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void kiemtraHoanHao(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(n + " là số hoàn hảo");
        } else {
            System.out.println(n + " không phải là số hoàn hảo");
        }
    }
    
    public static void kiemtraSoChinhPhuong(int n){
        double sq = Math.sqrt(n);
        
        if ((sq - Math.floor(sq)) == 0)
            System.out.println(n+ " Là số chính phương");
        else
            System.out.println(n+ " Không phải là số chính phương");
    }
    
    public static void tinhTong(int n){
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + (i/(i+1));
        }
        System.out.println("tổng s :"+String.valueOf(s));
    }
}
