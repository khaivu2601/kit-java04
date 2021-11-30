/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_4;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class Student {

    public String Id;
    public String lop;
    public double diemTb;
    public int yob;

    public Student(String Id, String lop, double diemTb, int yob) {
        this.Id = Id;
        this.lop = lop;
        this.diemTb = diemTb;
        this.yob = yob;
    }

    public Student() {
        this.Id = "12345678";
        this.lop = "at16";
        this.diemTb = 2.7;
        this.yob = 2001;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemTb() {
        return diemTb;
    }

    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void addInfor() {
        Scanner sc = new Scanner(System.in);
        while (true) {

            try {
                System.out.println("nhập id : ");
                Id = sc.nextLine();
                if (Id.isEmpty() == false && Id.length() == 8) {
                    break;
                } else {
                    System.out.println("Id ko dc để trống và đủ 8 ký tự ");
                }

            } catch (Exception e) {
                System.out.println("ahihi");
            }
        }
        while (true) {
            try {
                System.out.println("nhập điểm tb: ");
                diemTb = Double.parseDouble(sc.nextLine());
                if (diemTb >= 0 && diemTb <= 10) {
                    break;
                } else {
                    System.out.println("nhập lại điểm diemTb >= 0 && diemTb <= 10 ");
                }
            } catch (Exception e) {

            }
        }
        while (true) {
            try {
                System.out.println("nhập tuổi: ");
                yob = Integer.parseInt(sc.nextLine());
                if (yob >= 18) {
                    break;
                } else {
                    System.out.println("nhập lại tuổi >=18 :");
                }
            } catch (Exception e) {
            }
        }
        while (true) {
            try {
                System.out.println("nhập lớp: ");
                lop = sc.nextLine();
                if ('a' == lop.charAt(0) || lop.charAt(0) == 'c') {
                    break;
                } else {
                    System.out.println("nhập lại lớp có kí tự đầu bằng 'A'hoặc'C'");
                }
            } catch (Exception e) {
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" + "Id= " + Id + ", lop= " + lop + ", diemTb= " + diemTb + ", yob= " + yob + '}';
    }

    public void printInfor() {
        System.out.println("Student{" + "Id= " + Id + ", lop= " + lop + ", diemTb= " + diemTb + ", yob= " + yob + '}');
        hocBong();
    }

    public void hocBong() {
        if (diemTb >= 8) {
            System.out.println("ĐẠT HỌC BỔNG !!!!");
        } else {
            System.out.println("ko đạt học bổng!");
        }
    }
}
