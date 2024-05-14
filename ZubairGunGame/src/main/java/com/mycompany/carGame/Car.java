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
    private CarState carState;
    
    public Car() {
        this.carState = new StopState(this);
    }
    public void setCarState(CarState carState) {
        this.carState = carState;
    }
    
    public void accelerate(){
        carState.accelerate();
    }
    public void turnRight(){
        carState.turnRight();
    }
    public void turnLeft(){
        carState.turnLeft();
    }
    public void reverse(){
        carState.reverse();
    }
    public void brake(){
        carState.brake();
    }
    private DrivingStr drivingStrategy;
    
    public Car(DrivingStr drivingStrategy){
        this.drivingStrategy = drivingStrategy;
    }
    public void setDrivingStr(DrivingStr drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }
    public void drive() {
        drivingStrategy.drive(this);
    }
}