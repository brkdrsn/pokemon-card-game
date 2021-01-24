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
public class Oyuncu {
    int oyuncuID;
    String oyuncuAdi;
    int Skor;
     int[] kartListesi=new int[5];

    public Oyuncu(String oyuncuAdi, int Skor) {
        this.oyuncuAdi = oyuncuAdi;
        this.Skor = Skor;
    }

    public Oyuncu() {
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }
    public void kartSecim(int[] kartListesi){
        this.kartListesi=kartListesi;
        
    }
    
     
}
