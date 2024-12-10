import org.testng.Assert;
import org.testng.annotations.Test;

public class TimePass {
	@Test
	public void display() {
		Assert.fail();
		System.out.println("Hiiiiiii");
	}
	
	@Test
	public void show() {
		
		System.out.println("Byee");
	}
	
	@Test
	public void performmm() {
		System.out.println("How are you");
	}
}	
