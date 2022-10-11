package CollectionInfo;

import java.util.ArrayList;

public class ListInfo {
    //List is an interface and extends Collection interface
    //ArrayList, LinkedList & Vector (Stack extends Vector) implements List interface
    public void ListMethod(){
        ArrayList<Integer> IntArrayListObj = new ArrayList<Integer>();
        ArrayList<String> StringArrayListObj = new ArrayList<>();
        IntArrayListObj.add(1);
        IntArrayListObj.add(2);
        IntArrayListObj.add(3);
        IntArrayListObj.add(2, 5); //We can insert elements
        System.out.println("Index Of Element - "+IntArrayListObj.indexOf(3));
        IntArrayListObj.remove(IntArrayListObj.indexOf(3));
        //'remove' method for IntegerArray will consider index value, not the Object value in Array
        //Because Integer takes preceding than Object

        StringArrayListObj.add("Hello");
        StringArrayListObj.add("String");


        for (int i=0; i<IntArrayListObj.size(); i++){
            System.out.println("IntegerArray - "+IntArrayListObj.get(i));
        }
        StringArrayListObj.remove("Hello");
        for (int i=0; i<StringArrayListObj.size(); i++){
            System.out.println("StringArray - "+StringArrayListObj.get(i));
        }
        System.out.println("StringArray isEmpty - "+StringArrayListObj.isEmpty());

    }

    public static void main(String args[]){
        ListInfo ListInfoObj = new ListInfo();
        ListInfoObj.ListMethod();
    }

}
