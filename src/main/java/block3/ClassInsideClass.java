package block3;

// PUZZLE 7: "It doesn't work because Counter isn't static"
//
// STEP 1: Delete the // in front of the three lines in main. Read the red error.
// STEP 2: Look at where class Counter is. Whose braces is it inside?
// STEP 3: Fix it WITHOUT adding "static": cut the whole Counter class
//         and paste it below the last } of ClassInsideClass.
// STEP 4: Make a second Counter, d. Call c.add() twice and d.add() once.
//         Print both counts.
//         MY GUESS:

public class ClassInsideClass {
    public static void main(String[] args) {
        // Counter c = new Counter();
        // c.add();
        // System.out.println(c.count);
    }

    class Counter {
        int count = 0;

        void add() {
            count++;
        }
    }
}
