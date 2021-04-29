/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2;

/**
 *
 * @author Guillermolp
 */
public class Mamifero extends Animales {
    
    protected String tamaño;

    public Mamifero() {
        super();
  
    }
    public String getTamaño(){
        return tamaño;

}

public void setTamaño(String tamaño){
this.tamaño=tamaño;
}
}