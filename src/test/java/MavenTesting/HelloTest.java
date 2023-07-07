package MavenTesting;

import org.testng.annotations.Test;

public class HelloTest {

	@Test
	public void m1() {
		System.out.println("Hello");
	}
	@Test
	public void m2() {
		System.out.println("Hello method2 update in branch1");
	}
}
