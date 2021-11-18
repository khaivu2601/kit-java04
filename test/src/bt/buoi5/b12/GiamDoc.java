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
public class GiamDoc extends Person{
    private int tienTieu;

    public int getTienTieu() {
        return tienTieu;
    }

    public void setTienTieu(int tienTieu) {
        this.tienTieu = tienTieu;
    }
    
    public void addInfor(){
        super.addInfor();
        System.out.println("nhập số tiền tiêu hàng tháng ;");
        Scanner sc = new Scanner(System.in);
        tienTieu=sc.nextInt();
    }
    public void showInfor(){
        super.showInfor();
        System.out.println("số tiền tiêu hàng tháng: "+tienTieu);
    }
}

