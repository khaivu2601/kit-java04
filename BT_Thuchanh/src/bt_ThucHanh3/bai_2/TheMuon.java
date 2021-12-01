/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_ThucHanh3.bai_2;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class TheMuon extends SinhVien{
    private String soPhieu;
    private String soHieusach;

    public TheMuon(){
        
    }
    public TheMuon(String soPhieu, String soHieusach, String hoTen, String lop, int namSinh) {
        super(hoTen, lop, namSinh);
        this.soPhieu = soPhieu;
        this.soHieusach = soHieusach;
    }

    public String getSoPhieu() {
        return soPhieu;
    }

    public void setSoPhieu(String soPhieu) {
        this.soPhieu = soPhieu;
    }

    public String getSoHieusach() {
        return soHieusach;
    }

    public void setSoHieusach(String soHieusach) {
        this.soHieusach = soHieusach;
    }

    @Override
    public void nhapTT() {
        super.nhapTT();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phiểus muợn : ");
        soPhieu = sc.nextLine();
        System.out.println("nhập số hiệu sách : ");
        soHieusach  = sc.nextLine();
    }
    
    @Override
    public void xuatTT(){
        super.xuatTT();
        System.out.println("số PM: "+soPhieu);
        System.out.println("số hiệu sách : "+soHieusach);
    }

    

    
}
