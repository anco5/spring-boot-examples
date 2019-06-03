package app.application

import app.domain.repository.EmployeeRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class EmployeeController(
    private val employeeRepository: EmployeeRepository
) {
    @GetMapping
    fun index() =
        employeeRepository.findAll()

}