package com.example.domain

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface AuthorRepository : CrudRepository<Author, Long>
