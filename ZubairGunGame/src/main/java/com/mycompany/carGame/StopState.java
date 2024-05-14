/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carGame;

/**
 *
 * @author zaina
 */
//defining StopState class which extends from CarState
public class StopState extends CarState {
    //counstructor for StopState which also initializes superclass with the car object
    public StopState(Car car) {
        super(car);
    }
    //assigining messages with each method.
    @Override
    public void accelerate() {
        System.out.println("Starting car engine");
        car.setCarState(new DriveState(car));
    }
    @Override
    public void turnRight() {
        System.out.println("Unable to turn while stopped.");
    }
    @Override
    public void turnLeft() {
        System.out.println("Unable to turn while stopped.");
    }
    @Override
    public void reverse() {
        System.out.println("now reversing.");
    }
    @Override
    public void brake() {
        System.out.println("Already stopped.");
    }
}
