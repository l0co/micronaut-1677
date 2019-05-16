package test;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;

import javax.inject.Singleton;

@Singleton
public class MyBean implements ApplicationEventListener<StartupEvent> {

	protected String message;

	public MyBean() {
		this("I'm the original bean");
	}

	public MyBean(String message) {
		this.message = message;
	}

	@Override
	public void onApplicationEvent(StartupEvent event) {
		System.out.println(message);
	}
	
}
