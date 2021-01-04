package JavaTextBook.ChapterOne;

public class C1_1 {
    boolean determineIfOddProduct(int[] values){
        boolean containsOddNumber = false;
        for(int i = 0; i < values.length; i++){
            if(values[i] % 2 != 0){
                if(containsOddNumber){
                    return true;
                } else {
                    containsOddNumber = true;
                }
            }
        }
        return false;
    }
}
