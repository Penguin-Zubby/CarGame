package com.mycompany.zubairGunGame;

public class Warzone {

    public static void main(String args[]) {
        GameBox myGunGameSingleton = GameBox.getInstance();
        myGunGameSingleton.play();
    }
}
