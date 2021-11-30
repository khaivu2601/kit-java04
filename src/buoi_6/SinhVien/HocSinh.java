/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_6.SinhVien;

/**
 *
 * @author Khaivu
 */
public class HocSinh {
    protected String hoten;
    protected String lop;
    protected double toan,ly,hoa;

    public HocSinh(String hoten, String lop, double toan, double ly, double hoa) {
        this.hoten = hoten;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
    
    public double diemTb() {
        return (toan+ly+hoa)/3;
    }

    @Override
    public String toString() {
        return "HocSinh{" + "hoten=" + hoten + ", lop=" + lop + ", toan=" + toan + ", ly=" + ly + ", hoa=" + hoa + '}';
    }
    
    public void showInfor() {
        System.out.println("HocSinh{" + "hoten=" + hoten + ", lop=" + lop + ", toan=" + toan 
                + ", ly=" + ly + ", hoa=" + hoa +" diemTb= "+diemTb()+ '}');
    }
}
