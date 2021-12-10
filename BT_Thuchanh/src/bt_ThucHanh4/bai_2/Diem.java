/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt_ThucHanh4.bai_2;

/**
 *
 * @author Khaivu
 */
public class Diem {
    private double x,y;

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Diem(){
        
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void inTTDiem(){
        System.out.println("tọa độ x: "+x+"tọa độ y: "+y);
    }
    
    
}
