package Lesson9Нomework.Нomework5;

class Node<K,V> {
    K key;
    V value;

    Node<K,V> next;


    Node(K key,V value) {
        this.key = key;
        this.value = value;
        next=null;
    }

    public  K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key +"=" + value;
    }
}

