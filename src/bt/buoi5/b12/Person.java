/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.buoi5.b12;

import java.util.Scanner;

/**
 *
 * @author Khaivu
 */
public class Person {
    private String name,cardId;
    private int yob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcardId() {
        return cardId;
    }

    public void setcardId(String cardId) {
        this.cardId = cardId;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }
    public void addInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên :");
        name=sc.nextLine();
        System.out.println("nhập mã thẻ :");
        cardId=sc.nextLine();
        System.out.println("nhập tuổi: ");
        yob=Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", cardId=" + cardId + ", yob=" + yob + '}';
    }

    
    public void showInfor(){
        System.out.println("tên: "+name);
        System.out.println("tuổi : "+yob);
        System.out.println("cardId : : "+cardId);
    }
}
