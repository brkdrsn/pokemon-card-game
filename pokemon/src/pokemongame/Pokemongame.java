/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import javax.swing.JFrame;

/**
 *
 * @author burakdursun
 */
public class Pokemongame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        AnaMenu ekran=new AnaMenu();
        ekran.setVisible(true);
        ekran.setTitle("Pokemon Card Game");
        
        ekran.setSize(950, 700);
        ekran.setLocationRelativeTo(null);
        ekran.setVisible(true);
        
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        Pikachu p=new Pikachu("ASD","Mal");
        p.hasarPuaniGoster();
    }
    /*public Ekran(){
        Ekran ekran=new Ekran();
        ekran.setVisible(true);
        
    }*/
    
    
}
