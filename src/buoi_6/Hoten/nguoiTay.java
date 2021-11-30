/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_6.Hoten;

/**
 *
 * @author Khaivu
 */
public class nguoiTay extends nguoiViet{
    
    public nguoiTay(String ho, String ten) {
        super(ho, ten);
    }
    
    public void showInfor(){
        System.out.println("họ tên người nước ngoài : "+ ten+" "+ ho);
    }
}
