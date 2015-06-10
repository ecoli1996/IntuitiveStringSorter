
package intuitivesorter;

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
public class ComparatorImplTest {
    
    public ComparatorImplTest() {
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
     * Test of getNumberString method, of class ComparatorImpl.
     */
    @Test
    public void testGetNumberString() {
        System.out.println("getNumberString");
        ComparatorImpl instance = new ComparatorImpl();
        
        String s = "a12b1";
        int marker = 0;
        String expResult = "12";
        String result = instance.getNumberString(s, marker);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compare method, of class ComparatorImpl.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        ComparatorImpl instance = new ComparatorImpl();
        
        
        String string1 = "a4b12";
        String string2 = "a20b100";
        int expResult = -16;
        int result = instance.compare(string1, string2);
        assertEquals(expResult, result);
        
        string1 = "abc";
        string2 = "abc";
        expResult = 0;
        result = instance.compare(string1, string2);
        assertEquals(expResult, result);
        
        string1 = "23b";
        string2 = "22a";
        expResult = 1;
        result = instance.compare(string1, string2);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
