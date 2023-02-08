package Lesson9Нomework.Нomework5;

import java.util.Arrays;

public class MyHashMap<K, V> {
    public Node<K, V>[] table=new Node[5];

    void put(K key, V value) {
        Node item = new Node<>(key, value);
        for (int i = 0; i < table.length; i++) {
            if (table[i]==null) {

                table[i]=item;
                System.out.println(Arrays.toString(table));
                return;
            }
        }
  }
    public Object[] remove(Object index) {
        int count=0;
        Node<K, V>[] tableCopy=new Node[table.length-1];
        for (int i = 0; i < table.length; i++) {
            if(table[i].getKey()!=index){
                tableCopy[count]=table[i];
                count++;
            }
        }
        return table=tableCopy;
    }
    public Object get(Object index) {
        String value = null;
        for (int i = 0; i < table.length; i++) {
            if(table[i].getKey()==index){
                value= (String) table[i].getValue();
            }
        }
        return value ;
    }

    public Object[] clear(){
        Node<K, V>[] tableCopy= new Node[]{};

        return table=tableCopy;
    }
    public Object size(){
        return table.length;
    }



 public static void main(String[] args) {
        MyHashMap launch=new MyHashMap();
     System.out.println("----------------------------put-----------------------------");
     launch.put(1,"grmavi1");
     launch.put(2,"grmavi2");
     launch.put(3,"grmavi3");
     launch.put(4,"grmavi4");
     launch.put(5,"grmavi5");
     System.out.println("----------------------------get------------------------------");
     System.out.println("launch.get() = " + launch.get(3));
     System.out.println("----------------------------remove---------------------------");
     System.out.println("launch.remove() = " + Arrays.toString(launch.remove(1)));
     System.out.println("launch.remove() = " + Arrays.toString(launch.remove(2)));
          System.out.println("----------------------------size----------------------------");
     System.out.println("launch.size() = " + launch.size());
     System.out.println("----------------------------clear---------------------------");
     System.out.println("launch.clear() = " + Arrays.toString(launch.clear()));

 }
}
