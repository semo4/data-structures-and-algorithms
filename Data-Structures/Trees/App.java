/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Trees;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        t.add(10);
        t.add(8);
        t.add(12);
        t.add(11);
        t.add(9);
        t.add(7);
        t.add(13);

        System.out.println(t.preOrder());
        System.out.println(t.inOrder());
        System.out.println(t.postOrder());
        System.out.println(t.findMaximumValue());

    }
}
