package ED_JUNIT;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalculadoraTest.class, CalculadoraTest2.class, CalculadoraTest3.class })
public class AllTests {

}
