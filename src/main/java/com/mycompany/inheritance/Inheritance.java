/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;

/**
 *
 * @author victus
 */

public class Inheritance {

    public static void main(String[] args) {
        Hero hero1 = new Hero("Tanjidor",10,100);
        HeroStrength hero2 = new HeroStrength("Zenitsu",20,100);
        
        hero1.display();
        hero2.display();
        
        hero1.attack(hero2);
        hero2.attack(hero1);
        
        hero1.display();
        hero2.display();
    }
}
