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
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner tec = new Scanner(System.in);
        
        System.out.println("MENU");
        System.out.println();
        System.out.println("1. Numeros Pares e Impares");
        System.out.println("2. Contar Vocales");
        System.out.println("3. Lista de Frutas con Array");
         System.out.println();
        System.out.print("ELIJA =  ");
        int opc = tec.nextInt();
         System.out.println();
        
        if(opc == 1){
            par callp = new par();
            callp.newpar();
        }else if(opc == 2){
            
            vocales callvo = new vocales();
            callvo.newvocales();
        }else if(opc == 3){
            
            list calll = new list();
            calll.newlist();
            
        }
        
    }
    
}
