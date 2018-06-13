/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Nis
 */
public class vocales {
    public void newvocales(){
        
        int v = 0;
        String c [];
        String frase;
        String pf = " ";
        System.out.println("Contar Vocales");
        System.out.println();
        frase = "Amor al desarrollo";
        
        for(int y = 0; y < frase.length() ; y++){
            
          c = new String[y];
            
            if(frase.charAt(y) == 'a' ||frase.charAt(y) == 'A'){
                pf = pf + frase.charAt(y);
         
                v++;
            }else if(frase.charAt(y) == 'e' ||frase.charAt(y) == 'E'){
                  pf = pf + frase.charAt(y);
            
                v++;
            }else if(frase.charAt(y) == 'i' ||frase.charAt(y) == 'I'){
                  pf = pf + frase.charAt(y);
             
                v++;
            }else if(frase.charAt(y) == 'o' ||frase.charAt(y) == 'O' ){
                  pf = pf + frase.charAt(y);
               
                v++;
            }else if(frase.charAt(y) == 'u' ||frase.charAt(y) == 'U'){
                  pf = pf + frase.charAt(y);
   
                v++;
            }
            
            
            
            
            
        }
        
        System.out.println(pf);
         System.out.println("El numero de vocales es de = " + v);
        
        
    }
}
