/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_3;

import bt.buoi5.b1.Circle;
import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Date/Circle/Home/Diagram/Account");
        String key = sc.nextLine();
        switch (key) {
            case "Date":
                Date q = new Date();
                q.nhapInfor();
                q.showInfor();
                break;
            case "Circle":
                Circle c = new Circle();
                c.setColor("red");
                c.setRadius(25);
                c.showInfor();
                break;
            case "Home":
                Home h = new Home();
                h.setFirstName("Vu");
                h.setLastName("khai");
                h.setId(260101);
                h.setSalaryMonthly(3000);
                h.showInfor();
                break;

            case "Diagram":
                diagram d = new diagram();
                d.setLength(20);
                d.setWidth(15);
                d.showInfor();
                break;
            case "Account":
                Account a = new Account();
                a.setBalence(3000);
                a.setName("khai");
                //a.Balence();
                a.showInfor();
                break;
        }
    }

}
