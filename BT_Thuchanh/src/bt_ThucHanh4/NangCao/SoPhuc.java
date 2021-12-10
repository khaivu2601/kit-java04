/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_ThucHanh4.NangCao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class SoPhuc {
    private double phanThuc,phanAo;

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }
    
    public SoPhuc(){
        
    }
    
    public void nhapValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập phần thực : ");
        phanThuc = sc.nextDouble();
        System.out.println("nhập phần ảo : ");
        phanAo = sc.nextDouble();
    }
    
    public void hienValues(){
        System.out.println("số phức là: "+phanThuc+" + "+phanAo+"i");
    }
    
    public static void cong(){
        System.out.println("nhập 2 số phức ");
        ArrayList<SoPhuc> sp = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("nhập số phức thứ "+ (i+1));
            SoPhuc s = new SoPhuc();
            s.nhapValues();
            sp.add(s);
            
        }
        double a = sp.get(0).phanThuc+sp.get(1).phanThuc;
        double b = sp.get(0).phanAo+sp.get(1).phanAo;
        System.out.println("tổng 2  số phức là: "+a+" + "+b+"i");
    }
}
