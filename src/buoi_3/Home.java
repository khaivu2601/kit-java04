/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_3;

/**
 *
 * @author Khaivu
 */
public class Home {
    public int id,salaryMonthly;
    public String firstName,lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalaryMonthly() {
        return salaryMonthly;
    }

    public void setSalaryMonthly(int salaryMonthly) {
        this.salaryMonthly = salaryMonthly;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void showInfor(){
        System.out.println("ID: "+getId());
        System.out.println("firstName: "+getFirstName());
        System.out.println("lastName: "+getLastName());
        System.out.println("Tiền lương: "+getSalaryMonthly());
    }
}
