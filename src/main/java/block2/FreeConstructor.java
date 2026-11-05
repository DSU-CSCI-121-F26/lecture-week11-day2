package block2;

// PUZZLE 5: Where did new Car() go?
//
// In part 15, "new Car()" worked. Car had no constructor at all.
// This Car has one constructor that takes a make and a year.
//
// STEP 1: Run it. It works.
// STEP 2: Delete the // in front of "Car mine". Will it compile?
// MY GUESS (yes or no):
// STEP 3: Read the red error out loud. Then fix it by adding a second
//         constructor to Car, one with no parameters.

public class FreeConstructor {
    public static void main(String[] args) {
        Car yours = new Car("Toyota", 2020);
        System.out.println(yours.make + " " + yours.year);

        // Car mine = new Car();
    }
}

class Car {
    String make;
    int year;

    Car(String make, int year) {
        this.make = make;
        this.year = year;
    }
}
