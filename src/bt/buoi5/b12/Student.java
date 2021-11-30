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
public class Student extends Person {
    private int tienNo;

    public double getTienNo() {
        return tienNo;
    }

    public void setTienNo(int tienNo) {
        this.tienNo = tienNo;
    }
    
    public void addInfor(){
        super.addInfor();
        System.out.println("nhập tiền còn nợ ;");
        Scanner sc = new Scanner(System.in);
        tienNo=sc.nextInt();
    }
    public void showInfor(){
        super.showInfor();
        System.out.println("nợ đọng : "+tienNo);
    }
}

