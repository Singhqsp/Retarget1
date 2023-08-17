package Video71RetryAnalyzerByAwatibility;

import java.time.Duration;

import org.awaitility.Awaitility;
import org.testng.annotations.Test;

public class RetryAwatibility {
	@Test
	public void m1()
	{
		MainClass c = new MainClass();
		System.out.println(c.test());
		Awaitility.await().atMost(Duration.ofSeconds(20))
		.pollDelay(Duration.ofSeconds(2))
		.until(() -> MainClass.test()==200);
	}

}
