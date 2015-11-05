package common;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Shruthi Routhu
 */
public class TurkeyByWeight implements Comparator<Turkey> {
    
    
    public int compare(Turkey t1, Turkey t2) {
         return new CompareToBuilder()
               .append(t1.getWeight(), t2.getWeight())
               .toComparison();
    }
    

}