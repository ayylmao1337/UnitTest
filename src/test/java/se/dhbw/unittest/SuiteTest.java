package se.dhbw.unittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BasicTest.class,
        ExceptionTest.class,
        TimeoutIgnoreTest.class,
        MD5ValidatorTest.class
})
public class SuiteTest {

}
