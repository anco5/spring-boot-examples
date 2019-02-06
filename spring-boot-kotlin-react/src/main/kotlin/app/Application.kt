package app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}

