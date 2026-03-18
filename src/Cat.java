public class Cat {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat("Whiskers");
        Cat cat2 = new Cat("Whiskers");
        Cat cat3 = new Cat("Rex");
        Cat cat4 = new Cat("Whiskers");

        cat1.meow();
        cat2.meow();
        cat3.meow();
        cat4.meow();
    }
}