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
public class Person {
    private String name,sex;
    private int yob;

    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    public void addInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên :");
        name=sc.nextLine();
        System.out.println("nhập giới tính :");
        sex=sc.nextLine();
        System.out.println("nhập tuổi: ");
        yob=Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", sex=" + sex + ", yob=" + yob + '}';
    }

    
    public void showInfor(){
        System.out.println("tên: "+name);
        System.out.println("tuổi : "+yob);
        System.out.println("giới tính : : "+sex);
    }
}
