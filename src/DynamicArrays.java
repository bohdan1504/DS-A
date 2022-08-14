import java.util.*;

public class DynamicArrays {

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.delete("A");

//        dynamicArray.insert(3, "data");
//        dynamicArray.delete("C");




        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());

//        System.out.println(dynamicArray.search("D"));


    }
}

