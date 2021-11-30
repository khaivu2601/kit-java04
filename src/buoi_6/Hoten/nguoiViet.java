/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_6.Hoten;

/**
 *
 * @author Khaivu
 */
public class nguoiViet {
    protected String ho;
    protected String ten;

    public nguoiViet(String ho, String ten) {
        this.ho = ho;
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public void showÌnor(){
        System.out.println("họ tên người việt : "+ ho+" "+ ten);
    }
}
