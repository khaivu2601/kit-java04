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
public class QuanLy {
    private Scanner sc = new Scanner(System.in);
    private HoSoHS[] hs = new HoSoHS[500];
    private int n = 0 ;
    public void nhapTT() {
        String hoTen, queQuan, lop;
        int tuoi, kyHoc;
        System.out.println("bạn muốn nhập mấy sinh viên ? ");
        
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("nhập sinh viên thứ " + (n + 1));
            System.out.println("nhập họ tên : ");
            hoTen = sc.nextLine();
            System.out.println("nhập tuổi : ");
            tuoi = Integer.parseInt(sc.nextLine());
            System.out.println("nhập địa chỉ : ");
            queQuan = sc.nextLine();
            System.out.println("nhập lớp :");
            lop = sc.nextLine();
            System.out.println("nhập kỳ học : ");
            kyHoc = Integer.parseInt(sc.nextLine());
            hs[n] = new HoSoHS(hoTen, tuoi, queQuan,lop,kyHoc);
            n++;
        }
    }

    public void xuatTT() {
        
        for (int i = 0; i < n; i++) {
            hs[i].printfInfor();
            System.out.println(""+hs[i].getTuoi());

        }
    }
    public void search(){
        
        System.out.println("nhập tuổi muốn tìm kiếm : ");
        int a = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            if(hs[i].getTuoi() == a){
                hs[i].printfInfor();
                
            }
        }
        
    }
    public void dem() {
        
        System.out.println("nhập tuổi muốn tìm kiếm và quê quán : ");
        int a = Integer.parseInt(sc.nextLine());
        String m = sc.nextLine();
        int dem=0;
        for (int i = 0; i < n; i++) {
            if(hs[i].getTuoi() == a && (hs[i].getQueQuan().equalsIgnoreCase(m))){
                dem++;
            }
        }
        System.out.printf("có %d sinh viên %d tuổi và quê ở %s",dem,a,m);
    }
}
