/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Nis
 */
public class quest {
    private int num;
    private String res;
    
    
    public  quest(int num, String res){
        this.num = num;
        this.res = res;
        
         if(num % 2 == 0){
             res = "ES PAR";
         }else{
              res = "ES IMPAR";
         }
        
    }
    
    public quest(){
        
    }
    
    public void setnum(int num){
    
        this.num = num;
    }
    
    public int getnum(){
        return num;
    }
    
    public void setres(String res){
    
        this.res = res;
    }
    
    public String getres(){
        return res;
    }
}
