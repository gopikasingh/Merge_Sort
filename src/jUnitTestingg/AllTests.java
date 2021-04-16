package jUnitTestingg;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({testAddNums.class, testaddStrings.class})
public class AllTests {

}
