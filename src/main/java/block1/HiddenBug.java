package block1;

// PUZZLE 2: The hidden bug
//
// Two quarterbacks, two names. What prints?
// MY GUESS:
//   1:
//   2:
//
// If main only made Carter, would you ever see this bug?

public class HiddenBug {
    public static void main(String[] args) {
        Quarterback q1 = new Quarterback("Carter");
        Quarterback q2 = new Quarterback("Rivera");
        q1.throwBall();
        q2.throwBall();
    }
}

class Quarterback {
    String name;

    Quarterback(String name) {
        this.name = name;
    }

    void throwBall() {
        System.out.println("Carter throws!");
    }
}
