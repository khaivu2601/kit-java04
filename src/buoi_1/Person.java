//Để quản lý khách hàng đến thuê phòng của một khách sạn, người ta cần các thông tin sau: 
//Số ngày thuê, loại phòng, thông tin cá nhân của những người thuê phòng.
//Biết rằng phòng loại A có giá 500$, phòng loại B có giá 300$ và loại C có giá 100$.
//Với mỗi cá nhân cần quản lý các thông tin sau: Họ tên, tuổi, số chứng minh nhân dân.
//Yêu cầu 1: Hãy xây dựng lớp Nguoi để quản lý thông tin cá nhân của những người thuê phòng.
//Yêu cầu 2: Xây dựng lớp KhachSan để quản lý các thông tin về các phòng trong khác sạn.
//Yêu cầu 3: Xây dựng các phương thức thêm mới, xoá khách theo số chứng minh nhân dân. 
//Tính tiền thuê phòng cho khách(xác định khách bằng số chứng minh nhân dân) dựa vào công thức: 
//số ngày thuê * giá của từng loại phòng)!
package buoi_1;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author Khaivu
 */
public class Person {

    private String hoTen;
    private String soCMND;
    private String queQuan;
     
    public Person() {
        super();
    }
     
    public Person(String hoTen, String queQuan, String soCMND) {
        super();
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.soCMND = soCMND;
    }
     
    public String getSoCMND() {
        return soCMND;
    }
    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
     
    public void nhapThongTinKhachTro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên khách hàng: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan = scanner.nextLine();
        System.out.print("Nhập số chứng minh nhân dân: ");
        soCMND = scanner.nextLine();
    }
     
    public void hienThiThongTinKhachTro() {
        System.out.println("Họ và tên khách hàng: " + hoTen);
        System.out.println("Quê quán: " + queQuan);
        System.out.println("Số chứng minh nhân dân: " + soCMND);
    }
   
}
