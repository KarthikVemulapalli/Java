package CollectionInfo;

import java.util.ArrayList;

public class ListInfo {

    /* List is an interface and extends Collection interface
        ArrayList(class) | LinkedList(class) | Vector(class) implements List
            Stack(class) extends Vector
    */

    /*
    ArrayList:
        * Fast access to elements because of Index based search.
        * Insertion and Deletions are slow, because these alter other elements index positions.
        * Initial capacity of ArrayList is 10.
        * If the initial capacity is filled. Then it will create a new array of 1.5 size of old one.
            After creating new array java will copy all the old elements to the new one. So it is good practise to mention relevant size of arraylist.
     */
    public void ArrayListMethod(){

        ArrayList<Integer> IntArrayListObj = new ArrayList<Integer>();
        ArrayList<String> StringArrayListObj = new ArrayList<>();
        ArrayList NoObjectArrayList = new ArrayList(20);

        IntArrayListObj.add(1);   //Adding element without mentioning index, it adds to last index
        IntArrayListObj.add(2);
        IntArrayListObj.add(4);
        IntArrayListObj.add(2, 5); //We can insert elements
        System.out.println("IntArrayList Index Of Element - "+IntArrayListObj.indexOf(4));
        IntArrayListObj.remove(IntArrayListObj.indexOf(4));    //Removes element
        /* Note:
            'remove' method for IntegerArray will consider index value, not the Object value in Array
            Because Integer takes preceding than Object
        */
        for (int i=0; i<IntArrayListObj.size(); i++){
            System.out.println("IntegerArrayList - "+IntArrayListObj.get(i));    //Retrieves element in index
        }

        StringArrayListObj.add("Hello");
        StringArrayListObj.add("Hi");
        StringArrayListObj.remove("Hello");
        for (int i=0; i<StringArrayListObj.size(); i++){
            System.out.println("StringArrayList - "+StringArrayListObj.get(i));
        }
        System.out.println("StringArray isEmpty - "+StringArrayListObj.isEmpty());

        NoObjectArrayList.add(10);
        NoObjectArrayList.add("Hello");
        NoObjectArrayList.set(0, 30);
        for (int i=0; i<NoObjectArrayList.size(); i++){
            System.out.println("NoObjectArrayList - "+NoObjectArrayList.get(i));
        }
    }

    public static void main(String args[]){
        ListInfo ListInfoObj = new ListInfo();
        ListInfoObj.ArrayListMethod();
    }

}
