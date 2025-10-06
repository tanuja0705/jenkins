package tpass;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class TestScript {
	@Test
	public void m2(XmlTest t) {
		System.out.println(t.getParameter("username"));
	}
}
