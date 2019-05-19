/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedir10numerossumatotal;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisF
 */
public class Pedir10numerossumatotal {

    
    public static void main(String[] args) {
       
        int num = 0,contador = 0;
        
        for(int i = 0 ; i<10 ;i++ ){
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        contador += num;
        
        }
        JOptionPane.showMessageDialog(null, "La suma de los números digitados es: " +contador );
        
    }
    
}
