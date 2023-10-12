/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author victus
 */
public class HeroStrength extends Hero{
    String type = "Strength";
    //subclass constructor
    HeroStrength(String nameInput, double attackInput, double healthInput){
        super(nameInput, attackInput, healthInput);
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Type : " + this.type);
    }
    
    @Override
    void takeDamage(double damage){
        System.out.println(this.name + " recieve half damage " + damage + "->" + 0.5*damage);
        this.health = this.health - 0.5*damage;
    }
}
