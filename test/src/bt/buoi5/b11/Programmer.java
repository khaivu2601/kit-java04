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
public class Programmer extends Student{
    private int namKN;

    public int getNamKN() {
        return namKN;
    }

    public void setNamKN(int namKN) {
        this.namKN = namKN;
    }
    
    public void addInfor(){
        super.addInfor();
        System.out.println("nhập số năm kinh nghiệm :");
        Scanner sc =new Scanner(System.in);
        namKN=sc.nextInt();
    }
    
    public void showInfor(){
        super.showInfor();
        System.out.println("số năm kn là : "+ namKN);
    }
}
