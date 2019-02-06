package app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class HelloController {

    val idGenerator = AtomicLong()

    @GetMapping("/hello")
    fun hello(name: String): Hello {
        val id = idGenerator.incrementAndGet()
        return Hello(id, "$name, from kotlin!")
    }
}