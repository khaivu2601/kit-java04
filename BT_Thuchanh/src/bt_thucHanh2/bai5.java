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
//Xây dựng lớp ToanHoc, với n là sốnguyên dương.
//1. Kiểm tra xem một sốnguyên ncó phải là sốnguyên tốhay không ? 
//2.Kiểm tra xem một nguyên n có phải là sốhoàn hảo hay không ?
//3. In ra các sốchính phương <=n (n nhập tửbàn phím).
//4.Tính phần tửthứn của dãy Fibonaci: public static int tinhFibo(int n)
public class bai5 {
     public static void isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            System.out.printf("%d ko phải là SNt \n",n);
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                System.out.printf("%d ko phải là SNt \n",n);
                
            }
        }
        System.out.printf("%d là SNt\n",n);     
    }
    
    public static void soHoanHao(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) //tổng các ước số của a
            {
                sum += i;
            }
        }
        //nếu tổng ước số sum = a thì a là số hoàn hảo
        if (sum == n) {
            System.out.println(n + " là số hoàn hảo");
        } //ngược lại không phải là số hoàn hảo
        else {
            System.out.println(n + " không phải là số hoàn hảo");
        }
    }
    
    public static void soChinhPhuong(int n) {
        System.out.printf("số cp :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if( j*j == i){
                    System.out.printf("%d ",i);
                }
            }
        }
    }
    
    public static int fibonacci(int n) {
        int f0 = 2;
        int f1 = 1;
        int fn = 0;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n");
        int n = sc.nextInt();
        //isPrimeNumber(n);
        //soHoanHao(n);
        soChinhPhuong(n);
    }
}
