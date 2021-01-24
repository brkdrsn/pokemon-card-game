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
public class Meowth extends Pokemon {
     

    public Meowth() {
        kartUse=false;
        pokemonID=4;
         hasarPuani=40;
       super.pokemonAdi="Meowth";
       super.pokemonTip="Normal";
    }
    public Meowth(String pokemonAdi,String pokemonTip) {
        kartUse=false;
        pokemonID=4;
         hasarPuani=40;
       super.pokemonAdi="Meowth";
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
