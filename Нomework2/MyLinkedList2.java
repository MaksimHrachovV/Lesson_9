package Lesson9Нomework.Нomework2;

class MyLinkedList2<T> {
    Node<T> start;
    int step = 0;

    public void add(T item) {
        Node<T> node = new Node<>(item);
        Node<T> secondNode = start;
        if (start == null) {
            start = node;
        } else {
            while (secondNode.next != null) {
                secondNode = secondNode.next;
            }
            secondNode.next = node;
            step++;

        }
        System.out.println("node = " + node.item);
    }

    public T get(int index) {
        Node<T> node = start;
        int number = 0;
        while (start != null) {
            if (index == number & number <= step) {
                return node.item;
            }
            node = node.next;
            number++;
        }
        return (T) node;
    }
    public void size(){
        System.out.println("launch.size = " + (step+1));
    }

    public void clear(){
        for (Node<T> x = start; x != null; ) {
             Node<T> next = x.next;
            x.item = null;
            x.next = null;

            x = next;
        }
        start = null;

        step++;

    }
    public T remove(int index) {
        Node<T> node = start;
        Node<T> nextNode = null;
        T el = null;

        int step = 0;
        while (node != null) {
            if (index == step) {
                if (node == start) {
                    el = node.item;
                    node = node.next;
                    start = node;
                } else {
                    nextNode.next = node.next;
                    el = node.item;
                }
            }
            nextNode = node;
            node = node.next;
            step++;
        }

        if( el == null)
            throw new IndexOutOfBoundsException();

        step--;
        return el;
    }



    public static void main(String[] args) {
        MyLinkedList2 launch=new MyLinkedList2();
        launch.add("one");
        launch.add("two");
        launch.add("three");
        launch.add("four");
        launch.add("five");

        System.out.println("launch.remove() = " + launch.remove(3));

        System.out.println("launch.get = " + launch.get(3));
        launch.size();
        launch.clear();
        System.out.println("launch.clear = " + launch.get(0)+", "+launch.get(1)+", "+launch.get(2)+", "+launch.get(3)+", "+launch.get(4)+", "+launch.get(5));



    }
}
