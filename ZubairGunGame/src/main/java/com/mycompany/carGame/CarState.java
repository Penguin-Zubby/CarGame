/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carGame;

/**
 *
 * @author zaina
 */
public abstract class CarState {
    protected Car car;
    
    public CarState(Car car) {
        this.car = car;
    }
    
    public abstract void accelerate();
    public abstract void turnRight ();
    public abstract void turnLeft ();
    public abstract void reverse ();
    public abstract void brake ();
    
}
