
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Khaivu
 */
public class QuanLy {

    static ArrayList<KhachHang> kh = new ArrayList<>();
    static ArrayList<SanPham> sp = new ArrayList<>();
    static ArrayList<HoaDon> hd = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public boolean checkMa(String n) {
        for (KhachHang x : kh) {
            if (n.equals(x.getMaKH())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkMaSP(String n) {
        for (SanPham x : sp) {
            if (n.equals(x.getMaSP())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTenSP(String n) {
        for (SanPham x : sp) {
            if (n.equals(x.getTenSP())) {
                return true;
            }
        }
        return false;
    }

    public boolean checkName(String n) {
        for (KhachHang x : kh) {
            if (n.equals(x.getTenKH())) {
                return true;
            }
        }
        return false;
    }

    public void nhapKH() {

        KhachHang k1 = new KhachHang();
        k1.nhapKH();
        kh.add(k1);

    }

    public void suaKH() {
        System.out.println("nhập mã khách hàng muốn sửa: ");
        String n = sc.nextLine();
        for (int i = 0;i < kh.size();i++) {
            if (checkMa(n) == true) {
                System.out.println("bạn muốn sửa " +"ten"+" hay"+" năm sinh ?");
                String luaChon = sc.nextLine();
            
                if (luaChon.compareTo("ten") == 0) {
                    System.out.println("nhập tên thay thế :");
                    String newName = sc.nextLine();
                    kh.get(i).setTenKH(newName);
                    System.out.println("sửa đổi thành công !!!");
                } else {
                    System.out.println("nhập năm sinh thay thế :");
                    int newNam = Integer.parseInt(sc.nextLine());
                    kh.get(i).setNamSinh(newNam);
                    System.out.println("sửa đổi thành công !!!");
                }

            } else {
                System.out.println("ko tìm thấy mã khách hàng:!!! ");
            }
            break;
        }
    }

    public void nhapSP() {

        sp.add(new SanPham("k1", "kkkk", 0, "1", 0));
        SanPham sp1 = new SanPham();
        System.out.println("nhập mã sản phẩm: ");
        String maSP = sc.nextLine();
        if (checkMaSP(maSP)) {
            System.out.println("mã sản phẩm đã tồn tại . Nhập thêm số lượng: ");
            int soLuong = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < sp.size(); i++) {
                if (checkMaSP(maSP)) {
                    sp.get(i).changeSoLuong(soLuong);
                }
            }
        } else {
            sp1.setMaSP(maSP);
            sp1.nhapTTSP();
            sp.add(sp1);
        }
    }

    public void inSSP() {
        for (SanPham x : sp) {
            x.inTTSP();
        }
    }

    public void inKH() {
        for (KhachHang x : kh) {
            x.inKH();
        }
    }

    public void nhapHD() {
        
        HoaDon h = new HoaDon();
        System.out.println("nhập khách hàng mua : ");
        String name = sc.nextLine();
        if (checkName(name)) {
            h.setTenKH(name);
            System.out.println("nhập tên sản phẩm mua: ");
            String newMa = sc.nextLine();
            if (checkTenSP(newMa)) {
                h.setTenSP(newMa);
                System.out.println("nhập số lượng : ");
                int newSoLuong = Integer.parseInt(sc.nextLine());
                h.setSoLuong(newSoLuong);
                for (int i = 0; i < sp.size(); i++) {
                    if (checkTenSP(newMa)) {
                        double tong = newSoLuong * sp.get(i).getDonGia();
                        h.setThanhTien(tong);
                    }

                }
                hd.add(h);
                System.out.println("=================================");
                System.out.println("hóa đơn của bạn: ");
                h.inHD();
            } else {
                System.out.println("ko tồn tại mặt hàng này !!!");
            }
        } else {
            System.out.println("ko có khách hàng này!!!");
        }

    }
    
    public void sapXep(){
        hd.add(new HoaDon("nam", "nu", 13, 20));
        
        hd.add(new HoaDon("nam", "nu", 13, 22));
        
        hd.add(new HoaDon("nam", "nu", 13, 21));
        
        Collections.sort(hd,new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return (int) (o2.getThanhTien() - o1.getThanhTien()) ;
            }
        
        });
        System.out.println("hóa đơn đã sắp xếp là: ");
        for (HoaDon x : hd) {
            System.out.println(""+x.toString());
        }
    }
    
    public void Max(){
        Collections.sort(hd,new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return (int) (o2.getThanhTien() - o1.getThanhTien()) ;
            }
        
        });
        System.out.println("hóa đơn đã sắp xếp là: ");
        hd.get(0).inHD();
    }
}
