package app.domain.repository

import app.domain.model.Customer

interface CustomerRepository {
    fun findAll(): List<Customer>
}