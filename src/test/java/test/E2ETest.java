package test;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.jupiter.api.Test;

public class E2ETest {

	@Test
	public void test() {
		ApplicationContext.build().run(EmbeddedServer.class).stop();
	}

}
