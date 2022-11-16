package daonguocphantu;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Stack {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(array));

        Deque<Integer> stack = new LinkedList<>();
        for (Integer integer : array) {
            stack.addLast(integer);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.removeLast();
        }

        System.out.println(Arrays.toString(array));
    }
}
