package com.pack1;

public class Car {
    Car(){}
    Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        setColour(colour);
        setEnginePower(enginePower);
        setConvertible(convertible);
        setParkingBrake(parkingBrake);
    }

    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEnginePower() {
        return this.enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isConvertible() {
        return this.convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isParkingBrake() {
        return this.parkingBrake;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }
    public void output(){
        System.out.println("Colour:"+getColour());
        System.out.println("Engine Power:"+getEnginePower());
        System.out.println("Convertible:"+isConvertible());
        System.out.println("Parking Brake:"+isParkingBrake());
    }
}
