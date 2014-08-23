package adt.hashtable;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ HashFunctionDivisionMethodImplTest.class,
		HashtableOpenAddressLinearProbingImplTest.class })
public class AllTests {

}
