package test;

import io.micronaut.test.annotation.MicronautTest;
import io.micronaut.test.annotation.MockBean;
import org.junit.jupiter.api.Test;

@MicronautTest
public class IntegrationTest {

	@Test
	public void test() {
		// do nothing
	}

	@MockBean(MyBean.class)
	public MyBean mockBean() {
		return new MyBean("I'm the mock bean");
	}

}
