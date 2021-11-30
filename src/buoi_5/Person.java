/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_5;

/**
 *
 * @author Khaivu
 */
public class Person {
    private String name;
    private int yob;
    private String address;

    public Person(String name, int yob, String address) {
        this.name = name;
        this.yob = yob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", yob=" + yob + ", address=" + address + '}';
    }
    
    public void showInfor(){
        System.out.println("name=" + name + ", yob=" + yob + ", address=" + address + '}');
    }
}
