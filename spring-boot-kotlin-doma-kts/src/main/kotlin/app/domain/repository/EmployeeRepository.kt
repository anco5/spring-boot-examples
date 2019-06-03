package app.domain.repository

import app.domain.model.Employee

interface EmployeeRepository {
    fun findAll(): List<Employee>
}