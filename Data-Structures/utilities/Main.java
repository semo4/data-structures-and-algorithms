package Data-Structures.utilities;

public class Main {
    public static void main(String[] args) {
        AnimalShelter a = new AnimalShelter();

        Animal cat = new Cat("MshMsh");
        Animal cat1 = new Cat("MshMsh2");
        Animal dog = new Dog("Jack");
        Animal dog1 = new Dog("Jack2");

        a.enqueue(cat);
        a.enqueue(cat1);
        a.enqueue(dog);
        a.enqueue(dog1);


        System.out.println(a.dequeue("cat"));
        System.out.println(a.dequeue("dog"));
    }
}
