package Data-Structures.utilities;

import java.util.NoSuchElementException;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test(expected = NullPointerException.class)
    public void testAnimalShelterEmpty(){
        AnimalShelter a = new AnimalShelter();
        assertEquals(new NullPointerException(), a.dequeue("cat"));
    }

    @Test
    public void testAnimalShelterEnqueueCat(){
        AnimalShelter a = new AnimalShelter();
        Animal cat = new Cat("MshMsh");
        a.enqueue(cat);
        assertEquals("the output is ","MshMsh" ,a.cat.peek());
    }
    @Test
    public void testAnimalShelterEnqueueDog(){
        AnimalShelter a = new AnimalShelter();
        Animal dog = new Dog("Jack");
        a.enqueue(dog);
        assertEquals("the output is ","Jack" ,a.dog.peek());
    }

    @Test
    public void testAnimalShelterDequeueCat(){
        AnimalShelter a = new AnimalShelter();
        Animal cat = new Cat("MshMsh");
        a.enqueue(cat);
        assertEquals("the output is ","MshMsh" ,a.dequeue("cat"));
    }
    @Test
    public void testAnimalShelterDequeueDog(){
        AnimalShelter a = new AnimalShelter();
        Animal dog = new Dog("Jack");
        a.enqueue(dog);
        assertEquals("the output is ","Jack" ,a.dequeue("dog"));
    }
    @Test
    public void testAnimalShelterDequeueNull(){
        AnimalShelter a = new AnimalShelter();
        Animal dog = new Dog("Jack");
        a.enqueue(dog);
        assertEquals("the output is ",null,a.dequeue(null));
    }

    @Test
    public void testMultiBracketValidationTrue() {
        MultiBracketValidation m = new MultiBracketValidation();
        assertTrue("the output is ", m.multiBracketValidation("()[[Extra Characters]]"));
    }

    @Test
    public void testMultiBracketValidation() {
        MultiBracketValidation m = new MultiBracketValidation();
        assertFalse("the output is ", m.multiBracketValidation("[({}]"));
    }

    @Test
    public void testMultiBracketValidation() {
        MultiBracketValidation m = new MultiBracketValidation();
        assertTrue("the output is ", m.multiBracketValidation(""));
    }

}
