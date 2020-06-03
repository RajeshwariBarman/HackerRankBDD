package TestRunner;




import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Test_Before {
	
	@Before
	public void add()
	{
		System.out.println("This is diff pckg before");
		
	}
	
	@After
	public void add1()
	{
		System.out.println("This is diff pckg after");
	}

}
