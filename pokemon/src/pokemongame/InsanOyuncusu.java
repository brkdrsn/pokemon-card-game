/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

/**
 *
 * @author burakdursun
 */
public class InsanOyuncusu extends Oyuncu {
     int[] kartListesi;

    public InsanOyuncusu(int[] kartListesi) {
        this.kartListesi = kartListesi;
         kartListesi=new int[5];
    }

    public InsanOyuncusu() {
         kartListesi=new int[5];
    }

    @Override
    public void setOyuncuAdi(String oyuncuAdi) {
        super.setOyuncuAdi(oyuncuAdi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getOyuncuAdi() {
        return super.getOyuncuAdi(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void kartSecim(int[] kartListesi) {
        super.kartSecim(kartListesi); //To change body of generated methods, choose Tools | Templates.
    }
    
}
