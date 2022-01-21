package net.zerotodev.javabasic;
/**
 Real-world objects share two characteristics: They all have state and behavior.
 In the real world, you'll often find many individual objects all of the same kind.
 There may be thousands of other bicycles in existence, all of the same make and model.
 Each bicycle was built from the same set of blueprints and therefore contains the same components.
 In object-oriented terms,
 we say that your bicycle is an instance of the class of objects known as bicycles.
 A class is the blueprint from which individual objects are created.
 The following Bicycle class is one possible implementation of a bicycle:
*/
public class Bicycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;


    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
