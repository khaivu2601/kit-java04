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
public class Manager extends Employee{
    private double luongTrachNhiem ;
    
   

   

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }
    
    public void addInfor(){
        Scanner sc = new Scanner(System.in);
        super.addInfor();
        System.out.println("nhập lương trách nhiệm :");
        luongTrachNhiem= sc.nextDouble();
                
    }
    public void showInfor(){
        setTienLuong(tinhLuong()+luongTrachNhiem);
        super.showInfor();
    }
    
    
}
