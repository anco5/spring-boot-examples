package app.infrastructure

import app.domain.model.Employee
import app.domain.repository.EmployeeRepository
import app.infrastructure.doma.dao.EmployeeEntityDao
import app.infrastructure.doma.entity.EmployeeEntity
import org.springframework.stereotype.Repository

@Repository
class EmployeeRepositoryDaoImpl(
    private val employeeEntityDao: EmployeeEntityDao
) : EmployeeRepository {
    override fun findAll(): List<Employee> {
        return employeeEntityDao.selectAll().map { _MapToModel(it) }
    }

    private fun _MapToModel(employeeEntity: EmployeeEntity) =
        Employee(
            id = employeeEntity.id,
            name = employeeEntity.name,
            email = employeeEntity.email
        )
}