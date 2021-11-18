
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khaivu
 */
public class Class {
    Scanner sc=new Scanner(System.in);
    ArrayList<Person> studentList=new ArrayList<>();
    public void nhapSinhVien(){
        int n;
        int  chon;
        System.out.println("Bạn muốn nhập mấy lớp ???");
            chon=sc.nextInt();
      for(int i=0;i<chon;i++){
            System.out.println("Nhập Thông Tin GVCN");
             Person n1=new Teacher("","","","");
 n1.nhap();
            System.out.println("Nhập Số Sinh Viên:");
            n=sc.nextInt();
            studentList.add(n1);
            for(int j=0;j<n;j++){
         Person n2=new Student("","","","");
           n2.nhap();
         studentList.add(n2);
        }
        }
    }
    public void xuatsv(){
        for(Person tmp:studentList){
            tmp.xuat();
        }
    }
    

    public Class() {
    }
}
