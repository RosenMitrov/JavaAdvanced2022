package JavaAdvanced.ad09IteratorsAndComparators.exercises.P03StackIterator;

import java.util.Iterator;

public class MyStack implements Iterable<Integer> {

    private Node top;
    private int size;

    public MyStack() {
    }

    public void push(String... values) {
        for (String value : values) {
            int number = Integer.parseInt(value);
            this.top = new Node(number, this.top);
            this.size++;
        }
    }

    public int pop() {
        ensureNotEmpty();
        int element = this.top.element;
        this.top = this.top.prev;
        this.size--;
        return element;
    }

    private void ensureNotEmpty() {
        if (this.top == null) {
            throw new IllegalStateException("No elements");
        }
    }

    public void print() {
        Node node = this.top;
        while (node != null) {
            System.out.println(node.element);
            node = node.prev;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Integer next() {
                int element = this.current.element;
                current = this.current.prev;
                return element;
            }
        };
    }


    private static class Node {
        private int element;
        private Node prev;

        public Node(int element, Node prev) {
            this.element = element;
            this.prev = prev;
        }
    }


}
