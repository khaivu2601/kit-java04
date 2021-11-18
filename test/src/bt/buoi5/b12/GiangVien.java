/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.buoi5.b12;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class GiangVien extends Person{
    private int luong;

    public int getLuong() {
        return luong;
    }

    public void setLuong( int luong) {
        this.luong = luong;
    }
    
    public void addInfor(){
        super.addInfor();
        System.out.println("nhập tiền lương ;");
        Scanner sc = new Scanner(System.in);
        luong=sc.nextInt();
    }
    public void showInfor(){
        super.showInfor();
        System.out.println("tiền lương: "+luong);
    }
}

