/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_6.USB;

/**
 *
 * @author Khaivu
 */
public class Mouse extends USB{
    
    public Mouse(String maHang, double gia, int soLuong) {
        super(maHang, gia, soLuong);
    }

    public Mouse() {
        
    }
    @Override
    public double tinhTien() {
        return super.tinhTien()*0.8;
    }
    @Override
    public void showInfor(){
        System.out.println("Mouse{" + "maHang=" + maHang + ", gia=" + gia + ", soLuong=" 
                + soLuong + ", tổng tiền =" + tinhTien()+ '}');
    }
    
    
}
