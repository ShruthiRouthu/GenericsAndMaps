
package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Shruthi Routhu
 */
public class Turkey implements Comparable<Turkey>{
    
    private String turkeyID ;
    private double weight ;
    private String breed ;

    public Turkey(String turkeyID, double weight, String breed) {
        this.turkeyID = turkeyID;
        this.weight = weight;
        this.breed = breed;
    }

//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 59 * hash + Objects.hashCode(this.turkeyID);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Turkey other = (Turkey) obj;
//        if (!Objects.equals(this.turkeyID, other.turkeyID)) {
//            return false;
//        }
//        return true;
//    }
    
    

    @Override
    public String toString() {
        return "Turkey{" + "turkeyID=" + turkeyID + ", weight=" + weight + ", breed=" + breed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.turkeyID != null ? this.turkeyID.hashCode() : 0);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turkey other = (Turkey) obj;
        if ((this.turkeyID == null) ? (other.turkeyID != null) : !this.turkeyID.equals(other.turkeyID)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        return true;
    }
        
    @Override
    public int compareTo(Turkey o) {
         return new CompareToBuilder()
               .append(this.turkeyID, o.turkeyID)
               .append(this.weight,o.getWeight())  
               .toComparison();
        
    }
    
    public final String getTurkeyID() {
        return turkeyID;
    }

    public final void setTurkeyID(String turkeyID) {
        this.turkeyID = turkeyID;
    }

    public final double getWeight() {
        return weight;
    }

    public  final void setWeight(double weight) {
        this.weight = weight;
    }

    public  final String getBreed() {
        return breed;
    }

    public  final void setBreed(String breed) {
        this.breed = breed;
    }

   
    
    
    
    
    
}
