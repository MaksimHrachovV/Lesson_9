package Lesson9Нomework.Нomework3;

import java.util.Arrays;

public class MyQueue {

    public static String [] add(String[] arr, String element) {
        String[] array = Arrays.copyOf(arr, arr.length + 1);
        System.out.println("item add = " + Arrays.toString(array));
        array[arr.length] = element;

        return array;
    }
    public static String[] clear(String[] array){
        String [] arrayCopy=new String[array.length];
        return arrayCopy;
    }
    public static int size(String[] array){

        return array.length;
    }
    public static String[] poll(String[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.println("item poll = "+array[i]+" "+Arrays.toString(array));
            if (array[i]!=null){

                array[i]=null;

            }
        }
        return array;
    }
    public static String[] peek(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=null){
                System.out.println("item peek i= " + i + ", value = " + array[i]);
                return array;
            }
        }
        return array;
    }




    public static void main(String[] args) {
        String[] item = { "one"};
        System.out.println("----------------------------add---------------------------");
        item=add(item,"two");
        item=add(item,"three");
        item=add(item,"four");
        System.out.println("item add = " + Arrays.toString(item));
        System.out.println("----------------------------size---------------------------");
        System.out.println("item size = " + size(item));
        System.out.println("----------------------------peek---------------------------");
        item=peek(item);
        item=peek(item);
        System.out.println("dellItem[0] = " + (item[0] = null));
        item=peek(item);
        item=peek(item);
        System.out.println("dellItem[1] = " + (item[1] = null));
        item=peek(item);
        item=peek(item);
        System.out.println("----------------------------poll---------------------------");
        String[] item3 = { "one"};
        item3=add(item3,"two");
        item3=add(item3,"three");
        item3=add(item3,"four");
        item3=poll(item3);
        System.out.println("----------------------------clear---------------------------");
        String[] item2 = { "one"};
        item2=add(item2,"two");
        item2=add(item2,"three");
        item2=add(item2,"four");
        System.out.println("item add = " + Arrays.toString(item2));
        item2=clear(item2);
        System.out.println("item clear = " + Arrays.toString(item2));




    }

}
