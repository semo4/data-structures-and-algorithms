/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Trees;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        // BinaryTree t = new BinaryTree();
        // t.add(10);
        // t.add(8);
        // t.add(12);
        // t.add(11);
        // t.add(9);
        // t.add(7);
        // t.add(13);

        // System.out.println(t.preOrder());
        // System.out.println(t.inOrder());
        // System.out.println(t.postOrder());
        // System.out.println(t.findMaximumValue());

        //  FizzBuzzTree n = new FizzBuzzTree();
        //  System.out.println(n.fizzBuzzTree(t).preOrder());


        BinaryTree test = new BinaryTree();

        BinaryTree t = new BinaryTree();
        t.add(150);
        t.add(100);
        t.add(250);
        t.add(75);
        t.add(160);
        t.add(200);
        t.add(350);
        t.add(125);
        t.add(175);
        t.add(300);
        t.add(500);

        BinaryTree b = new BinaryTree();
        b.add(42);
        b.add(100);
        b.add(600);
        b.add(15);
        b.add(160);
        b.add(200);
        b.add(350);
        b.add(125);
        b.add(175);
        b.add(4);
        b.add(500);

        System.out.println(test.tree_Intersection(t,b));

    }
}
