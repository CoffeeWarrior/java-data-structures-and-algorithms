package JavaTextBook.ChapterOne;
import java.util.*;

public class C1_2 {
    public boolean distinctValues(int[] values){
        //return false if there are duplicates in the array
        //return true if there are no duplicates in the array
        HashSet<Integer> valuesEncountered = new HashSet<>();
        for(int i=0; i< values.length; i++){
            if(!valuesEncountered.add(values[i])){
                return false;
            }
        }
        return true;

    }
}
