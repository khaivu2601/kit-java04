/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_6.SinhVien;

/**
 *
 * @author Khaivu
 */
public class HSChuyenToan extends HocSinh{
    
    public HSChuyenToan(String hoten, String lop, double toan, double ly, double hoa) {
        super(hoten, lop, toan, ly, hoa);
    }
    
    @Override
    public double diemTb() {
        return (toan*2+ly+hoa)/4 ;
    }
    
    @Override
    public void showInfor() {
        System.out.println("HocSinhChuyenToan{" + "hoten=" + hoten + ", lop=" + lop + ", toan=" + toan 
                + ", ly=" + ly + ", hoa=" + hoa +" diemTb= "+diemTb()+ '}');
    }
}
