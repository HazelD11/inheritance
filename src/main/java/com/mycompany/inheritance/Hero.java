/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author victus
 */
public class Hero{
    //attribute
    String name;
    double attackPower, health;
    
    //constructor
    Hero(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }
    
    //method attack
    void attack(Hero enemy){
        System.out.println("\n" + this.name + " attack " + enemy.name);
        enemy.takeDamage(this.attackPower);
    }
    
    void takeDamage(double damage){
        System.out.println(this.name + " recieve damage " + damage);
        this.health = this.health - damage;
    }
    
    void display(){
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Power: " + this.attackPower);
    }
}