package dvprg1;
import org.testng.Assert;

public class ResultTest {
	@Test
	public void testPass() {
		Assert.assertEquals(Test.display(55),"pass");
	}
	@Test
	public void testFail() {
		Assert.assertEquals(Test.display(35),"fail");
	}
	@Test
	public void testInvalid() {
		Assert.assertEquals(Test.display(-10),"invalid");
	}
	

}
