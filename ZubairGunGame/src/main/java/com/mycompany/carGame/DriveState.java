package com.mycompany.carGame;


/**
 *
 * @author zaina
 */
//defining DriveState class which extends from CarState
public class DriveState extends CarState {
    //counstructor for DriveState which also initializes superclass with the car object
    public DriveState(Car car) {
        super(car);
    }
    //assigining messages with each method.
    @Override
    public void accelerate() {
        System.out.println("car is accelerating");
    }
    
    @Override
    public void turnRight() {
        System.out.println("Car is turning right");
    }
    @Override
    public void turnLeft() {
        System.out.println("Car is turning left");
    }
    @Override
    public void reverse() {
        System.out.println("Cannot reverse while in drive mode");
    }
    @Override
    public void brake() {
        System.out.println("Applying brakes to slow down");
        car.setCarState(new StopState(car));
    }
}
