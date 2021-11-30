/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_5;

/**
 *
 * @author Khaivu
 */
public class Student extends Person{
    private String studentCode;
    
    public Student(String name, int yob, String address) {
        super(name, yob, address);
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" + "studentCode=" + studentCode + '}';
    }
    
    public void showInfor(){
        super.showInfor();
        System.out.println("studentCode=" + studentCode );
    }
}
