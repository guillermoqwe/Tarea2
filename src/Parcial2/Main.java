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
public class Main {
    public static void main (String[]args){
        ///Creacion de objeto  de la clase animal
        ///Instancion de la clase  aniamal
        ///Creacion de istancia de la class anial 
        
         //   Animales animales= new Animales();
          //System.out.print(animales.color);
            
          Mamifero mamifero1=new Mamifero();
         mamifero1.setColor(" Color es: Azul");
          mamifero1.setTamaño("Grande");
          Oviparo oviparo1= new Oviparo();
          oviparo1.setColor("Negro");
          oviparo1.setTamaño("Pequeño");
          
           Perro perro1=new Perro();
         perro1.setColor("Color: Negro");
          perro1.setTamaño("Tamaño: Grande");
          Lobo lobo1= new Lobo();
          lobo1.setColor("Color: Blanco ");
          lobo1.setTamaño("Tamaño: Bebe");
          
           Gato gato1=new Gato();
           gato1.setColor("Color: Cafe");
          gato1.setTamaño("Tamaño: Chico");
          Tigre tigre1= new Tigre();
          tigre1.setColor("Color: Naranja con rayas negras");
          tigre1.setTamaño("Tamaño: Grande "); 
          
          Aguila aguila1=new Aguila();
         aguila1.setColor("Color: Cafe");
          aguila1.setTamaño("Tamaño: Grande");
          Paloma paloma1= new Paloma ();
          paloma1.setColor("Color: Gris");
          paloma1.setTamaño("Tamaño: Pequeña");
          
          Trucha trucha1=new Trucha();
          trucha1.setColor("Color: arillentos");
          trucha1.setTamaño("Tamaño: Grande");
          Salmon salmon1= new Salmon ();
          salmon1.setColor("Color: Gris");
          salmon1.setTamaño("Tamaño: Medianoos");
         
            System.out.println("Mamifero");
            System.out.println("---------------------");
            System.out.println("Perro es");
            System.out.println(perro1.getColor());
            System.out.println(perro1.getTamaño());
            System.out.println("---------------------");
             System.out.println("Lobo es");
            System.out.println(lobo1.getColor());
            System.out.println(lobo1.getTamaño()); 
            System.out.println("---------------------");
            System.out.println("Gato es:");
            System.out.println(gato1.getColor());
            System.out.println(gato1.getTamaño());
            System.out.println("---------------------");
            System.out.println("Tigre es:");
            System.out.println(tigre1.getColor());
            System.out.println(tigre1.getTamaño()); 
            System.out.println("---------------------");
             System.out.println("Oviparo");
            System.out.println("---------------------");
            System.out.println("Aguila es:");
            System.out.println(aguila1.getColor());
            System.out.println(aguila1.getTamaño());
            System.out.println("---------------------");
            System.out.println("Paloma es:");
            System.out.println(paloma1.getColor());
            System.out.println(paloma1.getTamaño()); 
            System.out.println("---------------------");
            System.out.println("Trucha es:");
            System.out.println(trucha1.getColor());
            System.out.println(trucha1.getTamaño());
            System.out.println("---------------------");
            System.out.println("Salmon es:");
             System.out.println(salmon1.getColor());
            System.out.println(salmon1.getTamaño());
            System.out.println("---------------------");
    }
   
    
}
