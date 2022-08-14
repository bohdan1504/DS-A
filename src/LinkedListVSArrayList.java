import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVSArrayList {

    public static void main(String[] args) {

        long startTime;
        long endTime;
        long elapsedTime;

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for (int i=0; i <= 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }


        // ********************LinkedList********************
        startTime = System.nanoTime(); //get start time

//        linkedList.get(0); //get first element of the list
//        linkedList.get(500000);
//        linkedList.get(999999);
//        linkedList.remove(0);
//        linkedList.remove(500000);
        linkedList.remove(999999);


        endTime = System.nanoTime(); //get end time
        elapsedTime = endTime - startTime; //total time it took

        System.out.println("LinkedList: \t" + elapsedTime + " ns"); //display it



        // ********************ArrayList********************
        startTime = System.nanoTime();

//        arrayList.get(0);
//        arrayList.get(500000);
//        arrayList.get(999999);
//        arrayList.remove(0);
//        arrayList.remove(500000);
        arrayList.remove(999999);


        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("ArrayList: \t\t" + elapsedTime + " ns");


    }

}
