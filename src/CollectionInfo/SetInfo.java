package CollectionInfo;

import java.util.*;

public class SetInfo {

    public void HashSetMethod(){
        Random RandomObj = new Random();
        List<Integer> SampleList = new ArrayList<>();
        for (int i=0; i<10; i++){
            SampleList.add(RandomObj.nextInt(5));    //Randomly pick one integer from 0 to 5
        }
        Set<Integer> SampleSet = new HashSet<>(SampleList); //This will store all elements from list don't allow duplicate elements
        System.out.println("ArrayList - "+SampleList);
        System.out.println("HashSet - "+SampleSet);

        //Order of Insertion inside different Sets
        Set<Integer> SampleHashSet = new HashSet<>();
        Set<Integer> SampleLinkedHashSet = new LinkedHashSet<>();
        Set<Integer> SampleTreeSet = new TreeSet<>();
        Set<String> SampleStrTreeSet = new TreeSet<>();
        int Number;
        for(int i=0; i<5;i++) {
            Number = RandomObj.nextInt(3);
            System.out.println("Element Insertion Order - " + Number);
            SampleHashSet.add(Number);
            SampleLinkedHashSet.add(Number);
            SampleTreeSet.add(Number);
        }
        System.out.println("HashSet Order - "+SampleHashSet);
        System.out.println("LinkedHashSet Order - "+SampleLinkedHashSet);
        System.out.println("TreeSet Order - "+SampleTreeSet);

        Iterator<Integer> SetIterator = SampleHashSet.iterator();
        while(SetIterator.hasNext()){
            System.out.println("Element Inside HashSet - "+SetIterator.next());
        }

        SampleStrTreeSet.add("ab");
        SampleStrTreeSet.add("de");
        SampleStrTreeSet.add("xy");
        SampleStrTreeSet.add("lm");
        SampleStrTreeSet.add("ij");
        System.out.println("TreeSet String Order - "+SampleStrTreeSet);
    }

    public static void main(String args[]){
        SetInfo SetInfoObj = new SetInfo();
        SetInfoObj.HashSetMethod();
    }

}
