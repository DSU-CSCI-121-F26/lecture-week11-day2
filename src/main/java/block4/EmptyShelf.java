package block4;

// PUZZLE 9: An array of objects
//
// Guess all four lines. One of them is not a normal line.
// MY GUESS:
//   1:
//   2:
//   3:
//   4:
//
// If your guess was wrong, do NOT change the code to match your guess.
// Write down why you were wrong. That is the point.

public class EmptyShelf {
    public static void main(String[] args) {
        Food[] lunch = new Food[3];
        lunch[0] = new Food("pizza");
        System.out.println(lunch.length);
        System.out.println(lunch[0].name);
        System.out.println(lunch[1]);
        System.out.println(lunch[1].name);
    }
}

class Food {
    String name;

    Food(String name) {
        this.name = name;
    }
}
