package se.dhbw.unittest;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class ExceptionTest {
	private List<String> wordlist;
	
    //Test vorbereiten
    @Before
    public void setUp() {
        wordlist = new ArrayList<String>();
        System.out.println("Before wurde ausgefuehrt");
    }
    
	@Test(expected = NullPointerException.class)  
    public void testEmptyList() {
		wordlist=null;
        assertTrue(wordlist.isEmpty());
        System.out.println("testEmptyList wurde ausgefuehrt");
    }
 
}