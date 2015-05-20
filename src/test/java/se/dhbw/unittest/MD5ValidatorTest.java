package se.dhbw.unittest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class MD5ValidatorTest {
	private MD5Validator validator;
	private String md5;
	private boolean expectedResult;
	
	public MD5ValidatorTest(String md5, boolean expectedResult) {
		super();
		this.md5 = md5;
		this.expectedResult = expectedResult;
	}

	@Before
	public void setUp(){
		validator= new MD5Validator();
	}
	
	@Parameters(name= "{index}: isValidMD5({0})={1}")
 	public static Iterable<Object[]> data() {
 		return Arrays.asList(new Object[][] { 
 		{ "f7c9f6dbd325947e35699b9795f4ce85", true },
		{ "d0da33b4dff4b228fa6c3b2bb64826f0", true },
                { "hallo", false },
                { "d0da33b4d", false },
                { "JUnit", false },
                { "okok", false }
            }
 	);
     }
	@Test
	public void test_validDomains() {
		assertEquals(expectedResult,validator.isValidMD5(md5));
	}
	
}
