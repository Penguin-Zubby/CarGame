/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.carGame;

/**
 *
 * @author zaina
 */
public abstract class Car {
    public abstract void accelerate();
    public abstract void turnRight ();
    public abstract void turnLeft ();
    public abstract void reverse ();
    public abstract void brake ();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Car game");
    }
    
}
