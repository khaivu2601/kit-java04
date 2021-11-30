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
public class bai4 {
    public static boolean isPrime(int m) {
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon n: ");
        for (int j = 2; j <= n; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
    }
/*    public static boolean isPrime(int m) {

        int i = 2;
        while (i <= Math.sqrt(m)) {
            if (m % i++ == 0) {

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m: ");
        m = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon m: ");
        int j = 2;
        while (j <= m) {
            if (isPrime(j++)) {
                System.out.println(j - 1);
            }
        }
    }*/
/*     public static boolean isPrime(int m) {

        int i = 1;
        if (m == 2) {
            return true;
        }
        do {
            if (m % ++i == 0) {

                return false;
            }
        } while ((i) <= Math.sqrt(m));
        return true;
    }

    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap m: ");
        m = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon m: ");
        int j = 2;
        while (j <= m) {
            if (isPrime(j++)) {
                System.out.println(j - 1);
            }
        }
    }*/
}
