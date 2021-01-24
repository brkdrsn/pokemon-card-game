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
public class Snorlax extends Pokemon {
    

    public Snorlax() {
        kartUse=false;
        pokemonID=7;
         hasarPuani=30;
       super.pokemonAdi="Snorlax";
       super.pokemonTip="Normal";
    }
    public Snorlax(String pokemonAdi,String pokemonTip) {
        kartUse=false;
        pokemonID=7;
         hasarPuani=30;
       super.pokemonAdi="Snorlax";
       super.pokemonTip="Normal";
    }

    @Override
    public void hasarPuaniGoster() {
        super.hasarPuaniGoster(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void setHasarPuani(int hasarPuani) {
        super.setHasarPuani(hasarPuani); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHasarPuani() {
        return super.getHasarPuani(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public int getPokemonID() {
        return super.getPokemonID(); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void setKartUse(boolean kartUse) {
        super.setKartUse(kartUse); //To change body of generated methods, choose Tools | Templates.
    }
}
