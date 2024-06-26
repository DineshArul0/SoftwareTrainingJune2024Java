package Collectionss;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setttt {


    void setDemo(){
        //HashSet LinkedSet TreeSet

        //Set will not accept duplicate value
        //Hashset will not have the insertion order Linked set will have the insertion order
        // tree set will be of sorted

        int[] intarray={1,2,3,65,-12,78,-5,0,3,6,9,1};
        System.out.println("Length of intarray is "+intarray.length);

        Set<Integer> hashset=new HashSet<>();
        Set<Integer> linkedset=new LinkedHashSet<>();
        Set<Integer> treeset=new TreeSet<>();

        for(int element:intarray){
            hashset.add(element);
            linkedset.add(element);
            treeset.add(element);
        }
        System.out.println("HashSet "+hashset);
        System.out.println("linkedset "+linkedset);
        System.out.println("treeset "+treeset);
    }
}
