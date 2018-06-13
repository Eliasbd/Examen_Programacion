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
public class list {
    public void newlist(){
        
        int fin = 5;
        String fruta;
        String [] fruits = new String [fin];
        Scanner tec = new Scanner(System.in);
         System.out.println();
        System.out.println("Haga Su lista de frutas");
         System.out.println();
         
        for(int c = 0 ; c < fruits.length; c++){
            
            System.out.println("Ingrese su  " + (c+1) + " fruta");
            fruta = tec.nextLine();
            fruits[c] = fruta;
        }
        
         System.out.println();
        System.out.println("TU LISTA ES =    ");
         System.out.println();
         
        for(int y = 0; y < fruits.length ; y++ ){
            System.out.println( (y+1) +"  " + fruits[y]);
        }
        
        
        
        
        
        
    }
    
}
