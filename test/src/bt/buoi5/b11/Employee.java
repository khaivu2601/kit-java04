/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.buoi5.b11;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class Employee extends Person{
    private double heSo,tienLuong;
    
    
    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }
    
    public void addInfor(){
        super.addInfor();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập hệ số ");
        heSo=sc.nextDouble();
    }
    
    public void showInfor(){
        super.showInfor();
        System.out.println("hệ số :"+heSo);
        System.out.println("lương: "+tienLuong);
    }
    public double tinhLuong(){
         tienLuong = heSo*1400000;
         return tienLuong;
    }
}
