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
public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String queQuan;

    public Nguoi(String hoTen, int tuoi, String queQuan) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoTen=" + hoTen + ", tuoi=" + tuoi + ", queQuan=" + queQuan + '}';
    }
    
    public void addInfor() {
        
    }
    
    public void printInfor() {
        System.out.println(""+toString());
    }
}
