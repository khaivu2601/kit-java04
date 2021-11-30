/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_5;

/**
 *
 * @author Khaivu
 */
public class main {
    public static void main(String[] args) {
        Student st = new Student("khai", 2001, "nam dinh");
        st.setStudentCode("at1605");
        st.showInfor();
        System.out.println("========================================");
        Teacher t = new Teacher("pipi", 1991, "hanoi");
        t.setSalary(1000);
        t.setTcode("TC19645");
        t.showInfor();
    }
}
