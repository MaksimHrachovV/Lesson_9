package Lesson9Нomework.Нomework4;

import java.util.Arrays;

public class MyStack {
    public static String [] push(String[] arr, String element) {
        String[] array = Arrays.copyOf(arr, arr.length + 1);
        System.out.println("item push = " + Arrays.toString(array));
        array[arr.length] = element;

        return array;
    }
    public static String[] remove(String[] array, int index){
        String [] arrayCopy=new String[array.length-1];
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (i!=index){
                arrayCopy[count]=array[i];
                count++;
            }
        }

        return arrayCopy;
    }


    public static String[] clear(){
        String [] arrayCopy={};
        return arrayCopy;
    }
    public static int size(String[] array){

        return array.length;
    }
    public static String[] pop(String[] array){

        for (int i = array.length-1; i>=0; i--) {
            System.out.println("item pop = "+array[i]+" "+Arrays.toString(array));
            if (array[i]!=null){

                array[i]=null;

            }
        }
        return array;
    }
    public static String[] peek(String[] array) {
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i]!=null){
                System.out.println("item peek i= " + i + ", value = " + array[i]);
                return array;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] item = { "one"};
        System.out.println("----------------------------push---------------------------");
        item=push(item,"two");
        item=push(item,"three");
        item=push(item,"four");
        System.out.println("item push = " + Arrays.toString(item));
        System.out.println("----------------------------remove---------------------------");
        String[] item4 = { "one"};
        item4=push(item4,"two");
        item4=push(item4,"three");
        item4=push(item4,"four");
        System.out.println("item removeStart = " + Arrays.toString(item4));
        item4=remove(item4,1);
        System.out.println("item remove1 = " + Arrays.toString(item4));
        item4=remove(item4,2);
        System.out.println("item remove2 = " + Arrays.toString(item4));

        System.out.println("----------------------------size---------------------------");
        System.out.println("item size = " + size(item));
        System.out.println("----------------------------peek---------------------------");
        item=peek(item);
        System.out.println("dellItem[3] = " + (item[3] = null));
        item=peek(item);
        System.out.println("dellItem[2]= " + (item[2] = null));
        item=peek(item);
        System.out.println("----------------------------pop---------------------------");
        String[] item3 = { "one"};
        item3=push(item3,"two");
        item3=push(item3,"three");
        item3=push(item3,"four");
        System.out.println("item push = " + Arrays.toString(item3));
        item3=pop(item3);
        System.out.println("----------------------------clear---------------------------");
        String[] item2 = { "one"};
        item2=push(item2,"two");
        item2=push(item2,"three");
        item2=push(item2,"four");
        System.out.println("item push = " + Arrays.toString(item2));
        item2=clear();
        System.out.println("item clear = " + Arrays.toString(item2));




    }
}
