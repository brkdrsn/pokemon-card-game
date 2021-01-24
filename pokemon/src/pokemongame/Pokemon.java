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
public class Pokemon implements Pokemonn {
    String pokemonAdi;
    String pokemonTip;
    int hasarPuani;
    int pokemonID;
    boolean kartUse;
    
    public Pokemon(String pokemonAdi, String pokemonTip) {
        this.pokemonAdi = pokemonAdi;
        this.pokemonTip = pokemonTip;
        
    }

    
    public Pokemon() {
    }
    @Override
    public void hasarPuaniGoster(){
        System.out.println(pokemonAdi+" Hasar Puani= "+hasarPuani+"\nPokemon Tipi="+pokemonTip);
    }
@Override
    public int getHasarPuani() {
        return hasarPuani;
    }

    public void setHasarPuani(int hasarPuani) {
        this.hasarPuani = hasarPuani;
    }

    @Override
    public int setHasarPuani() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPokemonID() {
        return pokemonID;
    }

    public void setKartUse(boolean kartUse) {
        this.kartUse = kartUse;
    }
    
    
    
}
