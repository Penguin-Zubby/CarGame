/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.carGame;

/**
 *
 * @author zaina
 */
import java.util.Scanner;

public class CarGamePlay {
    public static void main(String[] args) {
        Car car = new Car() {
            private CarState carState = new StopState(this);
            
            //Setting up car states to carry out different methods when in that state
            @Override
            public void accelerate() {
                carState.accelerate();
            }
            @Override
            public void turnRight() {
                carState.turnRight();
            }
            @Override
            public void turnLeft() {
                carState.turnLeft();
            }
            @Override
            public void reverse() {
                carState.reverse();
            }
            @Override
            public void brake() {
                carState.brake();
            }
            
            @Override
            public void setCarState(CarState carState) {
                this.carState = carState;
            }
        };
        try (Scanner scanner = new Scanner(System.in)) {
            while(true) {
                System.out.println("Enter 1 to accelerate. \n 2 to turn right. \n 3 to turn left \n 4 to reverse. \n 5 to brake: ");
                String input = scanner.next();
                
                if (input.matches("\\d+")){
                    int choice = Integer.parseInt(input);
                    switch (choice) {
                        case 1 -> car.accelerate();
                        case 2 -> car.turnRight();
                        case 3 -> car.turnLeft();
                        case 4 -> car.reverse();
                        case 5 -> car.brake();
                        default -> System.out.println("Invalid Input!. \n Please pick from the listed options");
                    }
                }
                else {
                    System.out.println("Invalid Input!. \n Please enter a valid number.");
                
                }
            }
        }
    }
}
