package block3;

// PUZZLE 6: Who has added "static" just to make a red error go away?
//
// STEP 1: Delete the // in front of "greet();". Read the red error.
// STEP 2: Put the // back. Fix it by making an object instead:
//             CallFromMain m = new CallFromMain();
//             m.greet();

public class CallFromMain {
    public static void main(String[] args) {
        // greet();
    }

    void greet() {
        System.out.println("hi");
    }
}
