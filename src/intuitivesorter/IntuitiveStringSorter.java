
package intuitivesorter;

/**
 *
 * @author evc1996
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class IntuitiveStringSorter {
    
    //Sorts the list of strings using ComparatorImpl as a Comparator
    //  and the Collections sort method
    //The "ascending" variable sets whether or not the strings will be 
    //  sorted in ascending or descending order
    public static ArrayList<String> sort(ArrayList<String> listOfStrings, boolean ascending) {
        
        ComparatorImpl comparator = new ComparatorImpl();
        Collections.sort(listOfStrings, comparator);
        
        if (!ascending) {
            Collections.reverse(listOfStrings);
        }
        
        return listOfStrings;
    }

    public static ArrayList<String> sort(String[] stringList, boolean ascending) {
        
        ArrayList<String> listOfStrings = new ArrayList<>(Arrays.asList(stringList));
        
        ComparatorImpl comparator = new ComparatorImpl();
        Collections.sort(listOfStrings, comparator);
        
        if (!ascending) {
            Collections.reverse(listOfStrings);
        }
        
        return listOfStrings;
    }
    
}

