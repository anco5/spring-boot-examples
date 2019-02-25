package app.web

import app.model.Post
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PostApi {
    @GetMapping("/findAll")
    fun findAll(): Post {
        return Post(1, "Hello World", "Hello World Application");
    }
}