package block1;

// PUZZLE 1: One class, many objects
//
// Write your guess for each printed line BEFORE you press the green arrow.
// MY GUESS:
//   1:
//   2:
//   3:

public class OneClassManyObjects {
    public static void main(String[] args) {
        Car a = new Car();
        Car b = new Car();
        b.color = "red";
        System.out.println(a.color);
        System.out.println(b.color);

        Car c = a;
        c.color = "green";
        System.out.println(a.color);
    }
}

// The blueprint. Every Car built from it starts out blue.
class Car {
    String color = "blue";
}
