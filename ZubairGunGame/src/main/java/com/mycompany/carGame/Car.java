/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.carGame;

/**
 *
 * @author zaina
 */
//Defining abstract class base class for all cars
public abstract class Car {
    private CarState carState;
    
    //constructor which initializes the car state to the StopState
    public Car() {
        this.carState = new StopState(this);
    }
    //Implementing the current car state
    public void setCarState(CarState carState) {
        this.carState = carState;
    }
    //Assiging different methods to current carState
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
    // Linking or referencing the driving strategy for the car
    private DrivingStr drivingStrategy;
    
    //Setting constructor to initialize the driving strategy
    public Car(DrivingStr drivingStrategy){
        this.drivingStrategy = drivingStrategy;
    }
    //Sets the driving strategy for the car
    public void setDrivingStr(DrivingStr drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }
    //Assigning the drive method to driving strategy for the car
    public void drive() {
        drivingStrategy.drive(this);
    }
}