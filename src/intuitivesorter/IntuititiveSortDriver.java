
package intuitivesorter;

import java.util.ArrayList;

/**
 *
 * @author evc1996
 */
public class IntuititiveSortDriver {
        public static void main(String[] args) {
        
        
        ArrayList<String> listOfStrings = new ArrayList<String>();
        
        listOfStrings.add("a12b");
        listOfStrings.add("a2b1");
        listOfStrings.add("abc");

        
        listOfStrings = IntuitiveStringSorter.sort(listOfStrings, true);
        System.out.println(listOfStrings.toString());
        
        listOfStrings = IntuitiveStringSorter.sort(listOfStrings, false);
        System.out.println(listOfStrings.toString());
        
        
        ArrayList<String> stringList;
        
        String[] list2 = {"1z1","1z2","1z14","1d","1c","1b","foo 03","foo 00003"};
        stringList = IntuitiveStringSorter.sort(list2, true);
        System.out.println(stringList.toString());
        
        stringList = IntuitiveStringSorter.sort(list2, false);
        System.out.println(stringList.toString());
        
        
    }


}
