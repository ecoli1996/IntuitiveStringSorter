
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

        
        IntuitiveSorter iSort1 = new IntuitiveSorter(listOfStrings);
        iSort1.sort();
        System.out.println(iSort1.toString());
        
        iSort1.isAscending(false);
        System.out.println(iSort1.toString());
        
        
        
        String[] list2 = {"1z1","1z2","1z14","1d","1c","1b","foo 03","foo 00003"};
        IntuitiveSorter iSort2 = new IntuitiveSorter(list2);
        iSort2.sort();
        System.out.println(iSort2.toString());
        
        iSort2.isAscending(false);
        System.out.println(iSort2.toString());
        
        
    }

}
