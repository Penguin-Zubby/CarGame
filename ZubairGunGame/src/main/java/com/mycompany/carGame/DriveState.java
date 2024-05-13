package com.mycompany.carGame;


/**
 *
 * @author zaina
 */
public class DriveState extends Car {
    private Car car;
    
    public DriveState(Car car) {
        this.car = car;
    }
    
    @Override
    public void accelerate() {
        System.out.println("car is accelerating");
    }
    
    @Override
    public void turnRight() {
        System.out.println("Car is turning right");
    }
    @Override
    public void turnleft() {
        System.out.println("Car is turning left");
    }
    @Override
    public void reverse() {
        System.out.println("Cannot reverse while in drive mode");
    }
    @Override
    public void brake() {
        System.out.println("Applying brakes to slow down");
    }

    @Override
    public void turnLeft() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
