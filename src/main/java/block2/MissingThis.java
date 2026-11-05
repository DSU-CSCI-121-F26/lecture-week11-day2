package block2;

// PUZZLE 3: The missing "this"
//
// MY GUESS:
//   1:

public class MissingThis {
    public static void main(String[] args) {
        Pet p = new Pet("Max", 3);
        System.out.println(p.name + " " + p.age);
    }
}

class Pet {
    String name;
    int age;

    Pet(String name, int age) {
        name = name;
        age = age;
    }
}
