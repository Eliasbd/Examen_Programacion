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
public class par {
    public void newpar(){
       Scanner tec = new Scanner(System.in);
        int num;
        String val;
        quest callq = new quest();
         System.out.println("Ingrese un numero =   ");
         num = tec.nextInt();
         
         callq.setnum(num);
        
         if(num % 2 == 0){
             val = "ES PAR";
             callq.setres(val);
         }else{
              val = "ES IMPAR";
              callq.setres(val);
         }
        
   
       
        
       
        
        System.out.println();
        System.out.println("Usted ingresso el numero = " + callq.getnum());
        System.out.println(callq.getres());
        
        
        
        
        
        
        
    }
            
    
}
