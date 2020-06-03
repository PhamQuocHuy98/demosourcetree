/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavasourcetree;

/**
 *
 * @author HINH
 */
public class phepnhan {
    double a, b;
    public phepnhan(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public void Nhan() {
        double kq = a*b;
        System.out.println("Ket qua la: " + kq);
    }
}
