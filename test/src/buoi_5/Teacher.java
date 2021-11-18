/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_5;

/**
 *
 * @author Khaivu
 */
public class Teacher extends Person{
    private String tcode;
    private double salary;
    
    public Teacher(String name, int yob, String address) {
        super(name, yob, address);
    }

    public String getTcode() {
        return tcode;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void showInfor(){
        super.showInfor();
        System.out.println("tcode: "+getTcode());
        System.out.println("salary: "+getSalary());
    }
}
