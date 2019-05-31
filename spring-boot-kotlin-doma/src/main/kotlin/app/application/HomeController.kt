package app

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class HomeController {
    @GetMapping
    fun home(model: Model): String {
        model.addAttribute("message", "Hello")
        return "home"
    }
}