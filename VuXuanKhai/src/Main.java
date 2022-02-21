
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Khaivu
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        QuanLy ql = new QuanLy();
        do{
            Menu();
            System.out.println("nhập lựa chọn từ 1-->9 ");
            choose = Integer.parseInt(sc.nextLine());
            
            switch(choose){
                case 1: 
                    ql.nhapKH();
                    break;
                case 2:
                    ql.inKH();
                    break;
                case 3:
                    ql.suaKH();
                    break;
                case 4:
                    ql.nhapSP();
                    break;
                case 5:
                    ql.inSSP();
                    break;
                case 6:
                    ql.nhapHD();
                    break;
                case 7:
                    ql.sapXep();
                    break;
                case 8:
                    ql.Max();
                    break;
                case 9:
                    System.out.println("hẹn gặp lại !!!");
                    break;  
            }
            
        }
        while(choose != 9);
    }
    
    public static void Menu(){
        System.out.println("=========================");
        System.out.println("1.Thêm khách hàng        ");
        System.out.println("2.In thông tin khách hàng");
        System.out.println("3.Sửa khách hàng         ");
        System.out.println("4.nhập sản phẩm          ");
        System.out.println("5.In thông tin sản phẩm  ");
        System.out.println("6.Mua hàng               ");
        System.out.println("7.Sắp xếp hóa đơn        ");
        System.out.println("8.hóa đơn lớn nhất       ");
        System.out.println("9.Thoát!!!               ");
        System.out.println("=========================");
    }
}
