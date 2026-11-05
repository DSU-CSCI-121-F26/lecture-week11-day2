package block2;

// PUZZLE 4: A constructor with nothing to set
//
// MY GUESS:
//   1:
//
// Look at Pizza(). It has no parameters. So where does "bread" come from?

public class NoArgPizza {
    public static void main(String[] args) {
        Pizza p = new Pizza();
        System.out.println(p.bread + " " + p.cheese);
    }
}

class Pizza {
    String bread;
    String cheese;

    Pizza() {
        this.bread = bread;
        this.cheese = cheese;
    }
}
