package app.infrastructure

import app.domain.model.Customer
import app.domain.repository.CustomerRepository
import app.infrastructure.doma.dao.CustomerDomaDao
import app.infrastructure.doma.entity.CustomerDomaEntity
import org.springframework.stereotype.Repository

@Repository
class CustomerRepositoryDomaImpl(
    private val customerDomaDao: CustomerDomaDao
) : CustomerRepository {
    override fun findAll(): List<Customer> {
        return customerDomaDao.selectAll().map { mapToModel(it) }
    }

    private fun mapToModel(domainEntity: CustomerDomaEntity): Customer {
        return Customer(
            id = domainEntity.id,
            name = domainEntity.name,
            email = domainEntity.email
        )
    }
}