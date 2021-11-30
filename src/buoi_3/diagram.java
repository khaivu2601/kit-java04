/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_3;

/**
 *
 * @author Khaivu
 */
public class diagram {
    public float length,width;
//=================================
    public diagram() {
        this.length = (float) 7.2;
        this.width = (float) 3.2;
    }

    public diagram(float length, float width) {
        this.length = length;
        this.width = width;
    }

//==================================   
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
    public void showInfor(){
        System.out.println("chiều dài là : "+getLength());
        System.out.println("chiều rộng là: "+getWidth());
        System.out.println("chu vi là : "+(getLength()+getWidth())*2);
        System.out.println("diện tích là : "+getLength()*getWidth());
    }
    
}
