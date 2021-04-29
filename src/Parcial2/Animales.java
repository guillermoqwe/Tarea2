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
public abstract class  Animales {
     protected String color;
    
    public Animales(){
        //this.color="Verde"
    }     
  public Animales (String color){
    this.color=color;
}
        
   
    public String getColor(){
        return color;
       
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
}
