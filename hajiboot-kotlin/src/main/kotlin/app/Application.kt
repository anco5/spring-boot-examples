package app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class Application {
	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			runApplication<Application>(*args)
		}
	}

	@GetMapping("/")
	fun home(): String {
		return "Hello Spring Boot!"
	}
}
