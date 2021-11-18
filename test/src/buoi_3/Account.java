/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_3;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class Account {
    public int ID,Balence;
    public String name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBalence() {
        return Balence;
    }

    public void setBalence(int Balence) {
        this.Balence = Balence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Scanner sc= new Scanner(System.in);
    public int Balence(){
        System.out.println("biến động số dư (+(true) or -(false))");
        boolean n=sc.nextBoolean();
        if(n==true){
            System.out.println("tắng số dư ");
            int a= sc.nextInt();
            return Balence+a;
        }else
            if(n==false){
                System.out.println("giảm số dư ");
            int a= sc.nextInt();
            return Balence-a;
            }
        return Balence;
    }
    public void showInfor(){
        System.out.println("ID: "+getID());
        System.out.println("Name: "+getName());
        System.out.println("số dư: "+Balence() );
    }
}
