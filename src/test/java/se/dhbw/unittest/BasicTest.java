package se.dhbw.unittest;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
 
public class BasicTest {
	
    private List<String> wordlist;
 
    //Testklasse vorbereiten
    @BeforeClass
    public static void setUpClass() {
    	System.out.println("BeforeClass wurde ausgefuehrt");
    }
 
    //Testklasse clean up
    @AfterClass
    public static void tearDownClass() {
    	System.out.println("AfterClass wurde ausgefuehrt");
    }
    
    //Test vorbereiten
    @Before
    public void setUp() {
        wordlist = new ArrayList<String>();
        System.out.println("Before wurde ausgefuehrt");
    }
    //Test clean up
    @After
    public void tearDown() {
        wordlist.clear();
        System.out.println("After wurde ausgefuehrt");
    }
 
    //Test: Ueberpruefen ob die in der vorbereitung erstellte Liste leer ist
    @Test
    public void testEmptyList() {
        assertTrue(wordlist.isEmpty());
        System.out.println("testEmptyList wurde ausgefuehrt");
    }
 
    //Test: Item in Liste einfuegen und ueberpruefen ob 1 Item in der Liste ist
    @Test
    public void testOneItemInList() {
        wordlist.add("itemA");
        assertEquals(1, wordlist.size());
        System.out.println("testOneItemInList wurde ausgefuehrt");
    }
}
