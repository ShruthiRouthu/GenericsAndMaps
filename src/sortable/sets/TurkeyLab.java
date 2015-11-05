package sortable.sets;

import common.Turkey;
import common.TurkeyByBreed;
import common.TurkeyByWeight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Shruthi Routhu
 */
public class TurkeyLab {
    public static void main(String[] args) {
        
           
        Turkey t1 = new Turkey("Abc", 5, "SomeBreed1");

        Turkey t2 = new Turkey("Bff", 4.5, "SoeBreed8");
        Turkey t3 = new Turkey("Bff", 4.5, "Somebreed4");

        Turkey t4 = new Turkey("Dxyx", 10, "HugeBreed");
        Turkey t5 = new Turkey("Dzyz", 2, "SmallBreed");

        Set<Turkey> set = new TreeSet<Turkey>();

        set.add(t5);
        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
       

        List<Turkey> list = new ArrayList<Turkey>(set);

        for(Turkey t : list){
            System.out.println(t);
        }
        
        Collections.sort(list, new  TurkeyByWeight());
      //  Collections.sort(list, new  TurkeyByBreed());
        
         for(Turkey t : list){
            System.out.println(t);
        }
//        

        
    }
 
            
    
    
}
