/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_2;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Khaivu
 */
public class Person {
    public String name,address,country;
    public int yob;

    public Person() {
        this.name = "KMa-301";
        this.address = "namdinh";
        this.country = "vN";
        this.yob = 2001;
    }

    public Person(String name, String address, String country, int yob) {
        this.name = name;
        this.address = address;
        this.country = country;
        this.yob = yob;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYob() {
        return yob;
    } 

    public void setYob(int yob) {
        this.yob = yob;
    }
    
    public void xuatInfor(){
        System.out.println("name: "+getName());
        System.out.println("namSinh: "+getYob());
        System.out.println("quocTich: "+getCountry());
        System.out.println("diaChi: "+getAddress());
    }
    
    public void tuoi(){
        LocalDate localdate= LocalDate.now();
        int year = localdate.getYear();
        System.out.println("tuoi: "+(year-getYob()));
    }
    
    public void xuatInfor( String name){
        System.out.println("name: "+name);
        System.out.println("namSinh: "+getYob());
        System.out.println("quocTich: "+getCountry());
        System.out.println("diaChi: "+getAddress());
    }
}
