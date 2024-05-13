/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carGame;

/**
 *
 * @author zaina
 */
public class StopState implements Car {
    private Car car;
    
    public StopState(Car car) {
        this.car = car;
    }
    
    public void assemble() {
        car.assemble();
    }
    
}
