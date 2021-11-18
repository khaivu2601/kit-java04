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
public class Date {
    Scanner sc= new Scanner(System.in);
    public int Day,Month,Year;

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
    public void nhapInfor(){
        System.out.println("nhập ngày ");
        Day=sc.nextInt();
        System.out.println("nhập tháng ");
        Month=sc.nextInt();
        System.out.println("nhập năm ");
        Year=sc.nextInt();
    }

    public void showInfor(){
        System.out.println("ngày: "+getDay()+" tháng: "+getMonth()+" năm: "+getYear());
    }
}
