/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_ThucHanh4.bai_2;

/**
 *
 * @author Khaivu
 */
public class Main {
    public static void main(String[] args) {
        Diem d1 = new Diem(3, 7);
        Diem d2 = new Diem(9, 3);
        double a = d1.getX()-d2.getX();
        double b = d1.getX()-d2.getY();
        double d = Math.sqrt( a * a + b * b );
        System.out.println("khoảng cách giữa 2 điểm : "+d);
    }
}
