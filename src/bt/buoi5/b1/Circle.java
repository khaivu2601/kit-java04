/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.buoi5.b1;

/**
 *
 * @author Khaivu
 */
public class Circle {
    public String Color;
    public int Radius;
//==============================================
    public Circle( int Radius) {
        this.Color = "red";
        this.Radius = Radius;
    }

    public Circle() {
        this.Color = "red";
        this.Radius = 1;
    }

    public Circle(String Color, int Radius) {
        this.Color = Color;
        this.Radius = Radius;
    }

//========================================================   
    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int Radius) {
        this.Radius = Radius;
    }
    
    public void showInfor(){
        System.out.println("Color: "+getColor());
        System.out.println("Radius: "+getRadius());
    }

    void Radius(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
