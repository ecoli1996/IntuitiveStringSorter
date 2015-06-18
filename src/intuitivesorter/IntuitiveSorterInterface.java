
package intuitivesorter;

import java.util.ArrayList;

/**
 *
 * @author evc1996
 */
public interface IntuitiveSorterInterface {
    
    public ArrayList<String> sort(ArrayList<String> listOfStrings, boolean ascending);

    public ArrayList<String> sort(String[] stringList, boolean ascending);
}
