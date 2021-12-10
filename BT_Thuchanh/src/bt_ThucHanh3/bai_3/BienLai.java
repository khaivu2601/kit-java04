/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_ThucHanh3.bai_3;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class BienLai extends KhachHang{
    private int chiSoCu,chiSoMoi;

    public BienLai(int chiSoCu, int chiSoMoi, String hoTen, String soNha, int maSo) {
        super(hoTen, soNha, maSo);
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public BienLai() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }
    
    @Override
    public void nhapTT() {
        Scanner sc = new Scanner(System.in);
        super.nhapTT();
        System.out.println("nhập chỉ số cũ : ");
        chiSoCu = sc.nextInt();
        System.out.println("nhập chỉ số mới : ");
        chiSoMoi = sc.nextInt();
        
    }
    
    public int tinhTien(){
        return (chiSoMoi - chiSoCu) * 8500;
    }
    @Override
    public void xuatTT() {
        super.xuatTT();
        System.out.println("số tiền điện phải trả là  : "+tinhTien());
        
    }
}
