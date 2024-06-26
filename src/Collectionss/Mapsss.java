package Collectionss;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapsss {

    // Map ///// HashMap // LinkedHashMap // treeMap

    void mapdemo(){
        Map<String,Integer> hashap=new HashMap<>();
        Map<String,Integer> linkedhashMap=new LinkedHashMap<>();
        Map<String,Integer> treemap=new TreeMap<>();

        String[] teams={"CSK","MI","KKR","SRH","CSK"};
        int[] winnings={5,5,3,2,7};
        for(int i=0;i<teams.length;i++){
            hashap.put(teams[i],winnings[i]);
            linkedhashMap.put(teams[i],winnings[i]);
            treemap.put(teams[i],winnings[i]);
        }
        System.out.println("hashap   "+hashap);
        System.out.println("linkedhashMap   "+linkedhashMap);
        System.out.println("treemap   "+treemap);

    }
}
