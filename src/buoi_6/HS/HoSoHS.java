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
public class HoSoHS extends Nguoi{
    private String lop;
    private int kyHoc;
    
    public HoSoHS(String hoTen, int tuoi, String queQuan,String lop,int kyHoc) {
        super(hoTen, tuoi, queQuan);
        this.kyHoc=kyHoc;
        this.lop=lop;
    }

    

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }
    
    @Override
    public void addInfor(){
        
    }

    @Override
    public String toString() {
        return "HoSoHS{"+ super.toString() + "lop=" + lop + ", kyHoc=" + kyHoc + '}';
    }
    
    public void printfInfor() {
        System.out.println(""+ toString());
    }
    
}
