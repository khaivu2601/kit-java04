/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.buoi5.b12;

/**
 *
 * @author Khaivu
 */
public class main {
    public static void main(String[] args) {
        GiangVien gv = new GiangVien();
        gv.addInfor();
        gv.showInfor();
        GiamDoc gd = new GiamDoc();
        gd.addInfor();
        gd.showInfor();
        Student st = new Student();
        st.addInfor();
        st.showInfor();       
    }
}
