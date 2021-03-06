package com.example.controller

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class AuthorControllerSpec {

    @Inject
    lateinit var client: AuthorClient

    @Test
    fun testHelloWorldResponse() {
        Assertions.assertEquals("Hello World", client.index().blockingGet())
    }
}
