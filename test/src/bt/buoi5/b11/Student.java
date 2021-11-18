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
public class Student extends Person{
    private String studentcode;

    public String getStudentcode() {
        return studentcode;
    }

    public void setStudentcode(String studentcode) {
        this.studentcode = studentcode;
    }
    
    public void addInfor(){
        super.addInfor();
        System.out.println("nhập code ;");
        Scanner sc = new Scanner(System.in);
        studentcode=sc.nextLine();
    }
    public void showInfor(){
        super.showInfor();
        System.out.println("studentCode: "+studentcode);
    }
}
