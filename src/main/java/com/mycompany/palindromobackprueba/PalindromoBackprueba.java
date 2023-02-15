/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromobackprueba;

/**
 *
 * @author steven Garcia
 */
public class PalindromoBackprueba {

    public static void main(String[] args) {
       String string1 = "oso";
        String string2 = "oSo";
        
        Boolean isPal = isPalindromo(string1, string2);
        String resultado = (isPal)? "Es palindromo":"No Es palidromo";
        
        System.out.println(resultado);
        
    }
   
    
    public static boolean isPalindromo (String strEntrada, String strInvertido){
        String strlower = strEntrada.toLowerCase();
        String invertido = invertir(strInvertido);
        return strlower.equals(invertido);
    }
    
    public static String invertir (String strEntrada){
       String lowerStr = strEntrada.toLowerCase();
        
       
       StringBuilder strBuilder = new StringBuilder();
       
       strBuilder.append(lowerStr);
       strBuilder.reverse();
       
       String parseString = strBuilder.toString();
       
        return parseString;
        }
}
