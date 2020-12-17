package com.example.interfaces;

public class Main {
    public static void main(String[] args) {

        CarInterface carInterface = new ElectricCar("Tesla");
        CarInterface fossilCarInterface = new FossilFuelCar("Jeep");
        carInterface.start();
        carInterface.move(150);
        fossilCarInterface.start();
        fossilCarInterface.move(140);
    }
}
