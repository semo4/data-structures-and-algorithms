package Data-Structures.utilities;

public class AnimalShelter {

    Queue cat;
    Queue dog;

    public AnimalShelter() {
        this.cat = new Queue();
        this.dog = new Queue();
    }

    public void enqueue(Animal animal) {
        if (animal instanceof Cat) {

            cat.enqueue(animal.name);

        } else if (animal instanceof Dog) {

            dog.enqueue(animal.name);

        } else {
            throw new IllegalArgumentException("Animal should be Dog or cat");
        }
    }

    public String dequeue(String pref) {
        if (cat.isEmpty() && dog.isEmpty()) {
            throw new NullPointerException("The two Queue is empty");
        }

        String result = "";
        if (pref.equals("cat")) {
            result = cat.dequeue();
        } else if (pref.equals("dog")) {
            result = dog.dequeue();
        } else {
            return null;
        }
        return result;
    }

}
