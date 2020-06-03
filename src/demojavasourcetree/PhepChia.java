/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavasourcetree;

/**
 *
 * @author phamquochuy
 */
public class PhepChia {
    double a;
    double b;
    
    public PhepChia(double a,double b){
        this.a=a;
        this.b=b;
    }

    
    public void chia(){
        
        double ketqua = a/b;
        System.out.println("Ket qua là " +ketqua);
    }
}
