/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_6.HS;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int choice;
            QuanLy q1 = new QuanLy();
        do {
            printMenu();
            System.out.println("Input your choice(1->6)");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    q1.nhapTT();
                    break;
                case 2:
                    q1.xuatTT();
                    break;
                case 3:
                    q1.search();
                    break;
                case 4:
                    q1.dem();
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("see you again!!!");
                    break;
            }
        } while (choice != 6);
        
    }
    public static void printMenu() {
        System.out.println("=========================");
        System.out.println("||welcom to studentList ||");
        System.out.println("||choose the follow:    ||");
        System.out.println("||1.Add student         ||");
        System.out.println("||2.print student       ||");
        System.out.println("||3.Search the student  ||");
        System.out.println("||4.Search update      ||");
        System.out.println("||5.remove student      ||");
        System.out.println("||6.Quit                ||");
        System.out.println("==========================");
    }
}
