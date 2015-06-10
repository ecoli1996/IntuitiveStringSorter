
package intuitivesorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author evc1996
 */
public class IntuitiveSorterTest {
    
    public IntuitiveSorterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }



    /**
     * Test of sort method, of class IntuitiveSorter.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        String[] listOfStrings = {"1z1","1z2","1z14","1d","1c","1b","foo 03","foo 00003"};
        IntuitiveSorter instance = new IntuitiveSorter(listOfStrings);
        instance.sort();
        
        ArrayList<String> result = instance.getList();
        
        ArrayList<String> expResult = new ArrayList<>(Arrays.asList(listOfStrings));
        ComparatorImpl comparator = new ComparatorImpl();
        Collections.sort(expResult, comparator);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
