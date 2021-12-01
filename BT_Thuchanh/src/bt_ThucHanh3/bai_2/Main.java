/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_ThucHanh3.bai_2;

import java.util.ArrayList;

/**
 *
 * @author Khaivu
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<TheMuon> t1 = new ArrayList<TheMuon>();
        TheMuon tc = new TheMuon();
        tc.nhapTT();
        t1.add(tc);
        System.out.println("================");
        for (int i = 0; i < t1.size(); i++) {
            t1.get(i).xuatTT();
            
        }
    }
}
