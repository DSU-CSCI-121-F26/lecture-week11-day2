package block3;

// PUZZLE 8: One box per object, or one box for the whole class?
//
// static  = ONE box, shared by the whole class
// no static = one box PER OBJECT
//
// MY GUESS:
//   1:
//   2:
//   3:
//
// Then fix the constructor so line 1 prints both names.

public class Friends {
    public static void main(String[] args) {
        Friend a = new Friend("Spongebob");
        Friend b = new Friend("Patrick");
        System.out.println(a.name + " " + b.name);
        System.out.println(Friend.count);
        System.out.println(Friend.newest);
    }
}

class Friend {
    static int count = 0;
    static String newest;
    String name;

    Friend(String name) {
        this.newest = name;
        count++;
    }
}
