
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khaivu
 */
public class Student extends Person{
    Scanner sc=new Scanner(System.in);
    private String lop;
    public Student(String lop, String name, String address, String deparment) {
        super(name, address, deparment);
        this.lop = lop;
    }
  
    @Override
    public void xuat() {
        System.out.println("tên:"+super.getName());
        System.out.println("Địa Chỉ:"+super.getAddress());
        System.out.println("Bộ môn:"+super.getDeparment());
        System.out.println("lớp:"+lop);
    }

    @Override
    public void nhap() {
        System.out.println("Tên:");
        name=sc.nextLine();
        System.out.println("Địa Chỉ:");
        address=sc.nextLine();
        System.out.println("Bộ môn:");
     deparment=sc.nextLine();
        System.out.println("lớp học:");
        lop=sc.nextLine();
    }
}
