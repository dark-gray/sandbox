package my.apps.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(path = "/greeting", method = RequestMethod.GET)
	public Greeting greeting(@RequestParam(name = "name", defaultValue = "%username%") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String about(@RequestParam(name = "id", defaultValue = "0") Long id) {
		return String.format("Вы отправили id = %d.", id);
	}
}
