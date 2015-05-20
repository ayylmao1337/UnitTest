package se.dhbw.unittest;

import org.junit.Ignore;
import org.junit.Test;

public class TimeoutIgnoreTest {

	@Test(timeout=1000)  
    public void testEndlessLoop() {
		while(true);
    }
	
	@Ignore("Test nicht bereit")  
	@Test(timeout=1000)  
    public void testEndlessLoopIgnore() {
		while(true);
    }
}
