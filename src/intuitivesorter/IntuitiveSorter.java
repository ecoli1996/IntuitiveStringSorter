
package intuitivesorter;

/**
 *
 * @author evc1996
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class IntuitiveSorter {
    private ArrayList<String> listOfStrings;
    private boolean ascending = true;
    private boolean sorted;
    
    public IntuitiveSorter(ArrayList<String> listOfStrings) {
        this.listOfStrings = listOfStrings;
        sorted = false;
    }
    
    public IntuitiveSorter(String[] listOfStrings) {
        this.listOfStrings = new ArrayList<>(Arrays.asList(listOfStrings));
        sorted = false;
    }
    
    
    public ArrayList<String> getList() {
        return listOfStrings;
    }
    
    //sets whether or not the strings will be sorted in ascending or descending order
    public void isAscending(boolean trueOrFalse) {
        ascending = trueOrFalse;
        
        if (sorted) {
            Collections.reverse(listOfStrings);
        }
    }
    
    //Sorts the list of strings using an insertion sort
    public void sort() {
        ComparatorImpl comparator = new ComparatorImpl();
        Collections.sort(listOfStrings, comparator);
        
        if (!ascending) {
            Collections.reverse(listOfStrings);
        }
        
        sorted = true;

    }
    
    //Returns a string of the contents of listOfStrings with each string on a new line
    @Override
    public String toString() {
        String string = "";
        
        string = listOfStrings.stream().map((listOfString) -> listOfString + "\n").reduce(string, String::concat);
        
        return string;
    }
}

